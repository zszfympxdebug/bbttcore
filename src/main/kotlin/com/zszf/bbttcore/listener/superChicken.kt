package com.zszf.bbttcore.listener

import com.zszf.bbttcore.BukkitPlugin
import org.bukkit.entity.EntityType
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerInteractEntityEvent
import org.bukkit.inventory.ItemStack
import java.util.HashMap
import java.util.UUID

object superChicken : Listener {
    private val dupeNum: Int = (BukkitPlugin.instance?.config?.getInt("superChicken_dupeNum") ?: 5)
    private val playerCDMap: MutableMap<UUID, Long> = HashMap()
    @EventHandler
    public fun playerInteractEntityEvent(e: PlayerInteractEntityEvent){
        // 判断冷却
        if(e.player is Player){
            if(e.rightClicked.type.equals(EntityType.CHICKEN)) {
                var playerLastDupeTime: Long? = playerCDMap[e.rightClicked.uniqueId]
                if (playerLastDupeTime != null) {
                    if (playerLastDupeTime + (BukkitPlugin.instance?.config?.getLong("superChicken_dupeCD")
                            ?: 1000) < System.currentTimeMillis()
                    ){
                        playerCDMap.put(e.rightClicked.uniqueId ,System.currentTimeMillis())
                    }else{
                        e.player.sendMessage("鸡刷正在冷却!")
                        return
                    }
                }else{
                    playerCDMap.put(e.rightClicked.uniqueId, System.currentTimeMillis())
                }
            }
        }
        if(BukkitPlugin.instance?.config?.getBoolean("superChicken_enable") == true){
            if(e.player.hasPermission("bbttcore.superchicken.use")){
                for (i in 0 until BukkitPlugin.instance!!.config.getInt("superChicken_dupeNum")){
                    e.player.world.dropItem(e.rightClicked.location, ItemStack(e.player.inventory.itemInMainHand))
                }
            }else{
                e.player.sendMessage("你没有权限来使用鸡刷！")
            }
        }
    }
}