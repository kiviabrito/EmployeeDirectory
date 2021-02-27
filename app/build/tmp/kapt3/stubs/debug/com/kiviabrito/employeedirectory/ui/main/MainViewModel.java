package com.kiviabrito.employeedirectory.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u001c\u0010\u001b\u001a\u00020\u00182\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u001dH\u0016R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u001d\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/kiviabrito/employeedirectory/ui/main/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/kiviabrito/employeedirectory/ui/main/Main$ViewModel;", "repository", "Lcom/kiviabrito/employeedirectory/data/repository/EmployeeRepository;", "(Lcom/kiviabrito/employeedirectory/data/repository/EmployeeRepository;)V", "_employees", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/kiviabrito/employeedirectory/data/model/EmployeeDTO;", "_error", "Lcom/kiviabrito/employeedirectory/utils/SingleEventWrapper;", "", "_loading", "", "employees", "Landroidx/lifecycle/LiveData;", "getEmployees", "()Landroidx/lifecycle/LiveData;", "error", "getError", "loading", "getLoading", "getEmployeeList", "", "apiAddress", "Lcom/kiviabrito/employeedirectory/data/model/APIAddressEnum;", "handleDataState", "dataState", "Lcom/kiviabrito/employeedirectory/utils/DataState;", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel implements com.kiviabrito.employeedirectory.ui.main.Main.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.kiviabrito.employeedirectory.data.model.EmployeeDTO>> _employees = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.kiviabrito.employeedirectory.data.model.EmployeeDTO>> employees = null;
    private final androidx.lifecycle.MutableLiveData<com.kiviabrito.employeedirectory.utils.SingleEventWrapper<java.lang.String>> _error = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.kiviabrito.employeedirectory.utils.SingleEventWrapper<java.lang.String>> error = null;
    private final androidx.lifecycle.MutableLiveData<com.kiviabrito.employeedirectory.utils.SingleEventWrapper<java.lang.Boolean>> _loading = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.kiviabrito.employeedirectory.utils.SingleEventWrapper<java.lang.Boolean>> loading = null;
    private final com.kiviabrito.employeedirectory.data.repository.EmployeeRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.kiviabrito.employeedirectory.data.model.EmployeeDTO>> getEmployees() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.kiviabrito.employeedirectory.utils.SingleEventWrapper<java.lang.String>> getError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.kiviabrito.employeedirectory.utils.SingleEventWrapper<java.lang.Boolean>> getLoading() {
        return null;
    }
    
    @java.lang.Override()
    public void getEmployeeList(@org.jetbrains.annotations.NotNull()
    com.kiviabrito.employeedirectory.data.model.APIAddressEnum apiAddress) {
    }
    
    @java.lang.Override()
    public void handleDataState(@org.jetbrains.annotations.NotNull()
    com.kiviabrito.employeedirectory.utils.DataState<? extends java.util.List<com.kiviabrito.employeedirectory.data.model.EmployeeDTO>> dataState) {
    }
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.kiviabrito.employeedirectory.data.repository.EmployeeRepository repository) {
        super();
    }
}