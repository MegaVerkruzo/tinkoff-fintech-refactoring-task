package ru.tinkoff.fintech.refactoring.employee

import ru.tinkoff.fintech.refactoring.FoodOrder
import ru.tinkoff.fintech.refactoring.food.Coffee
import ru.tinkoff.fintech.refactoring.food.SimpleFood

class Barista : Employee<Coffee> {
    override fun doWork(order: FoodOrder<Coffee>) {
        val orderId = order.orderId
        val food = order.food
        println("[Бариста] Готовлю напиток: ${food.title}")
        println("[Бариста] Время приготовления: ${food.cookingTime} минут")
        val roundedPrice = "%.2f".format(food.price)
        println("[Бариста] Стоимость напитка: $roundedPrice")

        println("[Бариста] заказ $orderId готов")
    }

    override fun canProcess(order: FoodOrder<SimpleFood>): Boolean {
        return order.food is Coffee
    }
}