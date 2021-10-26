package com.leagueapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leagueapp.model.Sports;
import com.leagueapp.model.Team;
import com.leagueapp.service.ISportService;

@RestController
@RequestMapping("ics-league-api")
@CrossOrigin("http://localhost:4200")
public class SportsController {

	@Autowired
	ISportService sportService;
	
	@GetMapping("/sports")
	public List<Sports> getAll() {
		return sportService.getAll();
	}

	@GetMapping("/sports/{sportId}")
	public Sports getFixtureId(@PathVariable("sportId") int sportId) {
		return sportService.getById(sportId);
	}
	
}
