package com.example.myapplication.repository

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import com.example.myapplication.clients.RetrofitClient
import com.example.myapplication.clients.RetrofitWrapper
import com.example.myapplication.interfaces.Services
import com.example.primus.model.MainModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class repository {

    fun getDetail(context: Context): MutableLiveData<MainModel> {

        val detailResponse = MutableLiveData<MainModel>()

        /* RetrofitClient.client.create(ApiData::class.java).getDetail().enqueue(object : Callback<MainModel> {
             override fun onFailure(call: Call<MainModel>?, t: Throwable?) {
                 Log.d("TAG", t!!.message)
             }

             override fun onResponse(call: Call<MainModel>?, response: Response<MainModel>?) {
                 detailResponse.value = response?.body()
                 //check
                 Log.d("TAG", detailResponse.value?.getStatus())
             }
         })*/

        RetrofitClient.getService().getDetail()
            .enqueue(RetrofitWrapper(object : Callback<MainModel> {
                override fun onFailure(call: Call<MainModel>, t: Throwable) {
                    Toast.makeText(context, t.message.toString(), Toast.LENGTH_LONG).show()
                }

                override fun onResponse(call: Call<MainModel>, response: Response<MainModel>) {
                    detailResponse.value = response?.body()

                }


            }))
        return detailResponse


    }
}
