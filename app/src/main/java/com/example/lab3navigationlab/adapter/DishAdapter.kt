package com.example.lab3navigationlab.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.lab3navigationlab.R
import com.example.lab3navigationlab.model.DishModel
import com.example.lab3navigationlab.sreens.FavouriteFragment
import kotlinx.android.synthetic.main.item_dish_layout.view.*

class DishAdapter(private val context: FavouriteFragment) :RecyclerView.Adapter<DishAdapter.DishViewHolder>() {

    private var dishList = emptyList<DishModel>()

    class DishViewHolder(view: View):RecyclerView.ViewHolder(view){
        var dish_pic:ImageView

        init {
            dish_pic = itemView.findViewById(R.id.iv_dish_pic)
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DishViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_dish_layout, parent, false)
        return DishViewHolder(view)
    }

    override fun onBindViewHolder(holder: DishViewHolder, position: Int) {

        holder.itemView.tv_dish_name.text = dishList[position].dish_name
        Glide.with(context).load(dishList[position].dish_pic_URL).into(holder.dish_pic)

        holder.itemView.setOnClickListener{view-> view.findNavController().navigate(R.id.action_favouriteFragment_to_recipeFragment)}


    }

    override fun getItemCount(): Int {
        return dishList.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<DishModel>){
        dishList = list
        notifyDataSetChanged()
    }
}