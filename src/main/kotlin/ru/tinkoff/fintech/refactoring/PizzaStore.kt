package ru.tinkoff.fintech.refactoring

import ru.tinkoff.fintech.refactoring.cuisine.*
import ru.tinkoff.fintech.refactoring.employee.*
import ru.tinkoff.fintech.refactoring.food.CookedFood

class PizzaStore(
    private val employees: Array<Employee> = arrayOf(Barista(), PizzaMaker()),
    private var orderNumber: Int = 0,
    private val cuisines: Array<CuisineFood> = arrayOf(
        CuisineCoffee(),
        CuisinePizza(),
    ),
    private val orders: MutableMap<FoodOrder, Boolean> = mutableMapOf()
) {
    fun existsCookedFood(name: String): Boolean =
        cuisines.find { cuisine -> cuisine.existsCookedFood(name) } != null

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
                    && employee.make(foodOrder.number, foodOrder.cookedFood) } != null) {
                orders.remove(foodOrder)
                return true
            }
            error("Такого сотрудника нет")
        }
        error("Такого заказа нет в очереди")
        return false
    }
}

