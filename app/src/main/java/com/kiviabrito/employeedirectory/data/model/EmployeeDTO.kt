package com.kiviabrito.employeedirectory.data.model

import com.google.gson.annotations.SerializedName

data class EmployeeDTO(
    @SerializedName("uuid")
    val uuid: String?,
    @SerializedName("full_name")
    val fullName: String?,
    @SerializedName("phone_number")
    val phoneNumber: String,
    @SerializedName("email_address")
    val email: String?,
    @SerializedName("biography")
    val biography: String,
    @SerializedName("photo_url_small")
    val photoUrlSmall: String,
    @SerializedName("photo_url_large")
    val photoUrlLarge: String,
    @SerializedName("team")
    val team: String?,
    @SerializedName("employee_type")
    val employeeType: String?
) {

    fun hasRequiredFields() = uuid != null &&
            fullName != null &&
            email != null &&
            team != null &&
            employeeType != null

    val employeeTypeEnum: EmployeeTypeEnum?
        get() = EmployeeTypeEnum.fromValue(employeeType)

    enum class EmployeeTypeEnum(val value: String) {
        FULL_TIME("FULL_TIME"),
        PART_TIME("PART_TIME"),
        CONTRACTOR("CONTRACTOR");

        companion object {
            private val map = values().associateBy(EmployeeTypeEnum::value)
            fun fromValue(value: String?) = value?.let { map[it] }
        }
    }

}
