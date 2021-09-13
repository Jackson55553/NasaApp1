package com.example.nasaapp.ui.main.repository

import com.example.nasaapp.ui.main.data.NasaServerResponseData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NasaAPI {
    @GET("planetary/apod")
    fun getPictureOfTheDay(@Query("api_key") apiKey: String): Call<NasaServerResponseData>
}