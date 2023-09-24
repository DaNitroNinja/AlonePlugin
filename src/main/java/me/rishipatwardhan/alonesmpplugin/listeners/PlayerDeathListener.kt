package me.rishipatwardhan.alonesmpplugin.listeners

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.PlayerDeathEvent

class PlayerDeathListener : Listener {

    @EventHandler
    fun playerDeathEvent(event: PlayerDeathEvent) {

        val player = event.player

        player.sendMessage("You Died")


    }

}