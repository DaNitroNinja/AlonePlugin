package me.rishipatwardhan.alonesmpplugin.listeners

import com.destroystokyo.paper.event.player.PlayerJumpEvent
import org.bukkit.event.Listener

class PlayerJumpListener : Listener {

    fun playerJumpListener(event: PlayerJumpEvent) {

        val player = event.player

        player.sendMessage("You Jumped!")

    }

}