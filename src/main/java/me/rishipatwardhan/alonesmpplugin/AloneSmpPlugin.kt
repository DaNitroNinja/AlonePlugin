package me.rishipatwardhan.alonesmpplugin

import me.rishipatwardhan.alonesmpplugin.listeners.PlayerDeathListener
import me.rishipatwardhan.alonesmpplugin.listeners.PlayerJumpListener
import org.bukkit.plugin.java.JavaPlugin

class AloneSmpPlugin : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        logger.warning("Plugin Has Loaded!")

        registerListeners()
    }

    private fun registerListeners() {

        server.pluginManager.registerEvents(PlayerDeathListener(), this)
        server.pluginManager.registerEvents(PlayerJumpListener(), this)

        logger.warning("All Listeners Have Been Registered!")

    }

    override fun onDisable() {
        // Plugin shutdown logic
        logger.warning("Plugin Has Unloaded!")
    }
}
