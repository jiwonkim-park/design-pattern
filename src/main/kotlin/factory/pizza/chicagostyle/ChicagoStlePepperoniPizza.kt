package main.kotlin.factory.pizza.chicagostyle

import main.kotlin.factory.pizza.Pizza

class ChicagoStlePepperoniPizza : Pizza(
    name = "Chicago Style Sauce and Pepperoni Pizza",
    dough = "Extra Thick Crust Dough",
    sauce = "Plum Tomato Sauce",
    toppings = arrayListOf("Pepperoni")
) {
    override fun cut() {
        println("Cutting pizza into square slices")
    }
}