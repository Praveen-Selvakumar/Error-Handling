package com.example.errorhandling.retrofit

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.errorhandling.R
import com.google.gson.Gson
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RetrofitActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //loadList()

        loadFromService()

    }

    private fun loadFromService(){
        val client: ApiiInterface =
            RetrofitClient.getRetrofitInstance()?.create(ApiiInterface::class.java)  as ApiiInterface

        CommonServiceCall.invokeTheCall(client.getUsers()){ pair ->
            if (!pair.first.isNullOrEmpty()){
                Log.d("//dev", " Response Success ")
            }else{
                Log.d("//dev", " Response Failed ")
            }
        }
    }

    private fun loadList() {

        val client: ApiiInterface =
            RetrofitClient.getRetrofitInstance()?.create(ApiiInterface::class.java)  as ApiiInterface


        client.getUsers().enqueue(object : Callback<List<PostDataItem>> {
            override fun onResponse(
                call: Call<List<PostDataItem>>?,
                response: Response<List<PostDataItem>>?
            ) {
                if (response?.code() == 200) {
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


}