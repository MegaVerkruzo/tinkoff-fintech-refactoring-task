package ru.tinkoff.fintech.refactoring.employee

import ru.tinkoff.fintech.refactoring.FoodOrder
import ru.tinkoff.fintech.refactoring.food.Pizza
import ru.tinkoff.fintech.refactoring.food.SimpleFood

class PizzaMaker : Employee {
    override fun cookFood(order: FoodOrder) {
        if (order.food is Pizza) {
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
        } else {
            println("[Пицца мейкер] не может выполнить этот заказ")
        }

    }

    override fun canCook(order: FoodOrder): Boolean {
        return order.food is Pizza
    }
}
