package com.test.fleet_app.network.data

import com.test.fleet_app.network.data.model.PokemonModel
import com.test.fleet_app.utils.Constants.Companion.BASE_URL
import retrofit2.Response
import retrofit2.http.GET

interface PokemonApi {
    @GET(BASE_URL)
        suspend fun getPokemons(): Response<List<PokemonModel>>
}