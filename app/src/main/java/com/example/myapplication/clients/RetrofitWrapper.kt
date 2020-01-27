package com.example.myapplication.clients

import android.content.Context
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RetrofitWrapper<T>(var callback:Callback<T>) : Callback<T>{
    override fun onFailure(call: Call<T>, t: Throwable) {
        callback.onFailure(call,t)

    }

    override fun onResponse(call: Call<T>, response: Response<T>) {
        response.code()
        callback.onResponse(call,response)
    }
}