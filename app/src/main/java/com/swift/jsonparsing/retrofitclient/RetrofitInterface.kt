package com.swift.jsonparsing.retrofitclient

import com.swift.jsonparsing.PostModel
import retrofit2.Call
import retrofit2.http.GET

interface RetrofitInterface {

    @get:GET("posts")
    fun getPosts() Call<List<PostModel?>?>?
}