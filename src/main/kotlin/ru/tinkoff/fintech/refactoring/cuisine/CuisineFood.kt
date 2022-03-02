package ru.tinkoff.fintech.refactoring.cuisine

import ru.tinkoff.fintech.refactoring.food.Food

abstract class CuisineFood(private val foodTypes: Array<Food>) {
    fun existsFood(name: String): Food? {
        foodTypes.forEach { food ->
            if (food.name == name) {
                return food;
            }
        }
        return null;
    }
}