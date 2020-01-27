package com.example.myapplication.model

import com.example.primus.model.ResultModel

class ApiResponse {
    private var posts: List<ResultModel>?
    var error: Throwable?

    constructor(posts: List<ResultModel>?) {
        this.posts = posts
        error = null
    }

    constructor(error: Throwable?) {
        this.error = error
        posts = null
    }

    fun getPosts(): List<ResultModel>? {
        return posts
    }

    fun setPosts(posts: List<ResultModel>?) {
        this.posts = posts
    }

}