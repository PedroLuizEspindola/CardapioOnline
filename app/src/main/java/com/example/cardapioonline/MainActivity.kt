package com.example.cardapioonline

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cardapioonline.adapter.FoodAdapter
import com.example.cardapioonline.databinding.ActivityMainBinding
import com.example.cardapioonline.model.Food

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var foodAdapter: FoodAdapter
    private val foodList: MutableList<Food> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recyclerViewFood = binding.RecyclerViewFood
        recyclerViewFood.layoutManager = LinearLayoutManager(this)
        recyclerViewFood.setHasFixedSize(true)
        foodAdapter = FoodAdapter(this,foodList)
        recyclerViewFood.adapter = foodAdapter



        getFood()
        }


        private fun getFood(){
            val food1 = Food(
                imgFood = R.drawable.food1,
                foodName = "food 1",
                foodDescription = "descricao aleatoria",
                price = "50.00"

            )
            foodList.add(food1)

            val food2 = Food(
                imgFood = R.drawable.food2,
                foodName = "food 2",
                foodDescription = "descricao aleatoria",
                price = "60.00"

            )
            foodList.add(food2)

            val food3 = Food(
                imgFood = R.drawable.food3,
                foodName = "food 3",
                foodDescription = "descricao aleatoria",
                price = "70.00"

            )
            foodList.add(food3)

            val food4 = Food(
                imgFood = R.drawable.food4,
                foodName = "food 4",
                foodDescription = "descricao aleatoria",
                price = "80.00"

            )
            foodList.add(food4)
            val food5 = Food(
                imgFood = R.drawable.food5,
                foodName = "food 5",
                foodDescription = "xobla",
                price = "80.00"


            )
            foodList.add(food5)

        }

    }
