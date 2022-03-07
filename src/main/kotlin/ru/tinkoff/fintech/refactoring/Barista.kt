package ru.tinkoff.fintech.refactoring

class Barista : Employee {
    override fun cookFood(order: FoodOrder) {
        if (order.food !is Coffee) error("[Бариста] не может выполнить этот заказ")

        val orderId = order.id
        val food = order.food
        println("[Бариста] Готовлю напиток: ${food.title}")
        println("[Бариста] Время приготовления: ${food.brewTime} минут")
        val roundedPrice = "%.2f".format(food.price)
        println("[Бариста] Стоимость напитка: $roundedPrice")

        println("[Бариста] заказ $orderId готов")
    }

    override fun canCook(order: FoodOrder): Boolean {
        return order.food is Coffee
    }
}