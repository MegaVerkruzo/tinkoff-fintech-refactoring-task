package ru.tinkoff.fintech.refactoring.employee

import ru.tinkoff.fintech.refactoring.food.Coffee
import ru.tinkoff.fintech.refactoring.food.ProcessedFood

class Barista : Employee {
    override fun cleanFloor(): Boolean {
        println("[Бариста] Я не умею мыть полы")
        return false
    }

    override fun make(orderId: Int, ProcessedFood: ProcessedFood): Boolean {
        if (ProcessedFood is Coffee) {
            println("[Бариста] Готовлю напиток: ${ProcessedFood.name}")
            println("[Бариста] Время приготовления: ${ProcessedFood.cookingTime} минут")
            val roundedPrice = "%.2f".format(ProcessedFood.price)
            println("[Бариста] Стоимость напитка: $roundedPrice")

            println("[Бариста] заказ $orderId готов")
            return true
        }
        println("[Бариста] Я не умею готовить этот продукт")
        return false
    }
}