package team;

public class ScoreBoard {
	POJO pojo=new POJO();
	public void score()
	{
		POJO pojo=new POJO();
		Match mat=new Match();
		System.out.println("India");
		System.out.println("--------------------------------");
		System.out.println("Player  |   Runs  |   4s  |   6s  ");
		for(int i=0;i<11;i++)
		{
			System.out.println(mat.playerdet.get(i+1).getTeam1PlayerID());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
