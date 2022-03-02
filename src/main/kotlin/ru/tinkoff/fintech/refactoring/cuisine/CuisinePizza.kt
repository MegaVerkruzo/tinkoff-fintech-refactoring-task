package ru.tinkoff.fintech.refactoring.cuisine

import ru.tinkoff.fintech.refactoring.Pizza
import ru.tinkoff.fintech.refactoring.employee.Barista
import ru.tinkoff.fintech.refactoring.employee.Employee
import ru.tinkoff.fintech.refactoring.employee.PizzaMaker

data class PizzaOrder(
    val number: Int,
    val pizza: Pizza,
    val price: Double
)

class CuisinePizza(
    private var orderNumber: Int = 0,
    private val pizzaMaker: Employee = PizzaMaker(),
    private val barista: Employee = Barista()
) {
    fun orderCoffee(name: String): CoffeeOrder {
        val coffee = ru.tinkoff.fintech.refactoring.cuisine.Coffee.getCoffeeByName(name)
            ?: error("Неизвестный вид кофе!")

        return CoffeeOrder(
            number = ++orderNumber,
            pizza = coffee
        )
    }

    fun orderPizza(name: String): PizzaOrder {
        val pizza = Pizza(name)
        val ingredients = getIngredient(pizza)
        var pizzaPrice = 0.0


        return PizzaOrder(
            number = ++orderNumber,
            pizza = pizza,
            price = pizzaPrice
        )
    }

    fun executeOrder(pizzaOrder: PizzaOrder? = null, coffeeOrder: CoffeeOrder? = null) {
        if (pizzaOrder != null) {
            pizzaMaker.makePizza(pizzaOrder.number, pizzaOrder.pizza, getIngredient(pizzaOrder.pizza))
        }

        if (coffeeOrder != null) {
            barista.makeCoffee(coffeeOrder.number, coffeeOrder.pizza)
        }
    }
}

