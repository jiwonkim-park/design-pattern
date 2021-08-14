package main.kotlin.factory.v2.pizzaStore

import main.kotlin.factory.pizza.Pizza
import main.kotlin.factory.pizza.chicagostyle.ChicagoStlePepperoniPizza
import main.kotlin.factory.pizza.chicagostyle.ChicagoStyleCheesePizza
import main.kotlin.factory.pizza.chicagostyle.ChicagoStyleClamPizza
import main.kotlin.factory.pizza.chicagostyle.ChicagoStyleVeggiePizza
import main.kotlin.factory.pizza.nystle.NYStlePepperoniPizza
import main.kotlin.factory.pizza.nystle.NYStyleCheesePizza
import main.kotlin.factory.pizza.nystle.NYStyleClamPizza
import main.kotlin.factory.pizza.nystle.NYStyleVeggiePizza
import java.lang.IllegalArgumentException

class ChicagoStylePizzaStore: PizzaStore {
    override fun createPizza(type: String): Pizza =
        when (type) {
            "cheese" -> ChicagoStyleCheesePizza()
            "pepperoni" -> ChicagoStlePepperoniPizza()
            "clam" -> ChicagoStyleClamPizza()
            "veggie" -> ChicagoStyleVeggiePizza()
            else -> throw IllegalArgumentException("there is no $type type of pizza")
        }
}