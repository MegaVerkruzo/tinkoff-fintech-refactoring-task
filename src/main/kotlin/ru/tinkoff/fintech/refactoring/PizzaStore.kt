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
    fun existsCookedFood(name: String): CookedFood? =
        cuisines.find { cuisine -> cuisine.existsCookedFood(name) }!!.cookedFood(name)


    fun order(name: String): FoodOrder {
        val cookedFoodType = existsCookedFood(name) ?: error("Неизвестный вид еды!")
        val foodOrder = FoodOrder(++orderNumber, cookedFoodType)
        orders[foodOrder] = true
        return foodOrder
    }

    fun executeOrder(foodOrder: FoodOrder, employee: Employee): Boolean {
        if (orders[foodOrder] != null) {
            employees.forEach { currentEmployee ->
                if (currentEmployee.javaClass.kotlin == employee.javaClass.kotlin) {
                    if (employee.make(foodOrder.number, foodOrder.cookedFood)) {
                        orders.remove(foodOrder)
                        return true
                    }
                    return false
                }
            }
            error("Такого сотрудника нет")
        }
        error("Такого заказа нет в очереди")
        return false
    }
}

