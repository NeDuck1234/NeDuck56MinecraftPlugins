package org.NeDuck.conveniencePlugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class ConveniencePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Test Start");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Test Done");
    }
}
