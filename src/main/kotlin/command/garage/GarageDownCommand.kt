package main.kotlin.command.garage

import main.kotlin.command.Command

class GarageDownCommand(
    private val garage: Garage
): Command {
    override fun execute() {
        garage.down()
    }
}