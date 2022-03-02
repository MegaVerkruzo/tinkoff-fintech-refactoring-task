package ru.tinkoff.fintech.refactoring

import ru.tinkoff.fintech.refactoring.employee.*

fun main() {
    val orderQueue = OrderQueue(Barista(), PizzaMaker())
    val pizzaOrder = orderQueue.orderPizza("карбонара")
    val coffeeOrder = coffeeStore.orderCoffee("эспрессо")
    CuisinePizza.executeOrder(pizzaOrder, coffeeOrder)
}