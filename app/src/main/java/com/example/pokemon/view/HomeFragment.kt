package com.example.pokemon.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.pokemon.R
import com.example.pokemon.databinding.FragmentHomeBinding
import com.example.pokemon.viewModel.HomeViewModel

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    private val viewModel: HomeViewModel by viewModels()

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

    private fun initView(binding: FragmentHomeBinding) {
        bindPokeBall(binding)
        bindBagPack(binding)
    }

    private fun bindPokeBall(binding: FragmentHomeBinding) {
        binding.pokeBall.apply {
            setOnClickListener {
                viewModel.getPokemonList()
                redirectToDetail()
            }
        }
    }

    private fun bindBagPack(binding: FragmentHomeBinding) {
        binding.backpack.apply {
            this.setOnClickListener {
                redirectToCollection()
            }
        }
    }

    private fun redirectToCollection() {
        findNavController().navigate(R.id.action_homeFragment_to_collectionFragment)
    }

    private fun redirectToDetail() {
        findNavController().navigate(R.id.action_homeFragment_to_detailFragment)
    }

    companion object {

    }
}