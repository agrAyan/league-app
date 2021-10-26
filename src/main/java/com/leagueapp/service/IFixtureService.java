package com.leagueapp.service;

import java.util.List;

import com.leagueapp.model.Fixtures;

public interface IFixtureService {
Fixtures addFixtures(Fixtures Fixtures);
void updateFixtures(Fixtures Fixtures);
void deleteFixtures(int FixturesiD);
Fixtures getById(int FixturesId);
List<Fixtures> getAll();


//retriving values from views
//List <FixturesView> getFixturesView();

//calling stored procedure
//Integer getTotalFixturess(String country);

List<Fixtures> getByFixturesByLeague(String leagueName);

List<Fixtures> getByFixturesByTeamName(String teamName);
}
