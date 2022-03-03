package ru.tinkoff.fintech.refactoring.employee

import ru.tinkoff.fintech.refactoring.food.ProcessedFood

interface Employee {
    fun make(orderId: Int, ProcessedFood: ProcessedFood): Boolean
    fun cleanFloor(): Boolean
}