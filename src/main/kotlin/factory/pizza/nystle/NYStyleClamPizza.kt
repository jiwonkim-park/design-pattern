package main.kotlin.factory.pizza.nystle

import main.kotlin.factory.pizza.Pizza

class NYStyleClamPizza : Pizza(
    name = "NY Style Sauce and Clam Pizza",
    dough = "Thin Crust Dough",
    sauce = "Marinara Sauce",
    toppings = arrayListOf("Clam")
)