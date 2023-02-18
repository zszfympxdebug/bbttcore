package com.zszf.bbttcore

import com.zszf.bbttcore.commands.Commands
import com.zszf.bbttcore.listener.Listener
import org.bukkit.plugin.java.JavaPlugin

class BukkitPlugin : JavaPlugin() {
    override fun onEnable() {
        logger.info("Enable bbttcore ${description.version} by zszf")
        logger.info("启用bbttcore ${description.version} 作者为zszf")
        instance = this
        Listener.registry()
        Commands.registry()
    }

    override fun onDisable() {
        logger.info("Disable bbttcore nmsl!")
    }
    companion object{
        var instance: BukkitPlugin? = null;
    }
}