package com.example.myapplication.interfaces

import com.example.myapplication.util.Constants
import com.example.primus.model.MainModel
import retrofit2.Call
import retrofit2.http.GET

interface Services {

    @GET(Constants.END_POINTS)
    fun getDetail(): Call<MainModel>
}