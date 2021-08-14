package main.kotlin.factory.v2.pizzaStore

import main.kotlin.factory.pizza.Pizza

interface PizzaStore {
    fun orderPizza(type: String): Pizza =
        createPizza(type).let {
            it.prepare()
            it.bake()
            it.cut()
            it.box()
            it
        }


    fun createPizza(type: String): Pizza
}