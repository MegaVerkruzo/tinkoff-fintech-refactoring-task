package ru.tinkoff.fintech.refactoring

import ru.tinkoff.fintech.refactoring.employee.*
import ru.tinkoff.fintech.refactoring.food.Coffee
import ru.tinkoff.fintech.refactoring.food.SimpleFood
import ru.tinkoff.fintech.refactoring.food.Pizza

class PizzaStore {
    private var orderNumber: Int = 0
    private val orders: MutableMap<FoodOrder<SimpleFood>, Boolean> = mutableMapOf()

    private fun existsCoffee(name: String): Boolean =
        Coffee.values().find { coffee -> coffee.title == name } != null

    private fun getCoffeeType(name: String): Coffee {
        if (existsCoffee(name)) {
            return Coffee.values().find { coffee -> coffee.title == name }!!
        }
        error("Нет такого кофе!")
    }

    private fun existsPizza(name: String): Boolean =
        Pizza.values().find { pizza -> pizza.title == name } != null

    private fun getPizzaType(name: String): Pizza {
        if (existsPizza(name)) {
            return Pizza.values().find { pizza -> pizza.title == name }!!
        }
        error("Нет такой пиццы!")
    }

    fun order(name: String): FoodOrder? {
        val simpleFood: SimpleFood = if (existsPizza(name)) {
            getPizzaType(name)
        } else if (existsCoffee(name)) {
            getCoffeeType(name)
        } else {
            error("Неизвестный вид еды!")
        }
        val foodOrder = FoodOrder(++orderNumber, simpleFood)
        orders[foodOrder] = true
        return foodOrder
    }

    fun executeOrder(foodOrder: FoodOrder?) {
        if (foodOrder != null && orders[foodOrder] != null) {
            var cooked = false
            when (foodOrder.simpleFood) {
                is Coffee -> {
                    Barista().doWork(foodOrder.number, foodOrder.simpleFood)
                    cooked = true
                }
                is Pizza -> {
                    PizzaMaker().doWork(foodOrder.number, foodOrder.simpleFood)
                    cooked = true
                }
            }
            if (cooked) {
                orders.remove(foodOrder)
                return
            }
            error("Сотрудника, который может приготовить такую еду - нет!")
        }
        error("Такого заказа нет в очереди")
    }
}
