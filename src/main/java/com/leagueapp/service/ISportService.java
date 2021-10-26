package com.leagueapp.service;

import java.util.List;

import com.leagueapp.model.Sports;
import com.leagueapp.model.SportView;



public interface ISportService {
Sports addSports(Sports sport);

Sports getById(int sportId);
List<Sports> getAll();
List<SportView> getSportView();

}
