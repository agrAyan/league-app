package com.leagueapp.service;

import java.util.List;

import com.leagueapp.model.League;
import com.leagueapp.model.LeagueView;

public interface ILeagueService {
League addLeague(League league);
void updateLeague(League league);
void deleteLeague(int leagueiD);
League getById(int leagueId);
List<League> getAll();


//retriving values from views
List <LeagueView> getLeagueView();

//calling stored procedure
Integer getTotalLeagues(String country);

List<League> getByLeagueByBoard(String boardName);

}
