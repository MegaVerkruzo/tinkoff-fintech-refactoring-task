package ru.tinkoff.fintech.refactoring.employee

import ru.tinkoff.fintech.refactoring.food.CookedFood

interface Employee {
    fun make(orderId: Int, cookedFood: CookedFood): Boolean
    fun cleanFloor(): Boolean
}