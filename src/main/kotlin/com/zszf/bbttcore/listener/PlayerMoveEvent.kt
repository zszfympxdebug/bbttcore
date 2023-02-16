package com.zszf.bbttcore.listener

import com.zszf.bbttcore.BukkitPlugin
import org.bukkit.Material
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerMoveEvent
import org.bukkit.inventory.ItemStack

object PlayerMoveEvent : Listener {
    @EventHandler
    public fun playerMoveEvent(e: PlayerMoveEvent) {
        if (BukkitPlugin.instance?.config?.getBoolean("elytraSpeedLimit") == true) {
            if (e.player.inventory.chestplate == ItemStack(Material.ELYTRA) && Math.abs(e.from.x - e.to.x) + Math.abs(e.from.y - e.to.y) >= (BukkitPlugin.instance?.config?.getInt(
                    "elytraSpeedLimitV"
                ) ?: 5)
            ) {
                e.player.location.set(e.from.x, e.from.y, e.from.z)
            }
        }
    }
}