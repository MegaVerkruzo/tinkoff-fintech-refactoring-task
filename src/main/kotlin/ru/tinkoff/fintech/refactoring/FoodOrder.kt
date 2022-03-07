package ru.tinkoff.fintech.refactoring

import ru.tinkoff.fintech.refactoring.food.SimpleFood

data class FoodOrder(
    val orderId: Int,
    val food: SimpleFood
)