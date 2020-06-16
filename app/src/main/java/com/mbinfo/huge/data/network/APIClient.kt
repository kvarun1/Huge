package com.mbinfo.huge.data.network

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object APIClient {
    var retrofit: Retrofit? = null
    const val BASE_URL = ConstantValues.HUGE_URL
    var apiRequestsNet: ApiRequestNet? = null
    val netInstance: ApiRequestNet?
        get() {
            if (apiRequestsNet == null) {
                val okHttpClient = OkHttpClient().newBuilder()
                        .connectTimeout(100, TimeUnit.SECONDS)
                        .readTimeout(100, TimeUnit.SECONDS)
                        .writeTimeout(100, TimeUnit.SECONDS)
                        .build()
                retrofit = Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .client(okHttpClient)
                        .addConverterFactory(GsonConverterFactory.create())
                        .addCallAdapterFactory(CoroutineCallAdapterFactory())
                        .build()
            }
            apiRequestsNet = retrofit!!.create(ApiRequestNet::class.java)
            return apiRequestsNet
        }
}