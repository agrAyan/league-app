package com.leagueapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leagueapp.model.Board;

public interface IBoardRepository extends JpaRepository<Board, Integer> {

}
