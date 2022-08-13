package xyz.oreodev.removeoriginal;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public final class RemoveOriginal extends JavaPlugin {

    public final String bar = "====================================================";
    public final String prefix = "[remover] ";

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + prefix + bar);
        Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + prefix + "ON");
        Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + prefix + bar);
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + prefix + bar);
        File file = new File("plugins/original-customMob-1.0-SNAPSHOT.jar");
        Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + prefix + "removing File : " + file.getName());
        file.delete();
        Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + prefix + "removed File : " + file.getName());
        Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + prefix + "OFF");
        Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + prefix + bar);
    }
}
