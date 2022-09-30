package team;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Team
{
	String teamName,captain;
	int team1,team2;
	public void getTeamDetails()
	{
		TeamPlayer teamplayer=new TeamPlayer();
		Toss toss=new Toss();
		Scanner scan=new Scanner(System.in);
		System.out.println("---- Cricket Score Board Console ----\n\n");
		System.out.println("1 --> START GAME ");
		int choice=scan.nextInt();
		if(choice==1)
		{
			System.out.println("1  --> India\n2  --> West Indies\n3  --> Australia\n4  --> England\n5  --> NewZealand\n6  --> Pakistan\n7  --> SouthAfrica\n8  --> Afghanistan\n9  --> SriLanka\n10 --> Bangladesh");
			System.out.println("Select Your Team 1");
		    team1=scan.nextInt();
		    System.out.println("1  --> India\n2  --> West Indies\n3  --> Australia\n4  --> England\n5  --> NewZealand\n6  --> Pakistan\n7  --> SouthAfrica\n8  --> Afghanistan\n9  --> SriLanka\n10 --> Bangladesh");
		    System.out.println("Select Your Team 2");
		    team2=scan.nextInt();
		    if(team1==team2)
		    {
		    	System.out.println("Warning: You hava Entered Same Team");
		    	getTeamDetails();
		    }
			teamplayer.teamDetails(team1, team2);
		}
		toss.toss(teamplayer.hs,teamplayer.team, team1, team2);
	}
	public static void main(String args[])
	{
		Team t=new Team();
		t.getTeamDetails();
	}
}