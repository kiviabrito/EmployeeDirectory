package com.kiviabrito.employeedirectory.ui.main

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.kiviabrito.employeedirectory.R
import com.kiviabrito.employeedirectory.data.model.APIAddressEnum
import com.kiviabrito.employeedirectory.databinding.MainActivityBinding
import com.kiviabrito.employeedirectory.utils.ViewUtils.setIsVisible
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity(){

    private lateinit var binding: MainActivityBinding
    private val viewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        loadFirstFragment(savedInstanceState)
        setObserver()
    }

    private fun loadFirstFragment(savedInstanceState: Bundle?) {
        if (savedInstanceState == null) {
            viewModel.getEmployeeList(APIAddressEnum.DEFAULT)
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }

    private fun setObserver() {
        viewModel.loading.observe(this, {
            it.get()?.let { shouldShowLoading ->
                showLoading(shouldShowLoading)
            }
        })
    }

    private fun showLoading(shouldShow: Boolean) {
        binding.apply {
            progressBar.setIsVisible(shouldShow)
            progressBarBackground.setIsVisible(shouldShow)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.btnDefault -> {
            viewModel.getEmployeeList(APIAddressEnum.DEFAULT)
            true
        }
        R.id.btnError -> {
            viewModel.getEmployeeList(APIAddressEnum.ERROR)
            true
        }
        R.id.btnEmpty -> {
            viewModel.getEmployeeList(APIAddressEnum.EMPTY)
            true
        }
        else -> {
            super.onOptionsItemSelected(item)
        }
    }

}