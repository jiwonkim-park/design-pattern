package main.kotlin.factory.pizza.nystle

import main.kotlin.factory.pizza.Pizza

class NYStlePepperoniPizza : Pizza(
    name = "NY Style Sauce and Pepperoni Pizza",
    dough = "Thin Crust Dough",
    sauce = "Marinara Sauce",
    toppings = arrayListOf("Pepperoni")
)