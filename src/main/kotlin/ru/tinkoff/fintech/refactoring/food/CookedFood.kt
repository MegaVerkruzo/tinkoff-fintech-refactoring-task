package ru.tinkoff.fintech.refactoring.food

import kotlin.math.abs

interface CookedFood : SimpleFood {
    val cookingTime: Int
    val ingredients: List<Pair<Ingredient, Int>>

    fun equals(CookedFood: CookedFood): Boolean {
        return name == CookedFood.name
                && abs(price - CookedFood.price) < 1e-4
                && cookingTime - CookedFood.cookingTime == 0
                && ingredients == CookedFood.ingredients
    }
}