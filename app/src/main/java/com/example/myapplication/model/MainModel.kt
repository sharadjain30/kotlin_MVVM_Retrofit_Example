package com.example.primus.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class MainModel {

    @SerializedName("status")
    @Expose
    private var status: String? = null
    @SerializedName("copyright")
    @Expose
    private var copyright: String? = null
    @SerializedName("num_results")
    @Expose
    private var numResults: Int? = null
    @SerializedName("results")
    @Expose
    private var resultModels: List<ResultModel>? = null

    fun getStatus(): String? {
        return status
    }

    fun setStatus(status: String) {
        this.status = status
    }

    fun getCopyright(): String? {
        return copyright
    }

    fun setCopyright(copyright: String) {
        this.copyright = copyright
    }

    fun getNumResults(): Int? {
        return numResults
    }

    fun setNumResults(numResults: Int?) {
        this.numResults = numResults
    }

    fun getResults(): List<ResultModel>? {
        return resultModels
    }

    fun setResults(results: List<ResultModel>) {
        this.resultModels = results
    }
}