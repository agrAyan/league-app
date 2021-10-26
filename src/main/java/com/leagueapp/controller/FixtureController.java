package com.leagueapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leagueapp.model.Fixtures;
import com.leagueapp.service.IFixtureService;

@RestController
@RequestMapping("ics-league-api")
@CrossOrigin("http://localhost:4200")
public class FixtureController {

	@Autowired
	IFixtureService fixtureService;
	
	@GetMapping("/fixtures")
	public List<Fixtures> getAll() {
		return fixtureService.getAll();
	}

	@GetMapping("/fixtures/{fixtureId}")
	public Fixtures getFixtureId(@PathVariable("fixtureId") int fixtureId) {
		return fixtureService.getById(fixtureId);
	}
	
}
