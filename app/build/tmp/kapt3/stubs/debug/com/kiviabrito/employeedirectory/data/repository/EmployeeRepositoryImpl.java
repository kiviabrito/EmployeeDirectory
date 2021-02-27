package com.kiviabrito.employeedirectory.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J+\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/kiviabrito/employeedirectory/data/repository/EmployeeRepositoryImpl;", "Lcom/kiviabrito/employeedirectory/data/repository/EmployeeRepository;", "retrofitFactory", "Lcom/kiviabrito/employeedirectory/data/api/RetrofitFactory;", "(Lcom/kiviabrito/employeedirectory/data/api/RetrofitFactory;)V", "getEmployeeList", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kiviabrito/employeedirectory/utils/DataState;", "", "Lcom/kiviabrito/employeedirectory/data/model/EmployeeDTO;", "apiAddress", "Lcom/kiviabrito/employeedirectory/data/model/APIAddressEnum;", "(Lcom/kiviabrito/employeedirectory/data/model/APIAddressEnum;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public final class EmployeeRepositoryImpl implements com.kiviabrito.employeedirectory.data.repository.EmployeeRepository {
    private final com.kiviabrito.employeedirectory.data.api.RetrofitFactory retrofitFactory = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR_INVALID_DTO = "Error: invalid DTO";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR_NULL_OBJ = "Error: Null obj";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR_EXCEPTION = "Error: ";
    public static final long LOADING_DELAY = 2000L;
    @org.jetbrains.annotations.NotNull()
    public static final com.kiviabrito.employeedirectory.data.repository.EmployeeRepositoryImpl.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getEmployeeList(@org.jetbrains.annotations.NotNull()
    com.kiviabrito.employeedirectory.data.model.APIAddressEnum apiAddress, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.kiviabrito.employeedirectory.utils.DataState<? extends java.util.List<com.kiviabrito.employeedirectory.data.model.EmployeeDTO>>>> p1) {
        return null;
    }
    
    public EmployeeRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.kiviabrito.employeedirectory.data.api.RetrofitFactory retrofitFactory) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/kiviabrito/employeedirectory/data/repository/EmployeeRepositoryImpl$Companion;", "", "()V", "ERROR_EXCEPTION", "", "ERROR_INVALID_DTO", "ERROR_NULL_OBJ", "LOADING_DELAY", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}