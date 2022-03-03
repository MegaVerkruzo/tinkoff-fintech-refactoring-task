package ru.tinkoff.fintech.refactoring.employee

import ru.tinkoff.fintech.refactoring.food.Coffee

class Barista : Employee<Coffee> {
    override fun doWork(orderId: Int, cookedFood: Coffee) {
        println("[Бариста] Готовлю напиток: ${cookedFood.title}")
        println("[Бариста] Время приготовления: ${cookedFood.cookingTime} минут")
        val roundedPrice = "%.2f".format(cookedFood.price)
        println("[Бариста] Стоимость напитка: $roundedPrice")

        println("[Бариста] заказ $orderId готов")
    }
}