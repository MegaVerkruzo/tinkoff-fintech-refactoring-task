package ru.tinkoff.fintech.refactoring

fun main() {
    val pizzaStore = PizzaStore(setOf(Barista(), PizzaMaker()))
    val pizzaOrder = pizzaStore.order("карбонара")
    val coffeeOrder = pizzaStore.order("эспрессо")
    pizzaStore.executeOrder(pizzaOrder)
    pizzaStore.executeOrder(coffeeOrder)
    pizzaStore.executeOrder(coffeeOrder)
}