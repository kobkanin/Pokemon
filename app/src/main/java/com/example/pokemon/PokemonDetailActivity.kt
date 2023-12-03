package com.example.pokemon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pokemon.databinding.ActivityPokemonCollectionBinding

class PokemonDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPokemonCollectionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPokemonCollectionBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}