package ru.tinkoff.fintech.refactoring.employee

import ru.tinkoff.fintech.refactoring.FoodOrder
import ru.tinkoff.fintech.refactoring.food.Pizza
import ru.tinkoff.fintech.refactoring.food.SimpleFood

class PizzaMaker : Employee<Pizza> {
    override fun doWork(order: FoodOrder<Pizza>) {
        val orderId = order.orderId
        val food = order.food
        println("[Пицца мейкер] Делаю пиццу: ${food.title}")
        println("[Пицца мейкер] Из ингридиетов:")

        var ingredientCounter = 0
        food.ingredients.forEach { (ingredient, count) ->
            println("[Пицца мейкер] - ${ingredient.title}: в количестве $count за ${ingredient.price}$")
            ingredientCounter += count
        }

        println("[Пицца мейкер] время приготовления $ingredientCounter минут")
        val roundedPrice = "%.2f".format(food.price)
        println("[Пицца мейкер] в сумме за все $roundedPrice$")

        println("[Пицца мейкер] заказ $orderId готов")
    }

    override fun canProcess(order: FoodOrder<SimpleFood>): Boolean {
        return order.food is Pizza
    }
}
