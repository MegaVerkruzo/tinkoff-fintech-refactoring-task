package ru.tinkoff.fintech.refactoring.food

abstract class Ingredient(val name: String, val price: Double)

class Egg : Ingredient("яйцо", 3.48)
class Bacon : Ingredient("бекон", 6.48)
class Dough : Ingredient("тесто", 1.00)
class Tomato : Ingredient("томат", 1.53)
class Olives : Ingredient("оливки", 1.53)
class Cheese : Ingredient("сыр", 0.98)
class Parmesan : Ingredient("пармезан", 3.98)
class Mushrooms : Ingredient("грибы", 3.34)
class Asparagus : Ingredient("спаржа", 3.34)
class ColdCuts : Ingredient("мясное ассорти", 9.38)
class BeefJerky : Ingredient("вяленая говядина", 12.24)
class Salami: Ingredient("салями", 4.24)
class Greenery: Ingredient("зелень", 0.67)