package com.kiviabrito.employeedirectory.data.api

import com.kiviabrito.employeedirectory.data.model.EmployeeListDTO
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface EmployeeService {

    @GET("{apiAddress}")
    suspend fun getEmployeeList(@Path("apiAddress") apiAddress: String): Response<EmployeeListDTO?>

}