package dev.aarow.oneblock;

import dev.aarow.oneblock.listeners.impl.JoinListeners;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

public class OneBlock extends JavaPlugin {

    @Getter private static OneBlock instance;

    @Override
    public void onEnable() {
        this.instance = this;


    }

    private void registerListeners(){
        new JoinListeners();
    }
}
