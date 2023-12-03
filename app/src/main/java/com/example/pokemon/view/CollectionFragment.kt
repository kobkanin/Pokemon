package com.example.pokemon.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.pokemon.adapter.PokemonAdapter
import com.example.pokemon.databinding.FragmentCollectionBinding
import mockPokemonList

class CollectionFragment : Fragment() {

    private lateinit var binding: FragmentCollectionBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentCollectionBinding.inflate(layoutInflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindView(binding)
    }

    private fun bindView(binding: FragmentCollectionBinding) {
        val pokemonAdapter = PokemonAdapter(pokemon = mockPokemonList())
        binding.pokemonRecycleView.adapter = pokemonAdapter
    }

    companion object {}
}