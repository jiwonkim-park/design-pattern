package main.kotlin.factory.pizza.chicagostyle

import main.kotlin.factory.pizza.Pizza

class ChicagoStyleVeggiePizza : Pizza(
    name = "Chicago Style Sauce and Veggie Pizza",
    dough = "Extra Thick Crust Dough",
    sauce = "Plum Tomato Sauce",
    toppings = arrayListOf("Veggie")
) {
    override fun cut() {
        println("Cutting pizza into square slices")
    }
}