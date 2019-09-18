package com.yoesuv.mycoroutinesnetworking.networks

import com.yoesuv.mycoroutinesnetworking.menu.models.PlaceModel
import retrofit2.http.GET

interface RestApi {

    @GET("List_place_malang_batu.json")
    suspend fun getListPlace(): MutableList<PlaceModel>

}