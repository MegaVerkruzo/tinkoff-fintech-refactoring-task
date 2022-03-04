package ru.tinkoff.fintech.refactoring

import ru.tinkoff.fintech.refactoring.employee.*
import ru.tinkoff.fintech.refactoring.food.Coffee
import ru.tinkoff.fintech.refactoring.food.CookedFood
import ru.tinkoff.fintech.refactoring.food.Pizza

class PizzaStore(
    private var orderNumber: Int = 0,
    private val orders: MutableMap<FoodOrder, Boolean> = mutableMapOf()
) {
    fun existsCoffee(name: String): Boolean =
        Coffee.values().find { coffee -> coffee.title == name } != null

    fun coffee(name: String): Coffee {
        if (existsCoffee(name)) {
            return Coffee.values().find { coffee -> coffee.title == name }!!
        }
        error("Нет такого кофе!")
    }

    fun existsPizza(name: String): Boolean =
        Pizza.values().find { pizza -> pizza.title == name } != null

    fun pizza(name: String): Pizza {
        if (existsPizza(name)) {
            return Pizza.values().find { pizza -> pizza.title == name }!!
        }
        error("Нет такой пиццы!")
    }

    fun order(name: String): FoodOrder? {
        val cookedFood: CookedFood = if (existsPizza(name)) {
            pizza(name)
        } else if (existsCoffee(name)) {
            coffee(name)
        } else {
            error("Неизвестный вид еды!")
        }
        val foodOrder = FoodOrder(++orderNumber, cookedFood)
        orders[foodOrder] = true
        return foodOrder
    }

    fun executeOrder(foodOrder: FoodOrder?) {
        if (foodOrder != null && orders[foodOrder] != null) {
            var cooked = false
            if (foodOrder.cookedFood is Coffee) {
                Barista().doWork(foodOrder.number, foodOrder.cookedFood)
                cooked = true
            } else if (foodOrder.cookedFood is Pizza) {
                PizzaMaker().doWork(foodOrder.number, foodOrder.cookedFood)
                cooked = true
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
