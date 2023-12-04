package com.example.pokemon.repository

import Pokemon
import com.example.pokemon.api.PokemonApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

interface PokemonRepository {
    suspend fun getPokemon(): Flow<Pokemon>
    suspend fun getPokemonList(): Flow<List<Pokemon>>
}

class PokemonRepositoryImpl @Inject constructor(
    private val pokemonApi: PokemonApi
) : PokemonRepository {
    override suspend fun getPokemon(): Flow<Pokemon> {
        val response = pokemonApi.getPokemonList()
        return if (response.isSuccessful) {
            val pokemon = response.body()?.random()
            return if (pokemon == null) {
                flow { throw Exception() }
            } else {
                flow { emit(pokemon) }
            }
        } else {
            flow { throw Exception() }
        }
    }

    override suspend fun getPokemonList(): Flow<List<Pokemon>> {
        val response = pokemonApi.getPokemonList()
        return if (response.isSuccessful) {
            val pokemon = response.body()
            return if (pokemon == null) {
                flow { throw Exception() }
            } else {
                flow { emit(pokemon) }
            }
        } else {
            flow { throw Exception() }
        }
    }
}