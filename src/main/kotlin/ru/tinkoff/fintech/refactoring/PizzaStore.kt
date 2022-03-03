package ru.tinkoff.fintech.refactoring

import ru.tinkoff.fintech.refactoring.cuisine.*
import ru.tinkoff.fintech.refactoring.employee.*
import ru.tinkoff.fintech.refactoring.food.ProcessedFood

data class FoodOrder(
    val number: Int,
    val ProcessedFood: ProcessedFood
)

class PizzaStore(
    private val employees: Array<Employee> = arrayOf(Barista(), PizzaMaker()),
    private var orderNumber: Int = 0,
    private val cuisines: Array<CuisineProcessedFood> = arrayOf(
        CuisineCoffee(),
        CuisinePizza(),
    ),
    private val orders: MutableMap<FoodOrder, Boolean> = mutableMapOf()
) {
    fun existsProcessedFood(name: String): ProcessedFood? {
        cuisines.forEach { cuisine ->
            val processedFood = cuisine.existsProcessedFood(name)
            if (processedFood != null) {
                return processedFood
            }
        }
        return null
    }

    fun order(name: String): FoodOrder {
        val ProcessedFoodType = existsProcessedFood(name) ?: error("Неизвестный вид еды!")
        val FoodOrder = FoodOrder(++orderNumber, ProcessedFoodType)
        orders[FoodOrder] = true
        return FoodOrder
    }

    fun executeOrder(foodOrder: FoodOrder, employee: Employee): Boolean {
        if (orders[foodOrder] != null) {
            employees.forEach { currentEmployee ->
                if (currentEmployee.javaClass.kotlin == employee.javaClass.kotlin) {
                    if (employee.make(foodOrder.number, foodOrder.ProcessedFood)) {
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

