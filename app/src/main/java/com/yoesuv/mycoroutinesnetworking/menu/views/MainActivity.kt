package com.yoesuv.mycoroutinesnetworking.menu.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.yoesuv.mycoroutinesnetworking.R
import com.yoesuv.mycoroutinesnetworking.databinding.ActivityMainBinding
import com.yoesuv.mycoroutinesnetworking.menu.viewmodels.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        binding.main = viewModel
    }
}
