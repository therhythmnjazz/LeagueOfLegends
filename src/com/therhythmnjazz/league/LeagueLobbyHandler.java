package com.therhythmnjazz.league;

import java.util.HashMap;

public class LeagueLobbyHandler {

    private HashMap<String, LeagueLobby> activeLobbies = new HashMap <String, LeagueLobby>();

    public LeagueLobbyHandler() {

    }

    public void createLobby(String lobbyName, String matchType) {
        activeLobbies.put(lobbyName, new LeagueLobby(lobbyName, matchType));
    }

    public void removeLobby(String lobbyName) {
        activeLobbies.remove(lobbyName);
    }

}
