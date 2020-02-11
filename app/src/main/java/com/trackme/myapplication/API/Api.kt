package simplifiedcoding.net.kotlinretrofittutorial.api

import com.trackme.myapplication.Model.Responsedata
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST


interface Api {
    @FormUrlEncoded
    @POST("post")
    fun post(
            @Field("foo1") foo1:String,
            @Field("foo2") foo2: String
    ):Call<Responsedata>
}