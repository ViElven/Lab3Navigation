package com.example.lab3navigationlab.sreens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lab3navigationlab.adapter.DishAdapter
import com.example.lab3navigationlab.databinding.FragmentFavouriteBinding
import com.example.lab3navigationlab.model.DishModel


class FavouriteFragment : Fragment() {
    lateinit var binding: FragmentFavouriteBinding
    lateinit var adapter: DishAdapter
    lateinit var recyclerView: RecyclerView



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFavouriteBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initial()
    }

    private fun initial(){
        recyclerView = binding.rvDish
        adapter = DishAdapter(this)
        recyclerView.adapter = adapter
        adapter.setList(myDish())
    }

    fun myDish(): ArrayList<DishModel>{
        val dishList = ArrayList<DishModel>()

        val dish_borsh = DishModel("Борщ","https://вкуснофф.рф/img/recepty/1935/big.jpg")
        dishList.add(dish_borsh)
        val dish_puree = DishModel("Пюре","https://assets.tmecosys.com/image/upload/t_web767x639/img/recipe/ras/Assets/B66B89C2-90DF-4526-B96A-77A801ECAA29/Derivates/df9c571d-22ca-4342-8773-c242929f1f93.jpg")
        dishList.add(dish_puree)
        val dish_shroom = DishModel("Пирожки с грибами","https://s1.eda.ru/StaticContent/Photos/120214154946/120214155413/p_O.jpg")
        dishList.add(dish_shroom)

        return dishList
    }



}