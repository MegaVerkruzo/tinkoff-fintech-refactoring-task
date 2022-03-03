package ru.tinkoff.fintech.refactoring.employee

import ru.tinkoff.fintech.refactoring.food.CookedFood

interface Employee<T> {
    fun doWork(orderId: Int, cookedFood: T)
}