package ru.tinkoff.fintech.refactoring

import ru.tinkoff.fintech.refactoring.employee.*
import ru.tinkoff.fintech.refactoring.food.SimpleFood

class PizzaStore(
    private val employees: Set<Employee<SimpleFood>>,
    private val foodTypes: Set<SimpleFood>
) {
    private var orderNumber: Int = 0
    private val orders: MutableMap<FoodOrder<SimpleFood>, Boolean> = mutableMapOf()

//    private fun existsCoffee(name: String): Boolean =
//        Coffee.values().find { coffee -> coffee.title == name } != null
//
//    private fun getCoffeeType(name: String): Coffee {
//        if (existsCoffee(name)) {
//            return Coffee.values().find { coffee -> coffee.title == name }!!
//        }
//        error("Нет такого кофе!")
//    }
//
//    private fun existsPizza(name: String): Boolean =
//        Pizza.values().find { pizza -> pizza.title == name } != null
//
//    private fun getPizzaType(name: String): Pizza {
//        if (existsPizza(name)) {
//            return Pizza.values().find { pizza -> pizza.title == name }!!
//        }
//        error("Нет такой пиццы!")
//    }

    fun order(name: String): FoodOrder<SimpleFood> {
        val food: SimpleFood? = foodTypes.find { it.title == name }
        if (food != null) {
            val order = FoodOrder(++orderNumber, food)
            if (employees.find { it.canCook(order) } != null) {
                orders[order] = true
                return order
            }
            error("Нет подходящего сотрудника для выполнения этой действия")
        }
        error("Неизвестный тип еды!")
    }

    fun executeOrder(order: FoodOrder<SimpleFood>) {
        if (orders[order] == true) {
            employees.find { it.canCook(order) }?.doWork(order)
            orders[order] = false;
        }
        error("Такого заказа нет в очереди")
    }
}
