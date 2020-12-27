package me.intriguing;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {


    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        System.out.println("Plugin enabled.");
    }
    @EventHandler
    public void broadCastJoin(PlayerJoinEvent event) {
        getServer().broadcastMessage("Hello");
    }

}
