package com.example.nasaapp.ui.main.model

import com.example.nasaapp.ui.main.data.NasaServerResponseData

sealed class NasaData{
    data class Success(val serverResponseData: NasaServerResponseData) : NasaData()
    data class Error(val error: Throwable) : NasaData()
    data class Loading(val progress: Int?) : NasaData()
}