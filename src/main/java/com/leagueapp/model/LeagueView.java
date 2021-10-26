package com.leagueapp.model;

//retrieving data from the view
public interface LeagueView {

	//create getter methods for column in views
	// column names should be in caps
	
	String getLEAGUE_NAME();
	int getDURATION_IN_MONTHS();
	String getCOUNTRY();
}
