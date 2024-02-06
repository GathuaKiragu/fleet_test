package com.test.fleet_app.network.data.domain.item

import com.test.fleet_app.network.data.model.PokemonModel
import com.test.fleet_app.network.data.model.Results

data class PokemonItem (
    val count: Int?,
    val next: String?,
    val previous: String?,
    val results: ArrayList<Results>

    )

fun PokemonModel.toPokemonItem() = PokemonItem(count, next, previous, results)