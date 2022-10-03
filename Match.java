package team;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Match extends TeamPlayer
{
	String[] team1;
	String[] team2;
	ArrayList<Integer> outlist=new ArrayList<Integer>();
	static int fours=0,sixes=0;
	POJO pojo=new POJO();
	int total1=0,total2=0,scoreplayer1=0;
	ScoreBoard scoreboard=new ScoreBoard();
	HashMap<Integer,POJO> playerdet=new HashMap<Integer,POJO>();
	HashMap<Integer,POJO> playerdet2=new HashMap<Integer,POJO>();
	TeamPlayer tp=new TeamPlayer();
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
	static int v=0;
	public void add(String[] teamplay,int one)
	{
		POJO pojo;
		for(int i=0;i<teamplay.length;i++)
		{
			pojo=new POJO();
			pojo.setTeam1PlayerID(i);
			pojo.setTeam1PlayerName(teamplay[i]);
			pojo.setTeam1PlayerRuns(0);
			pojo.setTeam1PlayerFours(0);
			pojo.setTeam1Playersixs(0);
			if(v%2==0)
			{
				playerdet.put(pojo.getTeam1PlayerID(), pojo);
			}
			else
			{
				playerdet2.put(pojo.getTeam1PlayerID(),pojo);
			}
		}
		v++;
	}
	public void firstInnings(String[] teamplay,String[] teamplay2,String team[],int one,int two)
	{
		add(teamplay,one);
		int wicket=0;
		System.out.println("     Batting Team "+team[one-1]);
		int strike=ran.nextInt(0,11);
		int nostrike=ran.nextInt(0,11);
		ArrayList<Integer> outlist=new ArrayList<Integer>();
		ArrayList<Integer> outl=new ArrayList<Integer>();
		outlist.add(strike);
		while(strike==nostrike)
		{
			nostrike=ran.nextInt(0,11);
		}
		outlist.add(nostrike);
		int playing[]=new int[2];
		playing[0]=strike;
		playing[1]=nostrike;
		int scoreplayer1=0;
		int scoreplayer2=0;
		int fours=0;
		int sixes=0;
		int bowl=6;
		System.out.println("\nStriker     => "+teamplay[strike]+"\nNon-Striker => "+teamplay[nostrike]);
		for(int i=0;i<5;i++)
		{
			System.out.println("\nOver => "+(i+1)+"\n\n\n");
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
					//if(strike==playing[0])
					//{
							scoreplayer1=Integer.parseInt(run)+playerdet.get(strike).getTeam1PlayerRuns();
							playerdet.get(strike).setTeam1PlayerRuns(scoreplayer1);
					//}
					total1+=Integer.parseInt(run);
					System.out.println(total1+"/"+wicket+"         Overs =>"+(i+1)+"."+(j+1)+"/"+(i+1));
					int t=strike;
					strike=nostrike;
					nostrike=t;
					int temp=playing[0];
					playing[0]=playing[1];
					playing[1]=temp;
		
					System.out.println("\nStriker Change\nStriker     => "+teamplay[strike]+"\nNon-Striker => "+teamplay[nostrike]);
				}
				else if(run.equals("2"))
				{
					if(strike==playing[0])
					{
						scoreplayer1=Integer.parseInt(run)+playerdet.get(strike).getTeam1PlayerRuns();
						playerdet.get(strike).setTeam1PlayerRuns(scoreplayer1);
					}
					total1+=Integer.parseInt(run);
					System.out.println(total1+"/"+wicket+"         Overs =>"+(i+1)+"."+(j+1)+"/"+(i+1));
				}
				else if(run.equals("4") || run.equals("6"))
				{
					if(run.equals("4"))
					{
						fours=playerdet.get(strike).getTeam1PlayerFours();
						playerdet.get(strike).setTeam1PlayerFours(++fours);
					}
					if(run.equals("6"))
					{
						sixes=playerdet.get(strike).getTeam1Playersixs();
						playerdet.get(strike).setTeam1Playersixs(++sixes);
					}
					if(strike==playing[0])
					{
						scoreplayer1=Integer.parseInt(run)+playerdet.get(strike).getTeam1PlayerRuns();
						playerdet.get(strike).setTeam1PlayerRuns(scoreplayer1);
					}
					total1+=Integer.parseInt(run);
					System.out.println(total1+"/"+wicket+"         Overs =>"+(i+1)+"."+(j+1)+"/"+(i+1));
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
							playing[0]=strike;
							playing[0]=strike;
							System.out.println("Striker Change\nStriker     => "+teamplay[strike]+"\nNon-Striker => "+teamplay[nostrike]);
							System.out.println(total1+"/"+wicket+"         Overs =>"+(i+1)+"."+(j+1)+"/"+(i+1));
						}
						else
						{
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
				scoreboard.score(playerdet);
				break;
			}
			System.out.println();
		}
		scoreboard.score(playerdet, strike,nostrike, outlist);
	}
	public void secondInnings(String[] teamplay,String[] teamplay2,String team[],int one,int two)
	{
		add(teamplay,one);
		int wicket=0;
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
		int playing[]=new  int[2];
		playing[0]=strike;
		playing[1]=nostrike;
		int scoreplayer1=0,scoreplayer2=0,fours=0,sixes=0;
		System.out.println("\nStriker     => "+teamplay[strike]+"\nNon-Striker => "+teamplay[nostrike]);
		int bowl=6;
		for(int i=0;i<5;i++)
		{
			System.out.println("\nOver => "+(i+1)+"\n\n\n");
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
					if(strike==playing[0])
					{
						scoreplayer1=Integer.parseInt(run)+playerdet2.get(strike).getTeam1PlayerRuns();
						playerdet2.get(strike).setTeam1PlayerRuns(scoreplayer1);
					}
					total2+=Integer.parseInt(run);
					System.out.println(total2+"/"+wicket+"         Overs =>"+(i+1)+"."+(j+1)+"/"+(i+1));
					int t=strike;
					strike=nostrike;
					nostrike=t;
					int temp=playing[0];
					playing[0]=playing[1];
					playing[1]=temp;
					System.out.println("\nStriker Change\nStriker     => "+teamplay[strike]+"\nNon-Striker => "+teamplay[nostrike]);
				}
				else if(run.equals("2"))
				{
					if(strike==playing[0])
					{
						scoreplayer1=Integer.parseInt(run)+playerdet2.get(strike).getTeam1PlayerRuns();
						playerdet2.get(strike).setTeam1PlayerRuns(scoreplayer1);
					}
					total2+=Integer.parseInt(run);
					System.out.println(total2+"/"+wicket+"         Overs =>"+(i+1)+"."+(j+1)+"/"+(i+1));
				}
				else if(run.equals("4") || run.equals("6"))
				{
					if(run.equals("4"))
					{
						fours=playerdet2.get(strike).getTeam1PlayerFours();
						playerdet2.get(strike).setTeam1PlayerFours(++fours);
					}
					if(run.equals("6"))
					{
						sixes=playerdet2.get(strike).getTeam1Playersixs();
						playerdet2.get(strike).setTeam1Playersixs(++sixes);
					}
					if(strike==playing[0])
					{
						scoreplayer1=Integer.parseInt(run)+playerdet2.get(strike).getTeam1PlayerRuns();
						playerdet2.get(strike).setTeam1PlayerRuns(scoreplayer1);
					}
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
							playing[0]=strike;
							System.out.println("Striker Change\nStriker     => "+teamplay[strike]+"\nNon-Striker => "+teamplay[nostrike]);
							System.out.println(total2+"/"+wicket+"         Overs =>"+(i+1)+"."+(j+1)+"/"+(i+1));
						}
						else
						{
							System.out.println(total2+"/"+wicket+"         Overs =>"+(i+1)+"."+(j+1)+"/"+(i+1));
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
				//scoreboard.score(playerdet2);
				break;
			}
			System.out.println();
			//scoreboard.score(playerdet2,strike,nostrike,outlist);
		}
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
		scoreboard.score(playerdet,playerdet2,team,one1,two2,total1,total2);
	}
}
