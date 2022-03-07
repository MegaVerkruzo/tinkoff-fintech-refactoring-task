package ru.tinkoff.fintech.refactoring

class PizzaStore(
    private val employees: Set<Employee>
) {
    private var orderNumber: Int = 0
    private val orders: MutableSet<FoodOrder> = mutableSetOf()

    fun order(name: String): FoodOrder {
        val food: SimpleFood = Coffee.values().find { it.title == name }
            ?: Pizza.values().find { it.title == name }
            ?: error("Нет такого блюда в меню")

        val order = FoodOrder(++orderNumber, food)
        if (employees.none { it.canCook(order) })
            error("Нет подходящего сотрудника для выполнения этой действия")
        
        orders.add(order)
        return order
    }

    fun executeOrder(order: FoodOrder) {
        if (!orders.contains(order))
            error("Такого заказа нет в очереди")

        if (employees.none { it.canCook(order) })
            error("Нет подходящего сотрудника для выполнения этой действия")

        employees.find { it.canCook(order) }?.cookFood(order)
        orders.remove(order)
    }
}
