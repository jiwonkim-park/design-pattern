package main.kotlin.factory.pizza.chicagostyle

import main.kotlin.factory.pizza.Pizza

class ChicagoStyleClamPizza : Pizza(
    name = "Chicago Style Sauce and Clam Pizza",
    dough = "Extra Thick Crust Dough",
    sauce = "Plum Tomato Sauce",
    toppings = arrayListOf("Clam")
) {
    override fun cut() {
        println("Cutting pizza into square slices")
    }
}