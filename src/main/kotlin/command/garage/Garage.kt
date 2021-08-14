package main.kotlin.command.garage

import main.kotlin.command.light.Light

class Garage(
    private val light: Light
) {
    fun up() = println("garage up")

    fun down() = println("garage down")

    fun stop() = println("garage stop")

    fun lightOn() = light.on()

    fun lightOff() = light.off()
}