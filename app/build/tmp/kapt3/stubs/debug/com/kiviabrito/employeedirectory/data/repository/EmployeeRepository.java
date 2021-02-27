package com.kiviabrito.employeedirectory.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J+\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\u0006\u0010\u0007\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/kiviabrito/employeedirectory/data/repository/EmployeeRepository;", "", "getEmployeeList", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kiviabrito/employeedirectory/utils/DataState;", "", "Lcom/kiviabrito/employeedirectory/data/model/EmployeeDTO;", "apiAddress", "Lcom/kiviabrito/employeedirectory/data/model/APIAddressEnum;", "(Lcom/kiviabrito/employeedirectory/data/model/APIAddressEnum;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface EmployeeRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getEmployeeList(@org.jetbrains.annotations.NotNull()
    com.kiviabrito.employeedirectory.data.model.APIAddressEnum apiAddress, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.kiviabrito.employeedirectory.utils.DataState<? extends java.util.List<com.kiviabrito.employeedirectory.data.model.EmployeeDTO>>>> p1);
}