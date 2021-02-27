package com.kiviabrito.employeedirectory.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J#\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Lcom/kiviabrito/employeedirectory/data/api/EmployeeService;", "", "getEmployeeList", "Lretrofit2/Response;", "Lcom/kiviabrito/employeedirectory/data/model/EmployeeListDTO;", "apiAddress", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface EmployeeService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "{apiAddress}")
    public abstract java.lang.Object getEmployeeList(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "apiAddress")
    java.lang.String apiAddress, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.kiviabrito.employeedirectory.data.model.EmployeeListDTO>> p1);
}