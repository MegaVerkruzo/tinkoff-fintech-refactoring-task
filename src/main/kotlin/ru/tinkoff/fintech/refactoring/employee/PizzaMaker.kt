package ru.tinkoff.fintech.refactoring.employee

import ru.tinkoff.fintech.refactoring.food.Pizza

class PizzaMaker : Employee<Pizza> {
    override fun doWork(orderId: Int, cookedFood: Pizza) {
        println("[Пицца мейкер] Делаю пиццу: ${cookedFood.title}")
        println("[Пицца мейкер] Из ингридиетов:")

        var ingredientCounter = 0
        cookedFood.ingredients.forEach { (ingredient, count) ->
            println("[Пицца мейкер] - ${ingredient.title}: в количестве $count за ${ingredient.price}$")
            ingredientCounter += count
        }

        println("[Пицца мейкер] время приготовления $ingredientCounter минут")
        val roundedPrice = "%.2f".format(cookedFood.price)
        println("[Пицца мейкер] в сумме за все $roundedPrice$")

        println("[Пицца мейкер] заказ $orderId готов")
    }
}
