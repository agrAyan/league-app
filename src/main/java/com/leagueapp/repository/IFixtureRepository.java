package com.leagueapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;

import com.leagueapp.model.Fixtures;
import com.leagueapp.model.League;
import com.leagueapp.model.LeagueView;

public interface IFixtureRepository extends JpaRepository<Fixtures, Integer> {


}
