package com.example.errorhandling.retrofit

import com.google.gson.annotations.SerializedName

data class PostDataItem(

    @SerializedName("id")
    var id: Int = 0,

    @SerializedName("userId")
    var userId: Int = 0,

    @SerializedName("title")
    var title: String = "",

    @SerializedName("body")
    var body: String = "",

    )
