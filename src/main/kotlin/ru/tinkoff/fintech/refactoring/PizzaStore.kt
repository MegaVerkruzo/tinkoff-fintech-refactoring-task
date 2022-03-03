package ru.tinkoff.fintech.refactoring

import ru.tinkoff.fintech.refactoring.cuisine.*
import ru.tinkoff.fintech.refactoring.employee.*
import ru.tinkoff.fintech.refactoring.food.CookedFood

class PizzaStore(
    private var orderNumber: Int = 0
) {
    fun existsCookedFood(name: String): Boolean =


    fun cookedFood(name: String): CookedFood? =
        cuisines.find { cuisine -> cuisine.existsCookedFood(name) }!!.cookedFood(name)

    fun order(name: String): FoodOrder {
        val cookedFoodType = cookedFood(name) ?: error("Неизвестный вид еды!")
        val foodOrder = FoodOrder(++orderNumber, cookedFoodType)
        orders[foodOrder] = true
        return foodOrder
    }

    fun executeOrder(foodOrder: FoodOrder, employee: Employee): Boolean {
        if (orders[foodOrder] != null) {
            if (employees.find { currentEmployee -> currentEmployee.javaClass.kotlin == employee.javaClass.kotlin
                    && employee.doWork(foodOrder.number, foodOrder.cookedFood) } != null) {
                orders.remove(foodOrder)
                return true
            }
            error("Такого сотрудника нет")
        }
        error("Такого заказа нет в очереди")
        return false
    }
}

