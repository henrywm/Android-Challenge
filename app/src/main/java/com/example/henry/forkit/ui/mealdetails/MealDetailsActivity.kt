package com.example.henry.forkit.ui.mealdetails

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.view.View
import com.example.henry.forkit.R
import com.example.henry.forkit.domain.Meal
import com.example.henry.forkit.utils.hideOrSetIfEmpty
import com.example.henry.forkit.utils.load
import kotlinx.android.synthetic.main.activity_meal_details.*

class MealDetailsActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meal_details)
        with(intent.extras) {
            val meal = this?.get("meal") as Meal
            mealThumb.load(meal.strMealThumb)
            mealTitle.text = meal.strMeal
            mealArea.text = "${meal.strArea} Dish"
            mealCategory.text = "(${meal.strCategory})"
            mealInstructions.text = meal.strInstructions


            mealIngredient1.hideOrSetIfEmpty(meal.strIngredient1)
            mealMeasure1.hideOrSetIfEmpty(meal.strMeasure1)

            mealIngredient2.hideOrSetIfEmpty(meal.strIngredient2)
            mealMeasure2.hideOrSetIfEmpty(meal.strMeasure2)

            mealIngredient3.hideOrSetIfEmpty(meal.strIngredient3)
            mealMeasure3.hideOrSetIfEmpty(meal.strMeasure3)

            mealIngredient4.hideOrSetIfEmpty(meal.strIngredient4)
            mealMeasure4.hideOrSetIfEmpty(meal.strMeasure4)

            mealIngredient5.hideOrSetIfEmpty(meal.strIngredient5)
            mealMeasure5.hideOrSetIfEmpty(meal.strMeasure5)

            mealIngredient6.hideOrSetIfEmpty(meal.strIngredient6)
            mealMeasure6.hideOrSetIfEmpty(meal.strMeasure6)

            mealIngredient7.hideOrSetIfEmpty(meal.strIngredient7)
            mealMeasure7.hideOrSetIfEmpty(meal.strMeasure7)

            mealIngredient8.hideOrSetIfEmpty(meal.strIngredient8)
            mealMeasure8.hideOrSetIfEmpty(meal.strMeasure8)

            mealIngredient9.hideOrSetIfEmpty(meal.strIngredient9)
            mealMeasure9.hideOrSetIfEmpty(meal.strMeasure9)

            mealIngredient10.hideOrSetIfEmpty(meal.strIngredient10)
            mealMeasure10.hideOrSetIfEmpty(meal.strMeasure10)

            mealIngredient11.hideOrSetIfEmpty(meal.strIngredient11)
            mealMeasure11.hideOrSetIfEmpty(meal.strMeasure11)

            mealIngredient12.hideOrSetIfEmpty(meal.strIngredient12)
            mealMeasure12.hideOrSetIfEmpty(meal.strMeasure12)

            mealIngredient13.hideOrSetIfEmpty(meal.strIngredient13)
            mealMeasure13.hideOrSetIfEmpty(meal.strMeasure13)

            mealIngredient14.hideOrSetIfEmpty(meal.strIngredient14)
            mealMeasure14.hideOrSetIfEmpty(meal.strMeasure14)

            mealIngredient15.hideOrSetIfEmpty(meal.strIngredient15)
            mealMeasure15.hideOrSetIfEmpty(meal.strMeasure15)

            mealIngredient16.hideOrSetIfEmpty(meal.strIngredient16)
            mealMeasure16.hideOrSetIfEmpty(meal.strMeasure16)

            mealIngredient17.hideOrSetIfEmpty(meal.strIngredient17)
            mealMeasure17.hideOrSetIfEmpty(meal.strMeasure17)

            mealIngredient18.hideOrSetIfEmpty(meal.strIngredient18)
            mealMeasure18.hideOrSetIfEmpty(meal.strMeasure18)

            mealIngredient19.hideOrSetIfEmpty(meal.strIngredient19)
            mealMeasure19.hideOrSetIfEmpty(meal.strMeasure19)

            mealIngredient20.hideOrSetIfEmpty(meal.strIngredient20)
            mealMeasure20.hideOrSetIfEmpty(meal.strMeasure20)
        }
    }

    fun makeFavorite(v: View){
        favoriteAction.setImageResource(R.drawable.ic_star_white)
        Snackbar.make(v, "Saved in favorite meals!", Snackbar.LENGTH_INDEFINITE)
                .setAction("Ok", {}).show()
    }
}
