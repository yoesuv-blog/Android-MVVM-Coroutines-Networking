package com.yoesuv.mycoroutinesnetworking.menu.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.yoesuv.mycoroutinesnetworking.R
import com.yoesuv.mycoroutinesnetworking.databinding.ItemPlaceBinding
import com.yoesuv.mycoroutinesnetworking.menu.models.PlaceModel
import com.yoesuv.mycoroutinesnetworking.menu.viewmodels.ItemPlaceViewModel

class ListPlaceAdapter: ListAdapter<PlaceModel, ListPlaceAdapter.PlaceViewHolder>(DIFF_CALLBACK) {

    companion object {
        val DIFF_CALLBACK = object : DiffUtil.ItemCallback<PlaceModel>() {
            override fun areContentsTheSame(oldItem: PlaceModel, newItem: PlaceModel): Boolean  {
                return oldItem == newItem
            }
            override fun areItemsTheSame(oldItem: PlaceModel, newItem: PlaceModel): Boolean {
                return oldItem.name == newItem.name
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaceViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding: ItemPlaceBinding = DataBindingUtil.inflate(inflater, R.layout.item_place, parent, false)
        return PlaceViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PlaceViewHolder, position: Int) {
        holder.bindData(getItem(holder.adapterPosition))
    }

    class PlaceViewHolder(private val binding: ItemPlaceBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bindData(placeModel: PlaceModel) {
            binding.itemPlace =  ItemPlaceViewModel(placeModel)
            binding.executePendingBindings()
        }
    }
}