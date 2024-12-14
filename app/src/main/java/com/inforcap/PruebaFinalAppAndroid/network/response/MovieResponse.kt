package com.inforcap.PruebaFinalAppAndroid.network.response

import com.google.gson.annotations.SerializedName

data class MovieResponse(
    @SerializedName("id") val id: Int,
    @SerializedName("nombre") val name: String,
    @SerializedName("logo") val logo: String

)
