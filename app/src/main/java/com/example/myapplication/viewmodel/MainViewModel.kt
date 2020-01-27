package com.example.myapplication.viewmodel


import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.myapplication.clients.RetrofitClient
import com.example.primus.model.MainModel
import com.example.primus.model.ResultModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel(application: Application) : AndroidViewModel(application), Callback<MainModel> {

    var data: MutableLiveData<ArrayList<ResultModel>>? = null
    init {
        data = MutableLiveData<ArrayList<ResultModel>>()
        getDetail()
    }
    fun getDetail(): MutableLiveData<ArrayList<ResultModel>>? {

        RetrofitClient.getService().getDetail().enqueue(this)
        return data
    }
    override fun onFailure(call: Call<MainModel>, t: Throwable) {
        Log.d("DetailResponse", t.message.toString())
    }
    override fun onResponse(call: Call<MainModel>, response: Response<MainModel>) {
        data?.value = response.body()?.getResults() as ArrayList<ResultModel>?

    }

}





