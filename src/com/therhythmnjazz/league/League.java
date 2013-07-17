package com.therhythmnjazz.league;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public class League extends JavaPlugin {

    private LeagueLobbyHandler lobbyHandler = new LeagueLobbyHandler();

    public static File arenasConfigFile;

    public static FileConfiguration arenasYML;

    public void onEnable() {

        FileConfiguration config = getConfig();

        // Add Default Config here

        getConfig().options().copyDefaults(true);
        saveConfig();
        saveDefaultConfig();

        String pluginFolder = getDataFolder().getAbsolutePath();

        arenasConfigFile = new File(pluginFolder + File.separator + "Arenas.yml");

        if(!arenasConfigFile.exists()){
            try{
                arenasConfigFile.mkdir();
            }catch(Exception Ex){
                getLogger().severe("Unable to create Arenas config file!");
            }try{
                arenasYML.load(arenasConfigFile);
            }catch(Exception Ex){
                getLogger().severe("Unable to load Arenas.YML");
            }
        }

        getLogger().info("Plugin enabled!");
    }

    public void onDisable() {


        getLogger().info("Plugin disabled!");
    }

    public LeagueLobbyHandler getLobbyHandler() {
        return lobbyHandler;
    }

    public String chatTemplate(String message, ChatColor color){
        return ChatColor.WHITE + "[" + ChatColor.DARK_RED + "LoL" + ChatColor.WHITE + "] " + color + message;
    }

}
