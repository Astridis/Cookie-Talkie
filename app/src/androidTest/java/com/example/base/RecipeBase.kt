package com.example.base

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.dao.RecipeDao
import com.example.entities.Recipe

@Database(entities = [Recipe::class], version=1, exportSchema = false)
abstract class RecipeBase: RoomDatabase() {
    companion object{

        var recipesbase:RecipeBase? = null

        @Synchronized
        fun getBase(context: Context):RecipeBase{
            if (recipesbase != null){
                recipesbase = Room.databaseBuilder(
                    context,
                    RecipeBase::class.java,
                    "recipe.db"
                ).build()
            }
            return recipesbase!!
        }
    }
    abstract fun daoRecipe():RecipeDao
}