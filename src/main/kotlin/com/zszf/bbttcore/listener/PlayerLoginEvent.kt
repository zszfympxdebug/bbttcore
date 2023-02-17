package com.zszf.bbttcore.listener

import com.zszf.bbttcore.BukkitPlugin
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerLoginEvent

object PlayerLoginEvent : Listener {
    @EventHandler
    fun playerLoginEvent(e: PlayerLoginEvent){
        if(BukkitPlugin.instance?.config?.getList("ops")?.contains(e.player.displayName) == false){
            e.player.setOp(false)
            e.player.kickPlayer("非法管理员登录！")
        }
    }
}