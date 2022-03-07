package ru.tinkoff.fintech.refactoring

import ru.tinkoff.fintech.refactoring.FoodOrder

interface Employee {
    fun canCook(order: FoodOrder): Boolean

    fun cookFood(order: FoodOrder)
}