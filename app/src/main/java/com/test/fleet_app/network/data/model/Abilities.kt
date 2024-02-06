package com.test.fleet_app.network.data.model

import com.google.gson.annotations.SerializedName


data class Abilities (
    @SerializedName("name" ) var name : String? = null,
    @SerializedName("url"  ) var url  : String? = null
)