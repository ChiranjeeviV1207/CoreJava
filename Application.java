dxzs lass Application
{
	public static void main(String args[])
	{
		String pname="rohit";
		char id='C';
		int pscore=0;
		int pballs=0;
		int pfours=0;
		int psixes=0;
		int jerseyno=0;
		double strikerate=(0/0.)*100.0;
		switch(pname)
 		{
		case "rohit":
		id='C';
		pscore=133;
		pballs=111;
		pfours=10;
		psixes=12;
		jerseyno=45;
		strikerate=(133/111.0)*100.0;
		System.out.println("PlayerName="+pname);
		System.out.println("Captain="+id);
		System.out.println("PlayerScore="+pscore);
		System.out.println("PlayerBallsfaced="+pballs);
		System.out.println("Fours="+pfours);
		System.out.println("Sixes="+psixes);
		System.out.println("JerseyNo="+jerseyno);
		System.out.println("PlayerSR="+strikerate);
		if(pscore<=0)
		{
		System.out.println("duck out");
		}
		else if(pscore>=50 && pscore<99)
		{
		System.out.println("half century");	
		}
		else if(pscore>=100 && pscore<149)
		{
		System.out.println("Century");	
		}
		else if(pscore>=150 && pscore<200)
		{
		System.out.println("his highest score");
		}
		break;	
		case "king":
		id='C';
		pscore=183;
		pballs=136;
		pfours=14;
		psixes=9;
		jerseyno=18;
		strikerate=(183/136.0)*100.0;
		System.out.println("PlayerName="+pname);
		System.out.println("Captain="+id);
		System.out.println("PlayerScore="+pscore);
		System.out.println("PlayerBallsfaced="+pballs);
		System.out.println("Fours="+pfours);
		System.out.println("Sixes="+psixes);
		System.out.println("JerseyNo="+jerseyno);
		System.out.println("PlayerSR="+strikerate);
		if(pscore<=0)
		{
		System.out.println("duck out");
		}
		else if(pscore>=50 && pscore<99)
		{
		System.out.println("half century");	
		}
		else if(pscore>=100 && pscore<149)
		{
		System.out.println("Century");	
		}
		else if(pscore>=150 && pscore<200)
		{
		System.out.println("his highest score");
		}
		break;
		case "rahul":
		id='C';
		pscore=0;
		pballs=1;
		pfours=0;
		psixes=0;
		jerseyno=1;
		strikerate=(0/1.0)*100.0;
		System.out.println("PlayerName="+pname);
		System.out.println("Captain="+id);
		System.out.println("PlayerScore="+pscore);
		System.out.println("PlayerBallsfaced="+pballs);
		System.out.println("Fours="+pfours);
		System.out.println("Sixes="+psixes);
		System.out.println("JerseyNo="+jerseyno);
		System.out.println("PlayerSR="+strikerate);
		if(pscore<=0)
		{
		System.out.println("duck out");
		}
		else if(pscore>=50 && pscore<99)
		{
		System.out.println("half century");	
		}
		else if(pscore>=100 && pscore<149)
		{
		System.out.println("Century");	
		}
		else if(pscore>=150 && pscore<200)
		{
		System.out.println("his highest score");
		}
		break;
		case "sky":
		id='C';
		pscore=18;
		pballs=3;
		pfours=0;
		psixes=3;
		jerseyno=36;
		strikerate=(18/3.0)*100.0;
		System.out.println("PlayerName="+pname);
		System.out.println("Captain="+id);
		System.out.println("PlayerScore="+pscore);
		System.out.println("PlayerBallsfaced="+pballs);
		System.out.println("Fours="+pfours);
		System.out.println("Sixes="+psixes);
		System.out.println("JerseyNo="+jerseyno);
		System.out.println("PlayerSR="+strikerate);
		if(pscore<=0)
		{
		System.out.println("duck out");
		}
		else if(pscore>=50 && pscore<99)
		{
		System.out.println("half century");	
		}
		else if(pscore>=100 && pscore<149)
		{
		System.out.println("Century");	
		}
		else if(pscore>=150 && pscore<200)
		{
		System.out.println("his highest score");
		}
		break;
		default:
		System.out.println("enter rohit,king,rahul,sky player names as input and try again"); 
		}		
	}
}
		

		
		
		
		