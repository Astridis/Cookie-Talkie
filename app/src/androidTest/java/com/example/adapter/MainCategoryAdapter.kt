package com.example.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recipeapp.R
import com.example.entities.Recipe
import kotlinx.android.synthetic.main.item_cat.view.*

class MainCategoryAdapter: RecyclerView.Adapter<MainCategoryAdapter.RecipeviewHolder>() {

    var arrMainCategory = ArrayList<Recipe>()
    class RecipeviewHolder(view:View): RecyclerView.ViewHolder(view){

    }
    fun setData(arrData:List<Recipe>){
        arrMainCategory = arrData as ArrayList<Recipe>
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeviewHolder {
        return RecipeviewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false))
    }

    override fun getItemCount(): Int {
        return arrMainCategory.size
    }

    override fun onBindViewHolder(holder: RecipeviewHolder, position: Int) {
        holder.itemView.dish_name.text = arrMainCategory[position].dishName
    }
}