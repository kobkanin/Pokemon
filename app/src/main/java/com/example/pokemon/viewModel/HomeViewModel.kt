package com.example.pokemon.viewModel

import Pokemon
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pokemon.repository.PokemonRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel() {

    private val _uiState = MutableSharedFlow<Pokemon>()
    val uiState: SharedFlow<Pokemon> = _uiState.asSharedFlow()

    fun getPokemon() {
        viewModelScope.launch {
            repository.getPokemon()
                .flowOn(Dispatchers.IO)
                .catch { Log.e(HomeViewModel::class.simpleName, "Error") }
                .collect {
                    _uiState.emit(it)
                }
        }
    }
}