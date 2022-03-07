package ru.tinkoff.fintech.refactoring

import ru.tinkoff.fintech.refactoring.employee.*
import ru.tinkoff.fintech.refactoring.food.Coffee
import ru.tinkoff.fintech.refactoring.food.Pizza
import ru.tinkoff.fintech.refactoring.food.SimpleFood

class PizzaStore(
    private val employees: Set<Employee> = setOf()
) {
    private var orderNumber: Int = 0
    private val orders: MutableMap<FoodOrder, Boolean> = mutableMapOf()

    fun order(name: String): FoodOrder {
        val food: SimpleFood = Coffee.values().find { it.title == name }
            ?: Pizza.values().find { it.title == name }
            ?: error("Нет такого блюда в меню")

        val order = FoodOrder(++orderNumber, food)
        if (employees.find { it.canCook(order) } == null)
            error("Нет подходящего сотрудника для выполнения этой действия")

        orders[order] = true
        return order
    }

    fun executeOrder(order: FoodOrder) {
        if (orders[order] != true) error("Такого заказа нет в очереди")

        employees.find { it.canCook(order) }?.cookFood(order)
        orders[order] = false;
    }
}
