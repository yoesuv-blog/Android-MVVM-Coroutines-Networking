package com.yoesuv.mycoroutinesnetworking.menu.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.yoesuv.mycoroutinesnetworking.R
import com.yoesuv.mycoroutinesnetworking.databinding.ActivityMainBinding
import com.yoesuv.mycoroutinesnetworking.menu.adapters.ListPlaceAdapter
import com.yoesuv.mycoroutinesnetworking.menu.viewmodels.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    private lateinit var listPlaceAdapter: ListPlaceAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        binding.main = viewModel

        setupRecyclerView()
        observeLiveData()

        viewModel.getListPlace()
    }

    private fun observeLiveData() {
        viewModel.liveDataListPlace.observe(this, Observer {
            listPlaceAdapter.submitList(it)
        })
    }

    private fun setupRecyclerView() {
        val lManager = LinearLayoutManager(this)
        binding.recyclerViewMain.layoutManager = lManager
        listPlaceAdapter = ListPlaceAdapter()
        binding.recyclerViewMain.adapter = listPlaceAdapter
    }
}
