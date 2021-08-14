package main.kotlin.factory.v2.pizzaStore

import main.kotlin.factory.pizza.nystle.NYStyleCheesePizza
import main.kotlin.factory.pizza.Pizza
import main.kotlin.factory.pizza.nystle.NYStlePepperoniPizza
import main.kotlin.factory.pizza.nystle.NYStyleClamPizza
import main.kotlin.factory.pizza.nystle.NYStyleVeggiePizza
import java.lang.IllegalArgumentException

class NYStylePizzaStore: PizzaStore {
    override fun createPizza(type: String): Pizza =
        when (type) {
            "cheese" -> NYStyleCheesePizza()
            "pepperoni" -> NYStlePepperoniPizza()
            "clam" -> NYStyleClamPizza()
            "veggie" -> NYStyleVeggiePizza()
            else -> throw IllegalArgumentException("there is no $type type of pizza")
        }
}