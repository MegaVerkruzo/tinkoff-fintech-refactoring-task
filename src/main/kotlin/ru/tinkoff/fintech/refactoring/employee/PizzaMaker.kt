package ru.tinkoff.fintech.refactoring.employee

import ru.tinkoff.fintech.refactoring.food.CookedFood
import ru.tinkoff.fintech.refactoring.food.Pizza

class PizzaMaker : Employee {
    override fun cleanFloor(): Boolean {
        println("[Пицца мейкер] Я не умею мыть полы")
        return false
    }

    override fun make(orderId: Int, cookedFood: CookedFood): Boolean {
        if (cookedFood is Pizza) {
            println("[Пицца мейкер] Делаю пиццу: ${cookedFood.name}")
            println("[Пицца мейкер] Из ингридиетов:")

            var ingredientCounter = 0
            cookedFood.ingredients.forEach { (ingredient, count) ->
                println("[Пицца мейкер] - ${ingredient.name}: в количестве $count за ${ingredient.price}$")
                ingredientCounter += count
            }

            println("[Пицца мейкер] время приготовления $ingredientCounter минут")
            val roundedPrice = "%.2f".format(cookedFood.price)
            println("[Пицца мейкер] в сумме за все $roundedPrice$")

            println("[Пицца мейкер] заказ $orderId готов")
            return true
        }
        println("[Пицца мейкер] Я не умею готовить этот продукт'")
        return false
    }
}
