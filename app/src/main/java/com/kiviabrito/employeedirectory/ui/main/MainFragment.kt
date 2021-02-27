package com.kiviabrito.employeedirectory.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.kiviabrito.employeedirectory.databinding.MainFragmentBinding
import com.kiviabrito.employeedirectory.utils.ViewUtils.setIsVisible
import org.koin.androidx.viewmodel.ext.android.sharedViewModel

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private val viewModel : MainViewModel by sharedViewModel()
    private lateinit var binding : MainFragmentBinding
    private val adapter : MainFragmentAdapter by lazy { MainFragmentAdapter(listOf()) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = MainFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setView()
        setObserver()
    }

    private fun setView() {
        binding.employeeList.adapter = adapter
    }

    private fun setObserver() {
        viewModel.employees.observe(viewLifecycleOwner, { data ->
            binding.apply {
                gpEmptyList.setIsVisible(data.isEmpty())
                employeeList.setIsVisible(data.isNotEmpty())
                adapter.setItems(data)
            }
        })
        viewModel.error.observe(viewLifecycleOwner, { singleEvent ->
            singleEvent.get()?.let { errorMsg ->
                Toast.makeText(requireContext(), errorMsg, Toast.LENGTH_LONG).show()
            }
        })
    }

}