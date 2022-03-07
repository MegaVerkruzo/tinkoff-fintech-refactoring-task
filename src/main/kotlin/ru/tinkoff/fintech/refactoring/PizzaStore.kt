package ru.tinkoff.fintech.refactoring

import ru.tinkoff.fintech.refactoring.employee.*
import ru.tinkoff.fintech.refactoring.food.Coffee
import ru.tinkoff.fintech.refactoring.food.Pizza
import ru.tinkoff.fintech.refactoring.food.SimpleFood

class PizzaStore {
    private val employees = setOf(Barista(), PizzaMaker())
    private var orderNumber: Int = 0
    private val orders: MutableMap<FoodOrder, Boolean> = mutableMapOf()

    fun order(name: String): FoodOrder {
        val food: SimpleFood? = Coffee.values().find { it.title == name } ?: Pizza.values().find { it.title == name }
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

    fun executeOrder(order: FoodOrder) {
        if (orders[order] == true) {
            employees.find { it.canCook(order) }?.cookFood(order)
            orders[order] = false;
        } else {
            error("Такого заказа нет в очереди")
        }
    }
}
