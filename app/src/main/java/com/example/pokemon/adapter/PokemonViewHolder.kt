package com.example.pokemon.adapter

import Pokemon
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.util.Log
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.pokemon.databinding.PokemonCardItemBinding
import java.io.IOException
import java.net.HttpURLConnection
import java.net.URL


class PokemonViewHolder(
    private val binding: PokemonCardItemBinding
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(pokemon: Pokemon) {
        bindImage(pokemon)
        bindPokemonNo(pokemon)
        bindPokemonName(pokemon)
        bindPokemonType(pokemon)
    }

    private fun bindPokemonNo(pokemon: Pokemon) {
        binding.pokemonNo.apply {
            text = addLeadingZeros(pokemon.id)
        }
    }

    private fun addLeadingZeros(number: Int): String {
        return String.format("%03d", number)
    }

    private fun bindImage(pokemon: Pokemon) {
        binding.pokemonPlaceholder.apply {
            loadImage(pokemon.imageUrl)
        }
    }

    private fun ImageView.loadImage(url: String) {
        Glide.with(this).load(url).centerCrop().into(this)
    }


    private fun bindPokemonName(pokemon: Pokemon) {
        binding.pokemonName.apply {
            text = pokemon.name.english
        }
    }

    private fun bindPokemonType(pokemon: Pokemon) {
        val adapter = PokemonTypeAdapter(type = pokemon.type)
        binding.pokemonTypeRecycleView.adapter = adapter
    }
}