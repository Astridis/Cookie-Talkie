package com.example.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.entities.Recipe


@Dao
interface RecipeDao {

    @get:Query("SELECT * FROM recipes ORDER BY id DESC")
    val ListRecipes: List<Recipe>

    @Insert(onConflict = OnConflictStrategy.REPLACE)

    fun insertRecipe(recipe: Recipe)
}