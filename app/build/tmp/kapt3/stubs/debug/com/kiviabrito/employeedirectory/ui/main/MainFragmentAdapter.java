package com.kiviabrito.employeedirectory.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0013B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u001c\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\f\u001a\u00020\bH\u0016J\u001c\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0014\u0010\u0011\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/kiviabrito/employeedirectory/ui/main/MainFragmentAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/kiviabrito/employeedirectory/ui/main/MainFragmentAdapter$EmployeeViewHolder;", "items", "", "Lcom/kiviabrito/employeedirectory/data/model/EmployeeDTO;", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setItems", "newList", "EmployeeViewHolder", "app_debug"})
public final class MainFragmentAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.kiviabrito.employeedirectory.ui.main.MainFragmentAdapter.EmployeeViewHolder> {
    private java.util.List<com.kiviabrito.employeedirectory.data.model.EmployeeDTO> items;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.kiviabrito.employeedirectory.ui.main.MainFragmentAdapter.EmployeeViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.kiviabrito.employeedirectory.ui.main.MainFragmentAdapter.EmployeeViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.List<com.kiviabrito.employeedirectory.data.model.EmployeeDTO> newList) {
    }
    
    public MainFragmentAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.kiviabrito.employeedirectory.data.model.EmployeeDTO> items) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/kiviabrito/employeedirectory/ui/main/MainFragmentAdapter$EmployeeViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/kiviabrito/employeedirectory/databinding/MainFragmentEmployeeItemBinding;", "(Lcom/kiviabrito/employeedirectory/ui/main/MainFragmentAdapter;Lcom/kiviabrito/employeedirectory/databinding/MainFragmentEmployeeItemBinding;)V", "bindView", "", "item", "Lcom/kiviabrito/employeedirectory/data/model/EmployeeDTO;", "app_debug"})
    public final class EmployeeViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.kiviabrito.employeedirectory.databinding.MainFragmentEmployeeItemBinding binding = null;
        
        public final void bindView(@org.jetbrains.annotations.NotNull()
        com.kiviabrito.employeedirectory.data.model.EmployeeDTO item) {
        }
        
        public EmployeeViewHolder(@org.jetbrains.annotations.NotNull()
        com.kiviabrito.employeedirectory.databinding.MainFragmentEmployeeItemBinding binding) {
            super(null);
        }
    }
}