package ru.tinkoff.fintech.refactoring.employee

import ru.tinkoff.fintech.refactoring.FoodOrder
import ru.tinkoff.fintech.refactoring.food.SimpleFood

interface Employee {
    fun canCook(order: FoodOrder): Boolean

    fun cookFood(order: FoodOrder)
}