package main.kotlin.factory

import main.kotlin.factory.v2.pizzaStore.ChicagoStylePizzaStore
import main.kotlin.factory.v2.pizzaStore.NYStylePizzaStore
import main.kotlin.factory.v2.pizzaStore.PizzaStore

fun main() {
    val nyStore = NYStylePizzaStore()
    val chicagoStore = ChicagoStylePizzaStore()

    val nyPizza = nyStore.orderPizza("cheese")
    println(nyPizza)

    val chicagoPizza = chicagoStore.orderPizza("cheese")
    println(chicagoPizza)
}