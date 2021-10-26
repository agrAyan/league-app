package com.leagueapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leagueapp.model.Board;
import com.leagueapp.repository.IBoardRepository;
@Service
public class BoardServiceImpl implements IBoardService {

	@Autowired
	IBoardRepository ownerRepository;
	
	@Override
	public Board addBoard(Board owner) {
		// TODO Auto-generated method stub
		return ownerRepository.save(owner);
	}

	@Override
	public void updateBoard(Board board) {
		ownerRepository.save(board);

	}

	@Override
	public void deleteBoard(int borderId) {
		ownerRepository.deleteById(borderId);
	}

	@Override
	public Board getById(int borderId) {
		// TODO Auto-generated method stub
		return ownerRepository.findById(borderId).get();
	}

	@Override
	public List<Board> getAll() {
		// TODO Auto-generated method stub
		return ownerRepository.findAll();
	}

}
