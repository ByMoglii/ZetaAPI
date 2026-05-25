package ch.by_moglii.zetaapi.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    public static final String PREFIX = "§7[§cZeta-API§7] » ";

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(PREFIX + "§aZeta-API loaded");
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(PREFIX + "§cZeta-API was shut down or could not be loaded");
    }

}
