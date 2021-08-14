package main.kotlin.command.garage

import main.kotlin.command.Command

class GarageUpCommand(
    private val garage: Garage
): Command {
    override fun execute() {
        garage.up()
    }
}