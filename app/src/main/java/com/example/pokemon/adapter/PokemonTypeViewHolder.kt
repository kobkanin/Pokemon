package com.example.pokemon.adapter

import android.graphics.Color
import androidx.recyclerview.widget.RecyclerView
import com.example.pokemon.databinding.PokemonTypeItemBinding

class PokemonTypeViewHolder(
    private val binding: PokemonTypeItemBinding
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(type: String) {
        bindType(type)
    }

    private fun bindType(type: String) {
        binding.pokemonType.apply {
            text = type
            setBackgroundColor(Color.parseColor(getTypeColorBackground(type)))
        }
    }

    private fun getTypeColorBackground(type: String): String {
        return when (type.lowercase()) {
            "fire" -> "#EE8130"
            "water" -> "#6390F0"
            "electric" -> "#F7D02C"
            "grass" -> "#7AC74C"
            "ice" -> "#96D9D6"
            "fighting" -> "#C22E28"
            "poison" -> "#C22E28"
            "ground" -> "#E2BF65"
            "flying" -> "#A98FF3"
            "psychic" -> "#F95587"
            "bug" -> "#A6B91A"
            "rock" -> "#B6A136"
            "ghost" -> "#735797"
            "dragon" -> "#6F35FC"
            "dark" -> "#705746"
            "steel" -> "#B7B7CE"
            "fairy" -> "#D685AD"
            else -> "#A8A77A" //normal
        }
    }
}