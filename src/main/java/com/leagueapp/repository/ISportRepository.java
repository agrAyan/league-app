package com.leagueapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.leagueapp.model.Sports;
import com.leagueapp.model.SportView;
@Repository
public interface ISportRepository extends JpaRepository<Sports, Integer> {
//	@Query(value="select * from sportview", nativeQuery = true)
//	List<SportView> getSportView();
}
