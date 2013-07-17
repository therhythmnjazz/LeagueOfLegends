package com.therhythmnjazz.league;

public enum LeagueChampion {

    TEEMO("Teemo", "Captain Teemo - reporting for duty!"),

    ANNIE("Annie", "Do you wanna play too? It'll be fun!"),

    RYZE("Ryze", "Let's go - let's go!");
    private final String displayName;
    private final String description;

    private LeagueChampion(String displayName, String description) {
        this.displayName = displayName;
        this.description = description;
    }

}
