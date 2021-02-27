package com.kiviabrito.employeedirectory.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kiviabrito.employeedirectory.data.model.APIAddressEnum
import com.kiviabrito.employeedirectory.data.model.EmployeeDTO
import com.kiviabrito.employeedirectory.data.repository.EmployeeRepository
import com.kiviabrito.employeedirectory.utils.DataState
import com.kiviabrito.employeedirectory.utils.SingleEventWrapper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainViewModel(
    private val repository: EmployeeRepository
) : ViewModel(), Main.ViewModel {

    private val _employees = MutableLiveData<List<EmployeeDTO>>()
    val employees: LiveData<List<EmployeeDTO>> = _employees

    private val _error = MutableLiveData<SingleEventWrapper<String>>()
    val error: LiveData<SingleEventWrapper<String>> = _error

    private val _loading = MutableLiveData<SingleEventWrapper<Boolean>>()
    val loading: LiveData<SingleEventWrapper<Boolean>> = _loading

    override fun getEmployeeList(apiAddress: APIAddressEnum) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.getEmployeeList(apiAddress)
                .collect { dataState ->
                    withContext(Dispatchers.Main) {
                        handleDataState(dataState)
                    }
                }
        }
    }

    override fun handleDataState(dataState: DataState<List<EmployeeDTO>>) {
        when (dataState) {
            is DataState.Success<List<EmployeeDTO>> -> {
                _loading.postValue(SingleEventWrapper(false))
                dataState.data.let { employees ->
                    _employees.postValue(employees)
                }
            }
            is DataState.Error -> {
                _loading.postValue(SingleEventWrapper(false))
                _error.postValue(SingleEventWrapper(dataState.errorMsg))
            }
            is DataState.Loading -> {
                _loading.postValue(SingleEventWrapper(true))
            }
        }
    }

}