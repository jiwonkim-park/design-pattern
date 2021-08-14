package main.kotlin.factory.pizza.chicagostyle

import main.kotlin.factory.pizza.Pizza

class ChicagoStyleCheesePizza : Pizza(
    name = "Chicago Style Deep Dish Cheese Pizza",
    dough = "Extra Thick Crust Dough",
    sauce = "Plum Tomato Sauce",
    toppings = arrayListOf("Shredded Mozzarella Cheese")
) {
    override fun cut() {
        println("Cutting pizza into square slices")
    }
}