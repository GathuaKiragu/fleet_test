package com.test.fleet_app.network.data.domain

import com.test.fleet_app.network.data.domain.item.PokemonItem
import com.test.fleet_app.network.repo.PokemonRepo
import javax.inject.Inject

class GetProductsUseCase @Inject constructor(
    private val productRepository: PokemonRepo
){
    suspend operator fun invoke(): List<PokemonItem> {
        return productRepository.getPokemons()

    }
}