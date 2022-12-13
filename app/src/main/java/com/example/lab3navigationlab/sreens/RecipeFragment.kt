package com.example.lab3navigationlab.sreens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lab3navigationlab.R
import com.example.lab3navigationlab.adapter.DishAdapter
import com.example.lab3navigationlab.databinding.FragmentRecipeBinding

class RecipeFragment : Fragment() {
    lateinit var binding: FragmentRecipeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRecipeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }



}