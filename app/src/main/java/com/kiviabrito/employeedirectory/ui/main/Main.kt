package com.kiviabrito.employeedirectory.ui.main

import com.kiviabrito.employeedirectory.data.model.APIAddressEnum
import com.kiviabrito.employeedirectory.data.model.EmployeeDTO
import com.kiviabrito.employeedirectory.utils.DataState

interface Main {

    interface ViewModel {
        fun getEmployeeList(apiAddress: APIAddressEnum)
        fun handleDataState(dataState: DataState<List<EmployeeDTO>>)
    }

}