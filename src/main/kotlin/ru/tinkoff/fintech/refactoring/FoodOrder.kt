package ru.tinkoff.fintech.refactoring

import ru.tinkoff.fintech.refactoring.food.SimpleFood

data class FoodOrder(
    val number: Int,
    val simpleFood: SimpleFood
)