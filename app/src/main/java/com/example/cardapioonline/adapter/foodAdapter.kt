package com.example.cardapioonline.adapter

import android.app.LauncherActivity.ListItem
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cardapioonline.databinding.FoodItemBinding
import com.example.cardapioonline.model.Food

class FoodAdapter (private val context: Context, private val foodList: MutableList<Food>):
    RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val listItem = FoodItemBinding.inflate(LayoutInflater.from(context),parent,false)
        return FoodViewHolder(listItem)
    }

    override fun getItemCount(): Int {
        return foodList.size
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        holder.imgFood.setBackgroundResource(foodList[position].imgFood!!)
        holder.txtFoodName.text = foodList[position].foodName
        holder.txtFoodDescription.text = foodList[position].foodDescription
        holder.foodPrice.text = foodList[position].price

    }

    inner class FoodViewHolder(binding: FoodItemBinding): RecyclerView.ViewHolder(binding.root) {
        val imgFood = binding.imgfood
        val txtFoodName = binding.txtFoodName
        val txtFoodDescription = binding.txtFoodDescription
        val foodPrice = binding.txtPrice
        val btnAddCart = binding.btnAddCart
    }
}