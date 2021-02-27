package com.kiviabrito.employeedirectory.data.repository

import com.kiviabrito.employeedirectory.data.model.APIAddressEnum
import com.kiviabrito.employeedirectory.data.model.EmployeeDTO
import com.kiviabrito.employeedirectory.utils.DataState
import kotlinx.coroutines.flow.Flow

interface EmployeeRepository {

    suspend fun getEmployeeList(apiAddress: APIAddressEnum): Flow<DataState<List<EmployeeDTO>>>

}