package com.example.pokemon.api

import Pokemon
import retrofit2.Response
import retrofit2.http.GET
import javax.inject.Inject

interface PokemonApi {
    @GET("pokemons")
    suspend fun getPokemonList(): Response<List<Pokemon>>
}