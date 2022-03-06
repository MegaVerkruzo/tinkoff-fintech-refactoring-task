package ru.tinkoff.fintech.refactoring

import ru.tinkoff.fintech.refactoring.food.SimpleFood

data class FoodOrder<T : SimpleFood>(
    val orderId: Int,
    val food: T
)