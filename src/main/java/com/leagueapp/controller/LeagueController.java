package com.leagueapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leagueapp.model.League;
import com.leagueapp.service.ILeagueService;

@RestController
@RequestMapping("ics-league-api")
@CrossOrigin("http://localhost:4200")
public class LeagueController {

	@Autowired
	ILeagueService leagueService;
	
	@GetMapping("/league")
	public List<League> getAll() {
		return leagueService.getAll();
	}

	@GetMapping("/league/{leagueId}")
	public League getLeagueById(@PathVariable("leagueId") int leagueId) {
		return leagueService.getById(leagueId);
	}
	
}
