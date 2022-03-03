package ru.tinkoff.fintech.refactoring

import ru.tinkoff.fintech.refactoring.food.ProcessedFood

data class FoodOrder(
    val number: Int,
    val ProcessedFood: ProcessedFood
)