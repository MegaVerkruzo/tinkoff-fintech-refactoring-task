package ru.tinkoff.fintech.refactoring

abstract class Pizza(val name: String, val ingredients: List<Pair<String, Int>>)

class Carbonara: Pizza("карбонара", listOf("яйца" to 1, "бекон" to 2, "тесто" to 1, "сыр" to 2))
class Marinara: Pizza("маринара", listOf("томат" to 2, "оливки" to 3, "тесто" to 1))
class Sardinia: Pizza("сардиния", listOf("салями" to 3, "оливки" to 1, "тесто" to 1, "сыр" to 3))
class Valtellina: Pizza("вальтеллина", listOf("вяленая говядина" to 1, "зелень" to 1, "тесто" to 1, "пармезан" to 2))
class Peasant: Pizza("крестьянская", listOf("грибы" to 3, "томат" to 1, "тесто" to 1, "спаржа" to 1, "мясное ассорти" to 1))