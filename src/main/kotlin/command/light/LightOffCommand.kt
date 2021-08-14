package main.kotlin.command.light

import main.kotlin.command.Command

class LightOffCommand(
    val light: Light
): Command {
    override fun execute() {
        light.off()
    }
}