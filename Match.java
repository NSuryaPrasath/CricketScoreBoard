package team;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Match extends TeamPlayer
{
	String[] team1;
	String[] team2;
	static int fours=0,sixes=0;
	POJO pojo=new POJO();
	int total1=0,total2=0;
	ScoreBoard scoreboard=new ScoreBoard();
	HashMap<Integer,POJO> playerdet=new HashMap<Integer,POJO>();
	TeamPlayer tp=new TeamPlayer();
	//Team teams=new Team();
	//int one1=teams.team1;
	//int two2=teams.team2;
	Random ran=new Random();
	Scanner sc=new Scanner(System.in);
	
	public void getteam(String[] team1player,String[] team2player)
	{
		this.team1=team1player;
		this.team2=team1player;
	}
	public void matchStart(String[] team1play,String[] team2play,int team1,int team2)
	{
		
	}
	
	public void firstInnings(Map<String,String[]> hs,String[] teamplay,String[] teamplay2,String team[],int one,int two)
	{
		POJO pojo=new POJO();
		int wicket=0,four1,six1;
		System.out.println("     Batting Team "+team[one-1]);
		int strike=ran.nextInt(0,11);
		int nostrike=ran.nextInt(0,11);
		ArrayList<Integer> outlist=new ArrayList<Integer>();
		HashMap<Integer,POJO> playerdet=new HashMap<Integer,POJO>();
		ArrayList<Integer> outl=new ArrayList<Integer>();
		outlist.add(strike);
//		for(int i=0;i<11;i++)
//		{
//			pojo.setTeam1PlayerID(i+1);
//			pojo.setTeam1PlayerName(teamplay[i]);
//			pojo.setTeam1PlayerRuns(0);
//			pojo.setTeam1PlayerFours(0);
//			pojo.setTeam1Playersixs(0);
//		}
		while(strike==nostrike)
		{
			nostrike=ran.nextInt(0,6);
		}
		outlist.add(nostrike);
		int playing[]=new int[2];
		playing[0]=strike;
		playing[1]=nostrike;
		System.out.println("Striker     => "+teamplay[strike]+"\nNon-Striker => "+teamplay[nostrike]);
		//System.out.println("     Bowling Team "+team[two-1]);
		//int bowl=ran.nextInt(6,11);
		int bowl=6;
		//System.out.println("Bowler      => "+teamplay2[bowl]);
		for(int i=0;i<10;i++)
		{
			if(bowl==11)
			{
				bowl=6;
			}
			System.out.println("------------------------------------");
			System.out.println("|   Bowler      => "+teamplay2[bowl]+" |");
			System.out.println("------------------------------------");
			for(int j=0;j<6;j++)
			{
				ArrayList<String> listdetails=new ArrayList<String>();
				System.out.println("Enter the run");
				String run=sc.next();
				int player1run=0;
				int player2run=0;
				if(run.equals("1") || run.equals("3"))
				{
					String change=teamplay[strike];
					teamplay[strike]=teamplay[nostrike];
					teamplay[nostrike]=change;
					//if(pojo.getTeam1PlayerName().equals(teamplay[strike]))
					if(strike==playing[0])
					{
						int scoreplayer1=0;
						scoreplayer1+=Integer.parseInt(run);
						pojo.setTeam1PlayerRuns(scoreplayer1);
						pojo.setTeam1PlayerName(teamplay[strike]);
					}
					System.out.println("Striker Change\nStriker     => "+teamplay[strike]+"\nNon-Striker => "+teamplay[nostrike]);
					total1+=Integer.parseInt(run);
					System.out.println(total1+"/"+wicket+"         Overs =>"+(i+1)+"."+(j+1)+"/"+(i+1));
					playerdet.put(strike, pojo);
				}
				else if(run.equals("2"))
				{
					total1+=Integer.parseInt(run);
					System.out.println(total1+"/"+wicket+"         Overs =>"+(i+1)+"."+(j+1)+"/"+(i+1));
				}
				else if(run.equals("4") || run.equals("6"))
				{
					if(run.equals("4"))
					{
						fours++;
					}
					else
					{
						sixes++;
					}
					total1+=Integer.parseInt(run);
					System.out.println(total1+"/"+wicket+"         Overs =>"+(i+1)+"."+(j+1)+"/"+(i+1));
					pojo.setTeam1PlayerFours(fours);
					pojo.setTeam1Playersixs(sixes);
				}
				else if(run.equals("O") || run.equals("LBW"))
				{
					outl.add(wicket);
					wicket++;
					if(outl.size()!=11)
					{
						player
						if(outlist.size()!=11)
						{
							strike=ran.nextInt(0,11);
							while(outlist.contains(strike) && outlist.contains(nostrike))
							{
								strike=ran.nextInt(0,11);
							}
							outlist.add(strike);
							System.out.println("Striker Change\nStriker     => "+teamplay[strike]+"\nNon-Striker => "+teamplay[nostrike]);
							System.out.println(total1+"/"+wicket+"         Overs =>"+(i+1)+"."+(j+1)+"/"+(i+1));
						}
						else
						{
							//System.out.println("Striker Change\nStriker     => "+teamplay[strike]+"\nNon-Striker => "+teamplay[nostrike]);
							System.out.println(total1+"/"+wicket+"         Overs =>"+(i+1)+"."+(j+1)+"/"+(i+1));
							System.out.println(team[one-1]+" has scored "+total1+" runs\nTarget Score for "+team[two-1]+" is "+(total1+1));
							break;
						}
					}
				}
				else
				{
					j--;
				}
			}
			bowl++;
			if(wicket==10)
			{
				break;
			}
			System.out.println();
		}
//		for(int j=0;j<6;j++)
//		{
//			String striker=teamplay[i];
//			String nonstriker=teamplay[i+1];
//			if(run==1 || run==3)
//			{
//				String temp=striker;
//				striker=nonstriker;
//				nonstriker=temp;
//			}
//		}
	}
	public void secondInnings(Map<String,String[]> hs,String[] teamplay,String[] teamplay2,String team[],int one,int two)
	{
		int wicket=0,four,six;
		System.out.println("     Batting Team "+team[one-1]);
		int strike=ran.nextInt(0,11);
		int nostrike=ran.nextInt(0,11);
		ArrayList<Integer> outlist=new ArrayList<Integer>();
		ArrayList<Integer> outl=new ArrayList<Integer>();
		outlist.add(strike);
		while(strike==nostrike)
		{
			nostrike=ran.nextInt(0,6);
		}
		outlist.add(nostrike);
		System.out.println("Striker     => "+teamplay[strike]+"\nNon-Striker => "+teamplay[nostrike]);
		//System.out.println("     Bowling Team "+team[two-1]);
		//int bowl=ran.nextInt(6,11);
		int bowl=6;
		//System.out.println("Bowler      => "+teamplay2[bowl]);
		for(int i=0;i<10;i++)
		{
			if(bowl==11)
			{
				bowl=6;
			}
			System.out.println("------------------------------------");
			System.out.println("|   Bowler      => "+teamplay2[bowl]+" |");
			System.out.println("------------------------------------");
			for(int j=0;j<6;j++)
			{
				System.out.println("Enter the run");
				String run=sc.next();
				if(run.equals("1") || run.equals("3"))
				{
					String change=teamplay[strike];
					teamplay[strike]=teamplay[nostrike];
					teamplay[nostrike]=change;
					System.out.println("Striker Change\nStriker     => "+teamplay[strike]+"\nNon-Striker => "+teamplay[nostrike]);
					total2+=Integer.parseInt(run);
					System.out.println(total2+"/"+wicket+"         Overs =>"+(i+1)+"."+(j+1)+"/"+(i+1));
				}
				else if(run.equals("2") || run.equals("4") || run.equals("6"))
				{
					total2+=Integer.parseInt(run);
					System.out.println(total2+"/"+wicket+"         Overs =>"+(i+1)+"."+(j+1)+"/"+(i+1));
				}
				else if(run.equals("O") || run.equals("LBW"))
				{
					outl.add(wicket);
					wicket++;
					if(outl.size()!=11)
					{
						if(outlist.size()!=11)
						{
							strike=ran.nextInt(0,11);
							while(outlist.contains(strike) && outlist.contains(nostrike))
							{
								strike=ran.nextInt(0,11);
							}
							outlist.add(strike);
							System.out.println("Striker Change\nStriker     => "+teamplay[strike]+"\nNon-Striker => "+teamplay[nostrike]);
							System.out.println(total2+"/"+wicket+"         Overs =>"+(i+1)+"."+(j+1)+"/"+(i+1));
						}
						else
						{
							//System.out.println("Striker Change\nStriker     => "+teamplay[strike]+"\nNon-Striker => "+teamplay[nostrike]);
							System.out.println(total2+"/"+wicket+"         Overs =>"+(i+1)+"."+(j+1)+"/"+(i+1));
							//System.out.println(team[one-1]+" has scored "+total+" runs\nTarget Score for "+team[two-1]+" is "+(total+1));
							break;
						}
					}
				}
				else
				{
					j--;
				}
			}
			bowl++;
			if(wicket==10)
			{
				break;
			}
			System.out.println();
			
		}
//		for(int j=0;j<6;j++)
//		{
//			String striker=teamplay[i];
//			String nonstriker=teamplay[i+1];
//			if(run==1 || run==3)
//			{
//				String temp=striker;
//				striker=nonstriker;
//				nonstriker=temp;
//			}
//		}
	}
	public void winings(int one1,int two2)
	{
		if(total1>total2)
		{
			System.out.println(team[one1-1]+" has won the game by"+(total1-total2));
		}
		else
		{
			System.out.println(team[two2-1]+" has won the game by"+(total2-total1));
		}
		scoreboard.score();
	}
//	public static void main(String[] args) 
//	{
//		// TODO Auto-generated method stub
//		
//	}
}
