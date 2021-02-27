package com.kiviabrito.employeedirectory.data.repository

import com.kiviabrito.employeedirectory.data.api.RetrofitFactory
import com.kiviabrito.employeedirectory.data.model.APIAddressEnum
import com.kiviabrito.employeedirectory.data.model.EmployeeDTO
import com.kiviabrito.employeedirectory.utils.DataState
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class EmployeeRepositoryImpl(
    private val retrofitFactory: RetrofitFactory
) : EmployeeRepository {

    companion object {
        const val ERROR_INVALID_DTO = "Error: invalid DTO"
        const val ERROR_NULL_OBJ = "Error: Null obj"
        const val ERROR_EXCEPTION = "Error: "
        const val LOADING_DELAY = 2000L
    }

    override suspend fun getEmployeeList(apiAddress: APIAddressEnum): Flow<DataState<List<EmployeeDTO>>> = flow {
        emit(DataState.Loading)
        try {
            retrofitFactory.employeeService.getEmployeeList(apiAddress.address).apply {
                delay(LOADING_DELAY)
                if (isSuccessful) {
                    body()?.let { obj ->
                        if (obj.employees.find { !it.hasRequiredFields() } != null) {
                            emit(DataState.Error(ERROR_INVALID_DTO))
                        } else {
                            emit(DataState.Success(obj.employees))
                        }
                    } ?: emit(DataState.Error(ERROR_NULL_OBJ))
                } else {
                    emit(DataState.Error(ERROR_EXCEPTION + message()))
                }
            }
        } catch (e: Exception) {
            emit(DataState.Error(ERROR_EXCEPTION + e.message))
        }
    }

}