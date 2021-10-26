package com.leagueapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;

import com.leagueapp.model.League;
import com.leagueapp.model.LeagueView;
import com.leagueapp.model.Team;

public interface ITeamRepository extends JpaRepository<Team, Integer> {


}
