package com.kiviabrito.employeedirectory.utils;

import java.lang.System;

/**
 * Wrapper class to avoid value to be consumed more than once when using LiveData.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0004J\r\u0010\b\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001a\u00028\u0000X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0007\u00a8\u0006\n"}, d2 = {"Lcom/kiviabrito/employeedirectory/utils/SingleEventWrapper;", "T", "", "value", "(Ljava/lang/Object;)V", "isConsumed", "", "Ljava/lang/Object;", "get", "()Ljava/lang/Object;", "app_debug"})
public final class SingleEventWrapper<T extends java.lang.Object> {
    private boolean isConsumed = false;
    private final T value = null;
    
    @org.jetbrains.annotations.Nullable()
    public final T get() {
        return null;
    }
    
    public SingleEventWrapper(T value) {
        super();
    }
}