package ru.tinkoff.fintech.refactoring

import ru.tinkoff.fintech.refactoring.cuisine.CuisineCoffee
import ru.tinkoff.fintech.refactoring.cuisine.CuisineFood
import ru.tinkoff.fintech.refactoring.cuisine.CuisinePizza
import ru.tinkoff.fintech.refactoring.employee.Employee
import ru.tinkoff.fintech.refactoring.food.Food
import ru.tinkoff.fintech.refactoring.food.Pizza

data class FoodOrder(
    val number: Int,
    val food: Food,
)

class OrderQueue (
    vararg employees: Employee,
    private var orderNumber: Int = 0,
    private val cuisines: Array<CuisineFood> = arrayOf(
        CuisineCoffee(),
        CuisinePizza()
    )
) {

    fun existsFood(name: String): CuisineFood {
        if ()
    }

    fun order(name: String): FoodOrder {
        val typeOfCoffee = existsFood(name) ?: error("Неизвестный вид кофе!")
        return FoodOrder()
    }

//    fun executeOrder(pizzaOrder: PizzaOrder? = null, coffeeOrder: CoffeeOrder? = null) {
//        if (pizzaOrder != null) {
//            pizzaMaker.makePizza(pizzaOrder.number, pizzaOrder.pizza, getIngredient(pizzaOrder.pizza))
//        }
//
//        if (coffeeOrder != null) {
//            barista.makeCoffee(coffeeOrder.number, coffeeOrder.pizza)
//        }
//    }
//
//    fun orderPizza(name: String): PizzaOrder {
//        val pizza = Pizza(name)
//        val ingredients = getIngredient(pizza)
//        var pizzaPrice = 0.0
//
//
//        return PizzaOrder(
//            number = ++orderNumber,
//            pizza = pizza,
//            price = pizzaPrice
//        )
//    }
//}

