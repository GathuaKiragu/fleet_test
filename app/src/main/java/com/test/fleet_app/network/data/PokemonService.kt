package com.test.fleet_app.network.data

import com.test.fleet_app.network.data.model.PokemonModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class PokemonService @Inject constructor(private val pokemonApi: PokemonApi){
    suspend fun getPokemons(): List<PokemonModel> {
        return withContext(Dispatchers.IO) {
            val pokemons = pokemonApi.getPokemons()
            pokemons.body() ?: emptyList()
        }
    }
}