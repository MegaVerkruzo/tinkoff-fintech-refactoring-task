package ru.tinkoff.fintech.refactoring

import ru.tinkoff.fintech.refactoring.employee.*

class OrderQueue(
    private var orderNUmber: Int = 0,
    private val pizzaMaker: Employee = PizzaMaker(),
    private val barista: Employee = Barista()
) {
    fun order(foodName: String) {

    }
}