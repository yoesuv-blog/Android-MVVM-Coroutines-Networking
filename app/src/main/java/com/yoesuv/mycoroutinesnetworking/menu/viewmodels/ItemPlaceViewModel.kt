package com.yoesuv.mycoroutinesnetworking.menu.viewmodels

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import com.yoesuv.mycoroutinesnetworking.menu.models.PlaceModel

class ItemPlaceViewModel(placeModel: PlaceModel): ViewModel() {

    var name: ObservableField<String?> = ObservableField(placeModel.name)
    var location: ObservableField<String?> = ObservableField(placeModel.location)
    var imageUrl: ObservableField<String?> = ObservableField(placeModel.image)

}