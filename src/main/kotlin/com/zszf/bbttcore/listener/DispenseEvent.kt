package com.zszf.bbttcore.listener

import com.zszf.bbttcore.BukkitPlugin
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.BlockDispenseEvent
import kotlin.random.Random

object DispenseEvent : Listener{
    @EventHandler
    fun dispenseEvent(e : BlockDispenseEvent){
        e.setCancelled(false)
        val R: Random = Random
        if(BukkitPlugin.instance?.config?.getBoolean("enableDispenseDupe") == true) {
            if (R.nextInt(10) < 1) {
                e.block.location.world.dropItem(e.block.location, e.item)
            }
        }
    }
}