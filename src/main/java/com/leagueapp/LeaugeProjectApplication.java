package com.leagueapp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.leagueapp.model.Board;
import com.leagueapp.model.Fixtures;
import com.leagueapp.model.League;
import com.leagueapp.model.Player;
import com.leagueapp.model.Sports;
import com.leagueapp.model.Team;
import com.leagueapp.service.IBoardService;
import com.leagueapp.service.ILeagueService;
import com.leagueapp.service.ISportService;

@SpringBootApplication
public class LeaugeProjectApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(LeaugeProjectApplication.class, args);
	}

	@Autowired
	ILeagueService leagueService;
	
	@Autowired
	IBoardService boardService;
	
	@Autowired
	ISportService sportsService;
	
	
	@Override
	public void run(String... args) throws Exception {
		

		 
		 Board board= new Board("Kalan","Andhara","assets/images/board/cmember");
		// boardService.addBoard(board);
//		 
		 
		 
			
			Sports csports = new Sports("Cricket","England","/assets/images/sports/cricket.jpg");
		//	sportsService.addSports(csports);
//			Sports tsports = new Sports("Tennis","England","/assets/images/sports/tennis.jpg");
//			sportsService.addSports(tsports);
//			Sports fsports = new Sports("Football","England","/assets/images/sports/football.jpg");
//			sportsService.addSports(fsports);

//		
//		 Sport sport= new Sport("VolleyBall","Argtina");
//		 Sport sport1= new Sport("Badminton","India");
//		 sportService.addSport(sport1);
//		 sportService.addSport(sport);
//-------------------------------------------------------------------------------------------------------------------		
		Player playerOne = new Player("Virat", 22, "banglore", "/assets/images/players/virat.jpg");
		Player playerTwo = new Player("KlRahul", 2, "Delhi", "/assets/images/players/rahul.jpg");
		Player playerThree = new Player("Abd", 32, "SouthAfrica", "/assets/images/players/abd.jpg");
		Player playerFour = new Player("quniton-dcok", 25, "cape-town", "/assets/images/players/quinton.jpg");
		Player playerFive = new Player("Dilshn", 22, "srilanka", "/assets/images/players/dilshan.jpg");
		Player playerSix = new Player("Mahila Jaya", 32, "srilanka", "/assets/images/players/mahila.jpg");
		Set<Player> playerOneTeam = new HashSet<>(Arrays.asList(playerOne, playerTwo));
		Set<Player> playerTwoTeam = new HashSet<>(Arrays.asList(playerThree, playerFour));
		Set<Player> playerThreeTeam = new HashSet<>(Arrays.asList(playerFive, playerFive));
		Team teamOne = new Team("India", "Bcci", playerOneTeam, "/assets/images/team/india.jpg");
		Team teamTwo = new Team("South Africa", "SACA", playerTwoTeam, "/assets/images/team/southafrica.jpg");
		Team teamThree = new Team("Sri Lanka", "SLCA", playerThreeTeam, "/assets/images/team/srilanka.jpg");
		 Set<Team> teamOneSet= new HashSet<>(Arrays.asList(teamOne));
		 Set<Team> teamTwoSet= new HashSet<>(Arrays.asList(teamTwo));
		 Set<Team> teamThreeSet= new HashSet<>(Arrays.asList(teamThree));
		 
		 Fixtures fixtureOne= new Fixtures("India vs SouthAfrica","Lords","/assets/images/fixtures/fixtureOne.jpg");
	      fixtureOne.setTeams(teamOneSet);
	      
	      Fixtures fixtureTwo= new Fixtures("India vs SriLanka","Lords","/assets/images/fixtures/fixtureTwo.jpg");
	      fixtureTwo.setTeams(teamTwoSet);
	      
	      Fixtures fixtureThree= new Fixtures("SouthAfrica vs SriLanka","lords","/assets/images/fixtures/fixtureTwo.jpg");
	      fixtureTwo.setTeams(teamTwoSet);
	      Set<Fixtures> fixturesSet= new HashSet<>(Arrays.asList(fixtureOne, fixtureTwo, fixtureThree));
	      
//================================================================================================================================	      
	      
//		 Team teamThree= new Team("Mi","Ambani");
//		 Team teamFour= new Team("DC","BILRA");
//		 Set<Team> teams2= new HashSet<>(Arrays.asList(teamThree, teamFour));
//		 match1.setTeams(teams);
//	
			
			//---------------------------------------------------------------------------------------
		League league = new League();
		league.setBoard(board);
		league.setCountry("Dubai");
		league.setDurationInMonths(45);
		league.setFixtures(fixturesSet);
		league.setLeagueImg("/assets/images/league/league.jpg");
		league.setName("IPL");
		league.setSports(csports);
		// leagueService.addLeague(league);
		 
		 
		 //===============================================================================
		 // TODO Auto-generated method stub
		//
	//	Board board1= new Board("Avinash","Ayodha","Bussiness");
		
//		ownerService.addOwner(owner);
		//ownerService.addBoard(board1);
		
		
		//Owner owner= ownerService.getById(202);
		
		
		//Owner owner
		//Owner owner1= new Owner("Ayush","Sagar","Bussiness");
		//League league=new League("T-20",5,"USA");
		
		//league.setOwner(owner);
		//League league1=new League("Football",5,"USA", matchSet);
		//Owner owner= new Owner("Ayan","Sagar","First Class");
		//league1.setOwner(owner);
		//ownerService.save(owner);
		//System.out.println("added "+leagueService.addLeague(league1));
			//leagueService.addLeague(league);
		
		//League oneLeague= leagueService.getById(102);
		//leagueService.deleteLeague(101);
		
//	List<LeagueView> leagueView=	leagueService.getLeagueView();
//	for(LeagueView leagueViewI: leagueView) {
//		System.out.println(leagueViewI.getLEAGUE_NAME());
//		System.out.println(leagueViewI.getDURATION_IN_MONTHS());
//		System.out.println(leagueViewI.getCOUNTRY());
//		System.out.println();
//	}
		
		
//		List<SportView> sportView=	sportService.getSportView();
//		for(SportView sportViewI: sportView) {
//			System.out.println(sportViewI.getBOARD_NAME());
//			System.out.println(sportViewI.getDURATION_IN_MONTHS());
//			System.out.println(sportViewI.getLEAGUE_NAME());
//			System.out.println(sportViewI.getSPORT_NAME());
//			System.out.println(sportViewI.getSQUARDS());
//			System.out.println(sportViewI.getSTADIUM());
//			//System.out.println(sportViewI.get);
//			System.out.println();
//		}
		//System.out.println(leagueService.getTotalLeagues("USA"));
		//System.out.println(leagueService.getByLeagueByBoard("TEJA"));
	}

}
