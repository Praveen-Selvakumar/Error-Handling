package com.example.errorhandling.retrofit

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


object CommonServiceCall {

    private val client: ApiiInterface =
        RetrofitClient.getRetrofitInstance()?.create(ApiiInterface::class.java) as ApiiInterface

    fun <T> invokeTheCall(
        call: Call<T>,
        responsePair: (Pair<T?, String>) -> Unit
    )  {


        call.enqueue(object : Callback<T> {
            override fun onResponse(call: Call<T>?, response: Response<T>?) {
                if (response != null && response.isSuccessful) {
                    responsePair.invoke(Pair(response.body(), ""))
                } else {
                    responsePair.invoke(Pair(null, "Response not successful, try again later"))
                }


            }

            override fun onFailure(call: Call<T>?, t: Throwable?) {
                responsePair.invoke(
                    Pair(
                        null,
                        t?.message ?: "Something went wrong try again later"
                    )
                )
            }

        })


    }

}