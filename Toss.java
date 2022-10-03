package team;

import java.util.*;
public class Toss
{
	public static String team1,team2;
	public int userInput;
	public static int autoValue;
	public void toss(String[] team,int team1,int team2)
	{
		TeamPlayer tp=new TeamPlayer();
		Match mat=new Match();
		ScoreBoard scoreboard=new ScoreBoard();
		Scanner sc=new Scanner(System.in);
		Random random=new Random();
		autoValue=random.nextInt(1,3);
		System.out.println("Enter 1 --> Head\n      2 --> Tail");
		int user=sc.nextInt();
		if(user==autoValue)
		{
			System.out.println(team[team1-1]+" won the toss");
			System.out.println("Select 1 --> Batting\n       2 --> Bowling");
			int playing=sc.nextInt();
			if(playing==1)
			{
				System.out.println(team[team1-1]+" choose to Batting\n"+team[team2-1]+" has to Bowling");
				mat.firstInnings(tp.team1player,tp.team2player,team,team1,team2);
				System.out.println(team[team2-1]+" ==> BOWLING\n"+team[team1-1]+" ==> BATTING");
				mat.secondInnings(tp.team2player,tp.team1player,team,team2,team1);
				mat.winings(team1,team2);
			}
			else
			{
				System.out.println(team[team1-1]+" choose to Bowling\n"+team[team2-1]+" has to Batting");
				mat.firstInnings(tp.team2player,tp.team1player,team, team2,team1);
				System.out.println(team[team2-1]+" ==> Batting\n"+team[team1-1]+" ==> Bowling");
				mat.secondInnings(tp.team1player,tp.team2player,team,team1,team2);
				mat.winings(team1,team2);
			}
			mat.matchStart(tp.team1player,tp.team2player,team1,team2);
		}
		else
		{
			System.out.println(team[team2-1]+" won the toss");
			System.out.println("Select 1 --> Batting\n       2 --> Bowling");
			int playing=sc.nextInt();
			if(playing==1)
			{
				System.out.println(team[team2-1]+" choose to Batting\n"+team[team1-1]+" has to Bowling");
				mat.firstInnings(tp.team2player,tp.team1player,team,team2,team1);
				System.out.println(team[team1-1]+" ==> BATTING\n"+team[team2-1]+" ==> BOWLING");
				mat.secondInnings(tp.team1player,tp.team2player,team,team1,team2);
				mat.winings(team1,team2);
			}
			else
			{
				System.out.println(team[team2-1]+" choose to Bowling\n"+team[team1-1]+" has to Batting");
				mat.firstInnings(tp.team1player,tp.team2player,team, team1,team2);
				System.out.println(team[team1-1]+" ==> Batting\n"+team[team2-1]+" ==> Bowling");
				mat.secondInnings(tp.team2player,tp.team1player,team,team2,team1);
				mat.winings(team1,team2);
			}
		}
	}
}
