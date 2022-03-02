package ru.tinkoff.fintech.refactoring.cuisine

import ru.tinkoff.fintech.refactoring.Coffee


data class CoffeeOrder(
    val number: Int,
    val coffee: Coffee,
)


class CoffeeStore() {

}

class Coffee