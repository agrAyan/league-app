package com.leagueapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leagueapp.model.Team;
import com.leagueapp.repository.ITeamRepository;
@Service
public class TeamServiceImpl implements ITeamService {

	@Autowired
	ITeamRepository teamRepository;
	
	@Override
	public Team addTeam(Team team) {
		return teamRepository.save(team);
	}

	@Override
	public void updateTeam(Team team) {
		 teamRepository.save(team);
	}

	@Override
	public void deleteTeam(int teamiD) {
		 teamRepository.deleteById(teamiD);
	}

	@Override
	public Team getById(int teamId) {
		 return teamRepository.findById(teamId).get();
	}

	@Override
	public List<Team> getAll() {
		return teamRepository.findAll();
	}

	@Override
	public List<Team> getByPlayerName(String playerName) {
		return null;
	}

}
