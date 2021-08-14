package main.kotlin.factory.pizza.nystle

import main.kotlin.factory.pizza.Pizza

class NYStyleCheesePizza: Pizza(
    name = "NY Style Sauce and Cheese Pizza",
    dough = "Thin Crust Dough",
    sauce = "Marinara Sauce",
    toppings = arrayListOf("Grated Reggiano Cheese")
) {
}