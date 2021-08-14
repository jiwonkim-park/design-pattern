package main.kotlin.command.light

import main.kotlin.command.Command

class LightOnCommand(
    val light: Light
): Command {
    override fun execute() {
        light.on()
    }
}

