package ru.tinkoff.fintech.refactoring.cuisine

import ru.tinkoff.fintech.refactoring.food.ProcessedFood

abstract class CuisineProcessedFood(private val ProcessedFoodTypes: Array<ProcessedFood>) {
    fun existsProcessedFood(name: String): ProcessedFood? {
        ProcessedFoodTypes.forEach { ProcessedFood ->
            if (ProcessedFood.name == name) {
                return ProcessedFood;
            }
        }
        return null;
    }
}