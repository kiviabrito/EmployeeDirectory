package com.kiviabrito.employeedirectory.data.model

enum class APIAddressEnum(val address: String) {
    DEFAULT("employees.json"),
    ERROR("employees_malformed.json"),
    EMPTY("employees_empty.json");

    companion object {
        private val map = values().associateBy(APIAddressEnum::address)
        fun fromValue(value: String?) = value?.let { map[it] }
    }
}