package ru.tinkoff.fintech.refactoring.employee

import ru.tinkoff.fintech.refactoring.cuisine.Coffee
import ru.tinkoff.fintech.refactoring.Pizza

interface Employee {
    fun makePizza(orderId: Int, pizza: Pizza, ingredients: List<Pair<String, Int>>)
    fun makeCoffee(orderId: Int, coffee: Coffee)
    fun cleanFloor()
}