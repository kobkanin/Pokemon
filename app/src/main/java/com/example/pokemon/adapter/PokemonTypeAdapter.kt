package com.example.pokemon.adapter

import Pokemon
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.pokemon.databinding.PokemonTypeItemBinding

class PokemonTypeAdapter(
    val type: List<String>
) : Adapter<PokemonTypeViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonTypeViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = PokemonTypeItemBinding.inflate(inflater, parent, false)
        return PokemonTypeViewHolder(view)
    }

    override fun getItemCount(): Int = type.size

    override fun onBindViewHolder(holder: PokemonTypeViewHolder, position: Int) {
        holder.bind(type[position])
    }
}