package main.kotlin.command.stereo

import main.kotlin.command.Command

class StereoOffCommand(
    val stereo: Stereo
): Command {
    override fun execute() {
        stereo.off()
    }
}