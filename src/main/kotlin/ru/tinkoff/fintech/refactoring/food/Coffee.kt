package ru.tinkoff.fintech.refactoring.food

abstract class Coffee(val name: String, val brewTimeInMinutes: Int, private val price: Double) : Food {
    override fun getPrice(): Double {
        return price
    }

}

class Espresso : Coffee("эспрессо", 5, 5.0)
class Cappuccino : Coffee("капучино", 6, 3.48)