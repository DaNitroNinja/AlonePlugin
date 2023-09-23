package me.rishipatwardhan.alonesmpplugin

import org.bukkit.plugin.java.JavaPlugin

class AloneSmpPlugin : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        logger.info("Hello World")


    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
