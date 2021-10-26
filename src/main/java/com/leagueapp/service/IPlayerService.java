package com.leagueapp.service;

import java.util.List;

import com.leagueapp.model.Player;

public interface IPlayerService {
Player addPlayer(Player Player);
void updatePlayer(Player Player);
void deletePlayer(int PlayeriD);
Player getById(int PlayerId);
List<Player> getAll();


//retriving values from views
//List <PlayerView> getPlayerView();

//calling stored procedure
//Integer getTotalPlayers(String country);
//
//List<Player> getByPlayerByBoard(String boardName);

}
