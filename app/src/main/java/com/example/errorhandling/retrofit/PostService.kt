package com.example.errorhandling.retrofit

import android.util.Log
import com.google.gson.Gson
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object PostService {

    private val client: ApiiInterface =
        RetrofitClient.getRetrofitInstance()?.create(ApiiInterface::class.java) as ApiiInterface



  /*   fun <T> loadData(responsePair : (Pair<T, String>) -> Unit) {
        client.getUsers().enqueue(object : Callback<List<PostDataItem>> {
            override fun onResponse(
                call: Call<List<PostDataItem>>?,
                response: Response<List<PostDataItem>>?
            ) {
                if (response?.code() == 200) {
                    responsePair.invoke( Pair(  response.body()  , ""))
                    Log.d("//dev", "onResponse: ${Gson().toJson(response.body())} ")
                }
            }

            override fun onFailure(call: Call<List<PostDataItem>>?, t: Throwable?) {
                try {
                    Log.d("Error:", "onFailure: ${t?.message} ")
                } catch (e: Exception) {

                }
            }

        })
    }

      */

}