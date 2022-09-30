package com.example.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recipeapp.R
import com.example.entities.Recipe
import kotlinx.android.synthetic.main.item_cat.view.*

class SubCategoryAdapter: RecyclerView.Adapter<SubCategoryAdapter.RecipeviewHolder>() {

    var arrSubCategory = ArrayList<Recipe>()
    class RecipeviewHolder(view:View): RecyclerView.ViewHolder(view){

    }
    fun setData(arrData:List<Recipe>){
        arrSubCategory = arrData as ArrayList<Recipe>
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeviewHolder {
        return RecipeviewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_cat,parent,false))
    }

    override fun getItemCount(): Int {
        return arrSubCategory.size
    }

    override fun onBindViewHolder(holder: RecipeviewHolder, position: Int) {
        holder.itemView.dish_name.text = arrSubCategory[position].dishName
    }
}