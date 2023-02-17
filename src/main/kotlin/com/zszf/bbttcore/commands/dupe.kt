package com.zszf.bbttcore.commands

import com.zszf.bbttcore.BukkitPlugin
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

object dupe : CommandExecutor{
    override fun onCommand(
        sender: CommandSender?,
        command: Command?,
        label: String?,
        args: Array<out String>?
    ): Boolean {
        if(sender !is Player){
            println("请在游戏内使用!")
            return true
        }
        if(sender.hasPermission("bbttcore.commandDupe.dupe.use")){
            BukkitPlugin.instance?.config?.let { sender.inventory.itemInMainHand.add(it.getInt("dupe_num")) }
            return true
        }else{
            sender.sendMessage("你没有权限来使用这个命令!")
            return true
        }
    }
}