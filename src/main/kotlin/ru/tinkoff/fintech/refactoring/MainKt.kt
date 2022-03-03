package ru.tinkoff.fintech.refactoring

import ru.tinkoff.fintech.refactoring.employee.*

fun main() {
    val orderQueue = OrderQueue()
    val pizzaOrder = orderQueue.order("карбонара")
    val coffeeOrder = orderQueue.order("эспрессо")
    orderQueue.executeOrder(pizzaOrder, PizzaMaker())
    orderQueue.executeOrder(coffeeOrder, Barista())
    orderQueue.executeOrder(coffeeOrder, Barista())
}