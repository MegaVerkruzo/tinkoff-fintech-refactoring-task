package ru.tinkoff.fintech.refactoring

import ru.tinkoff.fintech.refactoring.food.CookedFood

data class FoodOrder(
    val number: Int,
    val cookedFood: CookedFood
)