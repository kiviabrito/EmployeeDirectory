package com.kiviabrito.employeedirectory.ui.main

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.google.common.truth.Truth.assertThat
import com.kiviabrito.employeedirectory.MainCoroutineRule
import com.kiviabrito.employeedirectory.data.model.APIAddressEnum
import com.kiviabrito.employeedirectory.data.model.EmployeeDTO
import com.kiviabrito.employeedirectory.data.repository.FakeEmployeeRepository
import com.kiviabrito.employeedirectory.getOrAwaitValueTest
import com.kiviabrito.employeedirectory.utils.DataState
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.Before
import org.junit.Rule
import org.junit.Test

@ExperimentalCoroutinesApi
class MainViewModelTest {

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @get:Rule
    var mainCoroutineRule = MainCoroutineRule()

    private lateinit var viewModel: MainViewModel

    @Before
    fun setup() {
        viewModel = MainViewModel(FakeEmployeeRepository())
    }

    @Test
    fun `get default list, set success employees`() {
        viewModel.getEmployeeList(APIAddressEnum.DEFAULT)
        val value = viewModel.employees.getOrAwaitValueTest()
        assertThat(value).isEqualTo(FakeEmployeeRepository.defaultList.employees)
    }

    @Test
    fun `get error list, set error msg`() {
        viewModel.getEmployeeList(APIAddressEnum.ERROR)
        val value = viewModel.error.getOrAwaitValueTest().get()
        assertThat(value).isEqualTo(FakeEmployeeRepository.ERROR_MSG)
    }

    @Test
    fun `get empty list, set success empty employees`() {
        viewModel.getEmployeeList(APIAddressEnum.EMPTY)
        val value = viewModel.employees.getOrAwaitValueTest()
        assertThat(value).isEqualTo(FakeEmployeeRepository.emptyList.employees)
    }

    @Test
    fun `handle data state success, set success empty employees`() {
        val dataState : DataState<List<EmployeeDTO>> = DataState.Success(FakeEmployeeRepository.defaultList.employees)
        viewModel.handleDataState(dataState)
        val value = viewModel.employees.getOrAwaitValueTest()
        assertThat(value).isEqualTo(FakeEmployeeRepository.defaultList.employees)
    }

    @Test
    fun `handle data state error, set error msg`() {
        val dataState : DataState<List<EmployeeDTO>> = DataState.Error(FakeEmployeeRepository.ERROR_MSG)
        viewModel.handleDataState(dataState)
        val value = viewModel.error.getOrAwaitValueTest().get()
        assertThat(value).isEqualTo(FakeEmployeeRepository.ERROR_MSG)
    }

    @Test
    fun `handle data state success empty, set success empty employees`() {
        val dataState : DataState<List<EmployeeDTO>> = DataState.Success(FakeEmployeeRepository.emptyList.employees)
        viewModel.handleDataState(dataState)
        val value = viewModel.employees.getOrAwaitValueTest()
        assertThat(value).isEqualTo(FakeEmployeeRepository.emptyList.employees)
    }
}