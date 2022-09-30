package com.example.recipeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recipeapp.adapter.MainCategoryAdapter
import com.example.recipeapp.adapter.SubCategoryAdapter
import com.example.recipeapp.entities.Recipe
import kotlinx.android.synthetic.main.item_cat.view.*


class HomeActivity : AppCompatActivity() {

    var arrMainCategory = ArrayList<Recipe>()
    var arrSubCategory = ArrayList<Recipe>()

    var MainCategoryAdapter = MainCategoryAdapter()
    var SubCategoryAdapter = SubCategoryAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Names of items
        arrMainCategory.add(Recipe(1,"Buleczki"))
        arrMainCategory.add(Recipe(2,"Salatka"))
        arrMainCategory.add(Recipe(3,"Ciasteczka"))
        arrMainCategory.add(Recipe(4,"Spaghetti"))

        MainCategoryAdapter.setData(arrMainCategory)

        arrSubCategory.add(Recipe(1,"Buleczki codzienne"))
        arrSubCategory.add(Recipe(2,"Salatka porowa z ananasem"))
        arrSubCategory.add(Recipe(3,"Zdrowe ciasteczka otrebowe"))
        arrSubCategory.add(Recipe(4,"Spaghetti carbonara"))

        SubCategoryAdapter.setData(arrSubCategory)

        item.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        item.adapter=MainCategoryAdapter

        item_cat.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        item_cat.adapter=MainCategoryAdapter
    }
}