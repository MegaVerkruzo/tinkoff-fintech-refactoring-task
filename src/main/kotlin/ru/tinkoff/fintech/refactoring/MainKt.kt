package ru.tinkoff.fintech.refactoring

import ru.tinkoff.fintech.refactoring.employee.*
import ru.tinkoff.fintech.refactoring.food.Pizza
import ru.tinkoff.fintech.refactoring.food.SimpleFood

fun main() {
    val pizzaStore = PizzaStore()
    val pizzaOrder = pizzaStore.order("карбонара")
    val coffeeOrder = pizzaStore.order("эспрессо")
    pizzaStore.executeOrder(pizzaOrder)
    pizzaStore.executeOrder(coffeeOrder)
    pizzaStore.executeOrder(coffeeOrder)
}