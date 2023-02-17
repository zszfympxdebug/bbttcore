package com.zszf.bbttcore.commands

import com.zszf.bbttcore.BukkitPlugin
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.EntityType

object delItem : CommandExecutor {
    override fun onCommand(
        sender: CommandSender?,
        command: Command?,
        label: String?,
        args: Array<out String>?
    ): Boolean {
        for(i in BukkitPlugin.instance?.server?.worlds!!){
            for(j in i.entities){
                if (j.type == EntityType.DROPPED_ITEM){
                    j.remove()
                }
            }
        }
        return true
    }
}