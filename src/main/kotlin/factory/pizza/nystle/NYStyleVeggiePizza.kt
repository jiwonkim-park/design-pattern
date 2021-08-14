package main.kotlin.factory.pizza.nystle

import main.kotlin.factory.pizza.Pizza

class NYStyleVeggiePizza: Pizza(
    name = "NY Style Sauce and Veggie Pizza",
    dough = "Thin Crust Dough",
    sauce = "Marinara Sauce",
    toppings = arrayListOf("Veggie")
)