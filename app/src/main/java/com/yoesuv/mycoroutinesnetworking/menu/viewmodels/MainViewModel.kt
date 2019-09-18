package com.yoesuv.mycoroutinesnetworking.menu.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.yoesuv.mycoroutinesnetworking.networks.ServiceFactory
import com.yoesuv.mycoroutinesnetworking.utils.logDebug
import com.yoesuv.mycoroutinesnetworking.utils.logError
import kotlinx.coroutines.launch
import java.lang.Exception

class MainViewModel(application: Application) : AndroidViewModel(application) {

    private val restApi = ServiceFactory.create()

    fun getListPlace() {
        viewModelScope.launch {
            try {
                val result = restApi.getListPlace()
                if (result.isSuccessful) {
                    logDebug("MainViewModel # SUCCESS ${result.body()?.size}")
                } else {
                    logError("MainViewModel # NOT SUCCESS ${result.code()}/${result.message()}")
                }
            } catch (exception: Exception) {
                logError("MainViewModel # error ${exception.message}")
                exception.printStackTrace()
            }
        }
    }
}