package ru.tinkoff.fintech.refactoring.employee

import ru.tinkoff.fintech.refactoring.FoodOrder
import ru.tinkoff.fintech.refactoring.food.SimpleFood

interface Employee<T : SimpleFood> {
    fun canProcess(order: FoodOrder<SimpleFood>): Boolean

    fun doWork(order: FoodOrder<T>)
}