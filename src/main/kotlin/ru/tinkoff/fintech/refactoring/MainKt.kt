package ru.tinkoff.fintech.refactoring

import ru.tinkoff.fintech.refactoring.employee.*

fun main() {
    val pizzaStore = PizzaStore()
    val pizzaOrder = pizzaStore.order("карбонара")
    val coffeeOrder = pizzaStore.order("эспрессо")
    pizzaStore.executeOrder(pizzaOrder, PizzaMaker())
    pizzaStore.executeOrder(coffeeOrder, Barista())
    pizzaStore.executeOrder(coffeeOrder, Barista())
}   