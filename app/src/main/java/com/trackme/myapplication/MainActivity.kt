package com.trackme.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.trackme.myapplication.Model.Responsedata
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import simplifiedcoding.net.kotlinretrofittutorial.api.RetrofitClient

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickVal(view: View) {

        RetrofitClient.instance.post("bar1","bar2")
            .enqueue(object: Callback<Responsedata> {
                override fun onFailure(call: Call<Responsedata>, t: Throwable) {
                    Toast.makeText(applicationContext, t.message, Toast.LENGTH_LONG).show()
                }

                override fun onResponse(call: Call<Responsedata>, response: Response<Responsedata>) {
                    Toast.makeText(applicationContext, response.body()?.toString(), Toast.LENGTH_LONG).show()
                    Log.v("ssssss",response.body().toString())
                }

            })
    }
}
