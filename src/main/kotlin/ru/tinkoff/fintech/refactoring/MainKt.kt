package ru.tinkoff.fintech.refactoring

import ru.tinkoff.fintech.refactoring.employee.*
import ru.tinkoff.fintech.refactoring.food.Coffee
import ru.tinkoff.fintech.refactoring.food.Pizza

fun main() {
    val pizzaStore = PizzaStore(setOf(PizzaMaker(), Barista()), setOf(Coffee(), Pizza()))
    val pizzaOrder = pizzaStore.order("карбонара")
    val coffeeOrder = pizzaStore.order("эспрессо")
    pizzaStore.executeOrder(pizzaOrder)
    pizzaStore.executeOrder(coffeeOrder)
    pizzaStore.executeOrder(coffeeOrder)
}