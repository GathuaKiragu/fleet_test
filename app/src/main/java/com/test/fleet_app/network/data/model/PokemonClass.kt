package com.test.fleet_app.network.data.model

import com.google.gson.annotations.SerializedName


data class PokemonModel (

    @SerializedName("abilities"                ) var abilities              : ArrayList<Abilities>   = arrayListOf(),
    @SerializedName("base_experience"          ) var baseExperience         : Int?                   = null,
    @SerializedName("forms"                    ) var forms                  : ArrayList<Forms>       = arrayListOf(),
    @SerializedName("game_indices"             ) var gameIndices            : ArrayList<GameIndices> = arrayListOf(),
    @SerializedName("height"                   ) var height                 : Int?                   = null,
    @SerializedName("id"                       ) var id                     : Int?                   = null,
    @SerializedName("is_default"               ) var isDefault              : Boolean?               = null,
    @SerializedName("location_area_encounters" ) var locationAreaEncounters : String?                = null,
    @SerializedName("name"                     ) var name                   : String?                = null,
    @SerializedName("order"                    ) var order                  : Int?                   = null,
    @SerializedName("past_abilities"           ) var pastAbilities          : ArrayList<String>      = arrayListOf(),
    @SerializedName("past_types"               ) var pastTypes              : ArrayList<String>      = arrayListOf(),
    @SerializedName("weight"                   ) var weight                 : Int?                   = null

)