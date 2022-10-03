package team;

import java.util.ArrayList;
import java.util.HashMap;

public class ScoreBoard{
	POJO pojo=new POJO();
	public void score(HashMap<Integer,POJO> playerdet,HashMap<Integer,POJO> playerdet2,String team[],int team1,int team2,int total1,int total2)
	{
		System.out.println("****************************SCORE BOARD*************************");
		System.out.println("-------------------------------  -------------------------------");
		System.out.printf("|%-29s|%-2s|%-29s|\n",team[team1-1]," ",team[team2-1]);
		System.out.println("-------------------------------  -------------------------------");
		System.out.printf("|%-20s|%-2s|%-1s|%-1s|%-2s|%-20s|%-2s|%-1s|%-1s|\n","  Player","R","4s","6s"," ","  Player","R","4s","6s");
		System.out.println("-------------------------------  --------------------------------");
		for(int i=0;i<11;i++)
		{
			System.out.printf("|%-20s|%-2s|%-2s|%-2s|%-2s|%-20s|%-2s|%-2s|%-2s|\n",playerdet.get(i).getTeam1PlayerName(),playerdet.get(i).getTeam1PlayerRuns(),playerdet.get(i).getTeam1PlayerFours(),playerdet.get(i).getTeam1Playersixs()," ",playerdet2.get(i).getTeam1PlayerName(),playerdet2.get(i).getTeam1PlayerRuns(),playerdet2.get(i).getTeam1PlayerFours(),playerdet2.get(i).getTeam1Playersixs());
			System.out.println("-------------------------------  -------------------------------");
		}
		System.out.printf("|Total%24s|%-2s|Total%24s|",total1," ",total2);
	}
}
