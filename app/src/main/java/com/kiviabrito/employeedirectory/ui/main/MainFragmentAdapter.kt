package com.kiviabrito.employeedirectory.ui.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kiviabrito.employeedirectory.data.model.EmployeeDTO
import com.kiviabrito.employeedirectory.databinding.MainFragmentEmployeeItemBinding
import com.kiviabrito.employeedirectory.utils.GlideApp

class MainFragmentAdapter(
    private var items : List<EmployeeDTO>
) : RecyclerView.Adapter<MainFragmentAdapter.EmployeeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmployeeViewHolder {
        val binding = MainFragmentEmployeeItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent, false
        )
        return EmployeeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: EmployeeViewHolder, position: Int) {
        items.getOrNull(position)?.let { item ->
            holder.bindView(item)
        }
    }

    override fun getItemCount(): Int = items.count()

    fun setItems(newList: List<EmployeeDTO>){
        items = newList.sortedBy { it.fullName }
        notifyDataSetChanged()
    }

    inner class EmployeeViewHolder(
        private val binding: MainFragmentEmployeeItemBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bindView(item: EmployeeDTO){
            binding.apply {
                GlideApp.with(root.context)
                    .load(item.photoUrlSmall)
                    .circleCrop()
                    .into(employeePhoto)
                employeeName.text = item.fullName
                employeeTeam.text = item.team
            }
        }
    }

}