package com.leagueapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leagueapp.model.Fixtures;
import com.leagueapp.model.Team;
import com.leagueapp.service.ITeamService;

@RestController
@RequestMapping("ics-league-api")
@CrossOrigin("http://localhost:4200")
public class TeamController {

	@Autowired
	ITeamService teamService;
	
	@GetMapping("/teams")
	public List<Team> getAll() {
		return teamService.getAll();
	}
	

	@GetMapping("/teams/{teamId}")
	public Team getFixtureId(@PathVariable("teamId") int teamId) {
		return teamService.getById(teamId);
	}
	
}
