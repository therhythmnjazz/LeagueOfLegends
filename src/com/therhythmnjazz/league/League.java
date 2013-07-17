package com.therhythmnjazz.league;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class League extends JavaPlugin {

    private LeagueLobbyHandler lobbyHandler = new LeagueLobbyHandler();

    public void onEnable() {

    }

    public void onDisable() {

    }

    public LeagueLobbyHandler getLobbyHandler() {
        return lobbyHandler;
    }

    public String getChatTemplate() {
        return ChatColor.WHITE + "[" + ChatColor.DARK_RED + "] ";
    }

}