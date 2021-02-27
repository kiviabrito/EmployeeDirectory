package com.kiviabrito.employeedirectory.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/kiviabrito/employeedirectory/ui/main/Main;", "", "ViewModel", "app_debug"})
public abstract interface Main {
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001c\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH&\u00a8\u0006\u000b"}, d2 = {"Lcom/kiviabrito/employeedirectory/ui/main/Main$ViewModel;", "", "getEmployeeList", "", "apiAddress", "Lcom/kiviabrito/employeedirectory/data/model/APIAddressEnum;", "handleDataState", "dataState", "Lcom/kiviabrito/employeedirectory/utils/DataState;", "", "Lcom/kiviabrito/employeedirectory/data/model/EmployeeDTO;", "app_debug"})
    public static abstract interface ViewModel {
        
        public abstract void getEmployeeList(@org.jetbrains.annotations.NotNull()
        com.kiviabrito.employeedirectory.data.model.APIAddressEnum apiAddress);
        
        public abstract void handleDataState(@org.jetbrains.annotations.NotNull()
        com.kiviabrito.employeedirectory.utils.DataState<? extends java.util.List<com.kiviabrito.employeedirectory.data.model.EmployeeDTO>> dataState);
    }
}