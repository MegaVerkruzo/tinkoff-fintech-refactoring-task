package ru.tinkoff.fintech.refactoring.cuisine

import ru.tinkoff.fintech.refactoring.food.CookedFood

abstract class CuisineFood(private val cookedFoodTypes: Array<CookedFood>) {
    fun existsCookedFood(name: String): Boolean =
        cookedFoodTypes.find {cookedFood -> cookedFood.name == name } != null

    fun cookedFood(name: String): CookedFood? =
        cookedFoodTypes.find {cookedFood -> cookedFood.name == name }
}