package com.mbinfo.huge.data.model


import com.google.gson.annotations.SerializedName

data class Sms(
    @SerializedName("message")
    val message: String,
    @SerializedName("status")
    val status: Int
)