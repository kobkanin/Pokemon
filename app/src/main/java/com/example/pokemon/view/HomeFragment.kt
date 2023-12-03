package com.example.pokemon.view

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.pokemon.PokemonCollectionActivity
import com.example.pokemon.PokemonDetailActivity
import com.example.pokemon.databinding.FragmentHomeBinding
import com.example.pokemon.model.Trainer

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView(binding)
    }

    private fun initView(binding:  FragmentHomeBinding) {
        bindPokeBall(binding)
        bindBagPack(binding)
    }

    private fun bindPokeBall(binding: FragmentHomeBinding) {
        binding.pokemonBall.apply {

            setOnClickListener {
                val intent = Intent(this.context, PokemonDetailActivity::class.java)
                intent.putExtra(Trainer.TRAINER_NAME, "KOB")
                startActivity(intent)
            }
        }
    }

    private fun bindBagPack(binding: FragmentHomeBinding) {
        binding.backpack.apply {
            this.setOnClickListener {
                val intent = Intent(this.context, PokemonCollectionActivity::class.java)
                startActivity(intent)
            }
        }
    }

    companion object {

    }
}