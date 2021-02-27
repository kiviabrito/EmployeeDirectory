package com.kiviabrito.employeedirectory.data.repository

import com.kiviabrito.employeedirectory.data.model.APIAddressEnum
import com.kiviabrito.employeedirectory.data.model.EmployeeDTO
import com.kiviabrito.employeedirectory.data.model.EmployeeListDTO
import com.kiviabrito.employeedirectory.utils.DataState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class FakeEmployeeRepository : EmployeeRepository {

    companion object {
        val defaultList = EmployeeListDTO(
            employees = listOf(
                EmployeeDTO(
                    uuid = "uuid",
                    fullName = "fullName",
                    phoneNumber = "phoneNumber",
                    email = "email",
                    biography = "biography",
                    photoUrlSmall = "photoUrlSmall",
                    photoUrlLarge = "photoUrlLarge",
                    team = "team",
                    employeeType = "employeeType"
                )
            )
        )

        val emptyList = EmployeeListDTO(employees = listOf())

        const val ERROR_MSG = "Error msg"

    }

    override suspend fun getEmployeeList(apiAddress: APIAddressEnum): Flow<DataState<List<EmployeeDTO>>> = flow {
        when (apiAddress) {
            APIAddressEnum.DEFAULT -> {
                emit(DataState.Success(defaultList.employees))
            }
            APIAddressEnum.ERROR -> {
                emit(DataState.Error(ERROR_MSG))
            }
            APIAddressEnum.EMPTY -> {
                emit(DataState.Success(emptyList.employees))
            }
        }
    }

}











