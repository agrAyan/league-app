package com.leagueapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leagueapp.model.Sports;
import com.leagueapp.model.SportView;
import com.leagueapp.repository.ISportRepository;
@Service
public class SportServiceImpl implements ISportService {

	@Autowired
	ISportRepository sportRepository;
	
	@Override
	public Sports addSports(Sports sport) {
		// TODO Auto-generated method stub
		return sportRepository.save(sport);
	}

	@Override
	public Sports getById(int sportId) {
		// TODO Auto-generated method stub
		return sportRepository.findById(sportId).get();
	}

	@Override
	public List<Sports> getAll() {
		// TODO Auto-generated method stub
		return sportRepository.findAll();
	}

	@Override
	public List<SportView> getSportView() {
		// TODO Auto-generated method stub
		return null;
		//return sportRepository.getSportView();
	}

}
