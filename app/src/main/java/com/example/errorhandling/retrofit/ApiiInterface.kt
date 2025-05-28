package com.example.errorhandling.retrofit

import retrofit2.Call
import retrofit2.http.GET




interface ApiiInterface {

    @GET("posts")
    fun getUsers(): Call<List<PostDataItem>>

}