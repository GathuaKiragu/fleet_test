package com.test.fleet_app.view_model

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.test.fleet_app.network.data.domain.GetProductsUseCase
import com.test.fleet_app.network.data.domain.item.PokemonItem
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    application: Application,
    private val getProductsUseCase: GetProductsUseCase
): AndroidViewModel(application) {

    private val _products = MutableStateFlow(emptyList<PokemonItem>())
    val products: StateFlow<List<PokemonItem>> get() = _products

    init {
        getProducts()
    }


    private fun getProducts() {
        viewModelScope.launch {
            try {
                val products = getProductsUseCase()
                _products.value = products
            } catch (_: Exception) {

            }
        }
    }

}