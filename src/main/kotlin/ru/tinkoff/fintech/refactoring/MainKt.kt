package ru.tinkoff.fintech.refactoring

fun main() {
    val orderQueue = OrderQueue()
    val pizzaOrder = orderQueue.orderPizza("карбонара")
    val coffeeOrder = coffeeStore.orderCoffee("эспрессо")
    CuisinePizza.executeOrder(pizzaOrder, coffeeOrder)
}