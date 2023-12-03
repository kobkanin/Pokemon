package com.example.pokemon.adapter

import Pokemon
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.pokemon.databinding.PokemonCardItemBinding

class PokemonAdapter(
    val pokemon: List<Pokemon>
) : Adapter<PokemonViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = PokemonCardItemBinding.inflate(inflater, parent, false)
        return PokemonViewHolder(view)
    }

    override fun getItemCount(): Int = pokemon.size

    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
        holder.bind(pokemon[position])
    }
}