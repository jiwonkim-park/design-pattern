package main.kotlin.command.stereo

import main.kotlin.command.Command

class StereoOnCommand(
    val stereo: Stereo
): Command {
    override fun execute() {
        stereo.on()
        stereo.setCd()
        stereo.setVolume(11)
    }

}