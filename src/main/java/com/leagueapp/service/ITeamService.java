package com.leagueapp.service;

import java.util.List;


import com.leagueapp.model.Team;

public interface ITeamService {
Team addTeam(Team Team);
void updateTeam(Team Team);
void deleteTeam(int TeamiD);
Team getById(int TeamId);
List<Team> getAll();
List <Team> getByPlayerName(String playerName);

//retriving values from views
//List <TeamView> getTeamView();

//calling stored procedure
//Integer getTotalTeams(String country);
//
//List<Team> getByTeamByBoard(String boardName);

}
