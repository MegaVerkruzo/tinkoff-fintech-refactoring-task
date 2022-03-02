package ru.tinkoff.fintech.refactoring.employee

import ru.tinkoff.fintech.refactoring.cuisine.Coffee
import ru.tinkoff.fintech.refactoring.Pizza

class Barista : Employee {
    override fun makePizza(orderId: Int, pizza: Pizza, ingredients: List<Pair<String, Int>>) {
        println("[Бариста] Я не умею готовить пиццу")
    }

    override fun cleanFloor() {
        println("[Бариста] Я не умею мыть полы")
    }

    override fun makeCoffee(orderId: Int, coffee: Coffee) {
        println("[Бариста] Готовлю напиток: ${coffee.name}")
        println("[Бариста] Время приготовления: ${coffee.calculateCoffeeBrewTimeInMinutes()} минут")
        val roundedPrice = "%.2f".format(coffee.price)
        println("[Бариста] Стоимость напитка: $roundedPrice")

        println("[Бариста] заказ $orderId готов")
    }
}