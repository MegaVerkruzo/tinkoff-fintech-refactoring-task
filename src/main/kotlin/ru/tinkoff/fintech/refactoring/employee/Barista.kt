package ru.tinkoff.fintech.refactoring.employee

import ru.tinkoff.fintech.refactoring.food.Coffee
import ru.tinkoff.fintech.refactoring.food.CookedFood

class Barista : Employee {
    override fun cleanFloor(): Boolean {
        println("[Бариста] Я не умею мыть полы")
        return false
    }

    override fun make(orderId: Int, cookedFood: CookedFood): Boolean {
        if (cookedFood is Coffee) {
            println("[Бариста] Готовлю напиток: ${cookedFood.name}")
            println("[Бариста] Время приготовления: ${cookedFood.cookingTime} минут")
            val roundedPrice = "%.2f".format(cookedFood.price)
            println("[Бариста] Стоимость напитка: $roundedPrice")

            println("[Бариста] заказ $orderId готов")
            return true
        }
        println("[Бариста] Я не умею готовить этот продукт")
        return false
    }
}