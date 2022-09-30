package team;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TeamPlayer
{
	public static String team1,team2;
	Map<String, String[]> hs = new HashMap<String, String[]>();
	static String team[] = new String[] { "India", "WestIndies", "Australia", "England", "NewZealand", "Pakistan",
			"SouthAfrica", "Afghanistan", "SriLanka", "Bangladesh" };
	static String India[] = {"Virat Kohli(C)", "Rohit Sharma(VC)", "KL Rahul",
			"Rishabh Pant(WK)", "Ishan Kishan(WK)", "SuryaKumar Yadav", "Hardik Pandya", "Ravindra Jadeja",
			"Rahul Chahar", "Ravichandran Ashwin", "Varun Chakravarthy"};
	static String WestIndies[] = {"Kieron Pollard(C)", "Nicholas Pooran(VC)",
			"Chris Gayle", "Andre Russell", "Akeal Hosein", "Dwayne Bravo", "Roston Chase", "Andre Fletcher",
			"Shimron Hetmyer", "Evin Lewis", "Jason Holder"};
	static String Australia[] = {
			"Aaron Finch(C)","Pat Cummins(VC)","Josh Hazlewood"," Josh Inglis","Glenn Maxwell","Kane Richardson",
			"Mitchell Marsh", "Steve Smith", "Mitchell Starc", "Marcus Stoinis", "Mitchell Swepson"};
	static String England[] = {"Eoin Morgan(C)", "Jos Buttler(VC)", "Moeen Ali", "Jonny Bairstow", "Sam Billings",
					"Tom Curran", "Chris Jordan", "Liam Livingstone", "Dawid Malan", "Tymal Mills", "Adil Rashid"};
	static String NewZealand[] = {"Kane Williamson(C)", "Tim Seifert(WK)",
			"Martin Guptill", "Todd Astle", "Trent Boult", "Mark Chapman", "Devon Conway", "Adam Milne",
			"Kyle Jamieson", "Daryl Mitchell", "Jimmy Neesham"};
	static String Pakistan[] = {"Babar Azam(C)", "Shadab Khan(VC", "Imad Wasim", "Mohammad Hafeez", "Asif Ali",
					"Sarfaraz Ahmed", "Haris Rauf", "Hasan Ali", "Shoaib Malik", "Haider Ali", "Mohammad Nawaz"};
	static String SouthAfrica[] = {"Temba(C)", "Quinton de Kock(WK)",
			"Aiden Markram", "David Miller", "Keshav Maharaj", "Bjorn Fortuin", "Reeza Hendricks",
			"Heinrich Klaasen", "Wiaan Mulder", "Lungi Ngidi", "Anrich Nortje"};
	static String Afghanistan[] = {"Mohammad Nabi(C)", "Rashid Khan",
			"Mujeeb Ur Rahman", "Usman Ghani", "Mohammad Shahzad", "Rahmanullah Gurbaz", "Hashmatullah Shahidi",
			"Asghar Afghan", "Gulbadin Naib", "Najibullah Zadran", "Karim Janat"};
	static String SriLanka[] = {"Dasun Shanaka(C)", "Kusal Perera", "Dinesh Chandimal", "Dhananjaya de Silva",
					"Charith Asalanka", "Avishka Fernando", "Chamika Karunaratne", "Wanindu Hasaranga",
					"Dushmantha Chameera", "Lahiru Kumara", "Mahessh Theekshana"};
	static String Bangladesh[] = {"Mahmudullah(C)", "Soumya Sarkar",
			"Shakib Al Hasan", "Mohammad Naim Sheikh", "Musafizur Rahman", "Liton Das", "Mushfiqur Rahim",
			"Afif Hossain", "Nurul Hasan Sohan", "Shak Mahedi Hasan", "Nasum Ahmed"};
	public static String[] team1player=new String[11];
	public static String[] team2player=new String[11];
	public String[] batteam1;
	public static String[] batteam2;
	public String[] bowlteam1,bowlteam2;
	public TeamPlayer(String[] team1player,String[] team2player)
	{
		this.team1player=team1player;
		this.team2player=team2player;
	}
	public TeamPlayer() {
		// TODO Auto-generated constructor stub
	}
	public TeamPlayer teamDetails(int team1,int team2)
	{
		hs.put(team[0], India);
		hs.put(team[1], WestIndies);
		hs.put(team[2], Australia);
		hs.put(team[3], England);
		hs.put(team[4], NewZealand);
		hs.put(team[5], Pakistan);
		hs.put(team[6], SouthAfrica);
		hs.put(team[7], Afghanistan);
		hs.put(team[8], SriLanka);
		hs.put(team[9], Bangladesh);
		if(team1==1 || team2==1)	
		{
			if(team1==1)
			{
				team1player=India;
			}
			else
			{
				team2player=India;
			}
		}
		if(team1==2 || team2==2)
		{
			if(team1==2)
			{
				team1player=WestIndies;
			}
			else
			{
				team2player=WestIndies;
			}
		}
		if(team1==3 || team2==3)
		{
			if(team1==3)
			{
				team1player=Australia;
			}
			else
			{
				team2player=Australia;
			}
		}
		if(team1==4 || team2==4)
		{
			if(team1==4)
			{
				team1player=England;
			}
			else
			{
				team2player=England;
			}
		}
		if(team1==5 || team2==5)
		{
			if(team1==5)
			{
				team1player=NewZealand;
			}
			else
			{
				team2player=NewZealand;
			}
		}
		if(team1==6 || team2==6)
		{
			if(team1==6)
			{
				team1player=Pakistan;
			}
			else
			{
				team2player=Pakistan;
			}
		}
		if(team1==7 || team2==7)
		{
			if(team1==7)
			{
				team1player=SouthAfrica;
			}
			else
			{
				team2player=SouthAfrica;
			}
		}
		if(team1==8 || team2==8)
		{
			if(team1==8)
			{
				team1player=Afghanistan;
			}
			else
			{
				team2player=Afghanistan;
			}
		}
		if(team1==9 || team2==9)
		{
			if(team1==9)
			{
				team1player=SriLanka;
			}
			else
			{
				team2player=SriLanka;
			}
		}
		if(team1==10 || team2==10)
		{
			if(team1==10)
			{
				team1player=Bangladesh;
			}
			else
			{
				team2player=Bangladesh;
			}
		}
		display(team,team1player,team2player,team1,team2);
		return new TeamPlayer(team1player,team2player);
		//getteam(team1player,team2player);
	}
	private void display(String[] team,String[] team1player, String[] team2player,int team1,int team2) 
	{
		System.out.println("---------------------------------------------");
		System.out.printf("%-20s | %-14s\n",team[team1-1],team[team2-1]);
		System.out.println("---------------------------------------------");
		for(int i=0;i<11;i++)
		{
			System.out.printf("%-20s | %-14s\n",team1player[i],team2player[i]);
		}
		System.out.println("---------------------------------------------");
//		for(int i=0;i<6;i++)
//		{
//			batteam1[i]=team1player[i];
//			batteam2[i]=team2player[i];
//		}
//		for(int i=6;i<11;i++)
//		{
//			bowlteam1[i]=team1player[i];
//			bowlteam2[i]=team2player[i];
//		}
	}
}
