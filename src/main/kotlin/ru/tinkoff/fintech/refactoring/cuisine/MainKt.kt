package ru.tinkoff.fintech.refactoring.cuisine

fun main() {
    val CuisinePizza = CuisinePizza()
    val pizzaOrder = CuisinePizza.orderPizza("карбонара")
    val coffeeOrder = coffeeStore.orderCoffee("эспрессо")
    CuisinePizza.executeOrder(pizzaOrder, coffeeOrder)
}