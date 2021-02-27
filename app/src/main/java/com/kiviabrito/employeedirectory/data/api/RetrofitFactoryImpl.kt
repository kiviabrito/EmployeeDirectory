package com.kiviabrito.employeedirectory.data.api

import android.util.Log
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitFactoryImpl : RetrofitFactory {

    private val baseUrl = "https://s3.amazonaws.com/sq-mobile-interview/"

    private val client =
        OkHttpClient
            .Builder()
            .addInterceptor(HttpLoggingInterceptor().apply {
                level = HttpLoggingInterceptor.Level.BODY
            })
            .build()

    override val employeeService: EmployeeService =
        Retrofit
            .Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()
            .create(EmployeeService::class.java)

    init {
        Log.i(this::class.simpleName, this::employeeService.name)
    }

}