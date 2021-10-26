package com.leagueapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.leagueapp.model.Fixtures;
import com.leagueapp.repository.IFixtureRepository;
@Service
public class FixtureServiceImpl implements IFixtureService {

	@Autowired
	IFixtureRepository fixtureRepository;
	@Override
	public Fixtures addFixtures(Fixtures fixtures) {
		// TODO Auto-generated method stub
		return fixtureRepository.save(fixtures);
	}

	@Override
	public void updateFixtures(Fixtures fixtures) {
		 fixtureRepository.save(fixtures);

	}

	@Override
	public void deleteFixtures(int fixturesiD) {
		 fixtureRepository.deleteById(fixturesiD);

	}

	@Override
	public Fixtures getById(int fixturesId) {
		// TODO Auto-generated method stub
		return fixtureRepository.findById(fixturesId).get();
	}

	@Override
	public List<Fixtures> getAll() {
		// TODO Auto-generated method stub
		return fixtureRepository.findAll(Sort.by(Direction.ASC,"squads"));
	}

//	@Override
//	public Integer getTotalFixturess(String country) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public List<Fixtures> getByFixturesByLeague(String leagueName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Fixtures> getByFixturesByTeamName(String teamName) {
		// TODO Auto-generated method stub
		return null;
	}

}
