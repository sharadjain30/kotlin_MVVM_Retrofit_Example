package com.example.primus.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



class MediaMetadatum {
    @SerializedName("url")
    @Expose
    private var url: String? = null
    @SerializedName("format")
    @Expose
    private var format: String? = null
    @SerializedName("height")
    @Expose
    private var height: Int? = null
    @SerializedName("width")
    @Expose
    private var width: Int? = null

    fun getUrl(): String? {
        return url
    }

    fun setUrl(url: String) {
        this.url = url
    }

    fun getFormat(): String? {
        return format
    }

    fun setFormat(format: String) {
        this.format = format
    }

    fun getHeight(): Int? {
        return height
    }

    fun setHeight(height: Int?) {
        this.height = height
    }

    fun getWidth(): Int? {
        return width
    }

    fun setWidth(width: Int?) {
        this.width = width
    }
}