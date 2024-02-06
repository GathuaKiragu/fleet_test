package com.test.fleet_app.network.repo

import com.test.fleet_app.network.data.PokemonService
import com.test.fleet_app.network.data.domain.item.PokemonItem
import com.test.fleet_app.network.data.domain.item.toPokemonItem
import com.test.fleet_app.network.data.model.PokemonModel
import javax.inject.Inject

class PokemonRepo @Inject constructor(private val pokemonService: PokemonService) {
    suspend fun getPokemons(): List<PokemonItem> {
        return pokemonService.getPokemons().map {
            it.toPokemonItem()
        }
    }
}