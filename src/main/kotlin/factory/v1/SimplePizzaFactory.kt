package main.kotlin.factory.v1

import main.kotlin.factory.pizza.*
import java.lang.IllegalArgumentException

class SimplePizzaFactory {
    fun createPizza(type: String): Pizza =
        when (type) {
            "cheese" -> CheesePizza()
            "pepperoni" -> PepperoniPizza()
            "clam" -> ClamPizza()
            "veggie" -> VeggiePizza()
            else -> throw IllegalArgumentException("there is no $type type of pizza")
        }

}