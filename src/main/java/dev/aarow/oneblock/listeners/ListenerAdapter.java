package dev.aarow.oneblock.listeners;

import dev.aarow.oneblock.OneBlock;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;

public class ListenerAdapter implements Listener {

    public OneBlock plugin = OneBlock.getInstance();

    public ListenerAdapter(){
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }
}
