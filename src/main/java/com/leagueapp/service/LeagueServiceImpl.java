package com.leagueapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leagueapp.model.League;
import com.leagueapp.model.LeagueView;
import com.leagueapp.repository.ILeagueRepository;
@Service
public class LeagueServiceImpl implements ILeagueService {
	
	@Autowired
	ILeagueRepository leagueRepository;
	
	
	@Override
	public League addLeague(League league) {
		// TODO Auto-generated method stub
		return leagueRepository.save(league);
	}

	@Override
	public void updateLeague(League league) {
		 leagueRepository.save(league);

	}

	@Override
	public void deleteLeague(int leagueiD) {
		leagueRepository.deleteById(leagueiD);

	}

	@Override
	public League getById(int leagueId) {
		// TODO Auto-generated method stub
		return leagueRepository.findById(leagueId).get();
	}

	@Override
	public List<League> getAll() {
		// TODO Auto-generated method stub
		return leagueRepository.findAll();
	}

	@Override
	public List<LeagueView> getLeagueView() {
		// TODO Auto-generated method stub
		return null;
		//return leagueRepository.getLeagueDetails();
	}

	@Override
	public Integer getTotalLeagues(String country) {
		// TODO Auto-generated method stub
		//return leagueRepository.GET_LEAGUE_COUNT(country);
		//return leagueRepository.getTotalLeague(country);
		return null;
	}

	@Override
	public List<League> getByLeagueByBoard(String boardName) {
		// TODO Auto-generated method stub
		//return leagueRepository.getByLeagueByBoard(boardName);
		return null;
	}

}
