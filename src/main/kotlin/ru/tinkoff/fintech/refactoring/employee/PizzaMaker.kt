package ru.tinkoff.fintech.refactoring.employee

import ru.tinkoff.fintech.refactoring.food.ProcessedFood
import ru.tinkoff.fintech.refactoring.food.Pizza

class PizzaMaker : Employee {
    override fun cleanFloor(): Boolean {
        println("[Пицца мейкер] Я не умею мыть полы")
        return false
    }

    override fun make(orderId: Int, ProcessedFood: ProcessedFood): Boolean {
        if (ProcessedFood is Pizza) {
            println("[Пицца мейкер] Делаю пиццу: ${ProcessedFood.name}")
            println("[Пицца мейкер] Из ингридиетов:")
            var ingredientCounter = 0
            ProcessedFood.ingredients.forEach {
                val ingredient = it.first
                val count = it.second

                println("[Пицца мейкер] - ${ingredient.name}: в количестве $count за ${ingredient.price}$")
                ingredientCounter += count
            }

            println("[Пицца мейкер] время приготовления $ingredientCounter минут")
            val roundedPrice = "%.2f".format(ProcessedFood.price)
            println("[Пицца мейкер] в сумме за все $roundedPrice$")

            println("[Пицца мейкер] заказ $orderId готов")
            return true
        }
        println("[Пицца мейкер] Я не умею готовить этот продукт'")
        return false
    }
}
