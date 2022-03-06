package ru.tinkoff.fintech.refactoring.employee

interface Employee<T> {
    fun doWork(orderId: Int, cookedFood: T)
}