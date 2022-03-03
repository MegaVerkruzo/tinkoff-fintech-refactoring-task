package ru.tinkoff.fintech.refactoring.food

import kotlin.math.abs

interface ProcessedFood : SimpleFood {
    val cookingTime: Int
    val ingredients: List<Pair<Ingredient, Int>>

    fun equals(ProcessedFood: ProcessedFood): Boolean {
        return name == ProcessedFood.name
                && abs(price - ProcessedFood.price) < 1e-4
                && cookingTime - ProcessedFood.cookingTime == 0
                && ingredients == ProcessedFood.ingredients
    }
}