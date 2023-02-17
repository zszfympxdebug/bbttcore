package com.zszf.bbttcore.commands

import org.bukkit.Bukkit


class Commands {
    companion object{
        fun registry(){
            Bukkit.getPluginCommand("dupe").setExecutor(dupe)
            Bukkit.getPluginCommand("delitem").setExecutor(delItem)
        }
    }
}