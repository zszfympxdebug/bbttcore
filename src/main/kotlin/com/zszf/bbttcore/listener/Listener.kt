package com.zszf.bbttcore.listener

import com.zszf.bbttcore.BukkitPlugin
import org.bukkit.Bukkit

class Listener {
    companion object{
        fun registry(){
            Bukkit.getPluginManager().registerEvents(PlayerMoveEvent, BukkitPlugin.instance)
            Bukkit.getPluginManager().registerEvents(superChicken, BukkitPlugin.instance)
        }
    }
}