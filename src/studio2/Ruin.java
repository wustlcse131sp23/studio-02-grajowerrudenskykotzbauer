package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		// System.out.println("Start Amount");	
		System.out.println("Start Amount:");
		double startAmount = in.nextDouble() ;
		
		System.out.println("Win chance :");
		double winChance = in.nextDouble() ;
		System.out.println("Win Limit :");
		double winLimit = in.nextDouble() ;
		int x= 0 ;
		System.out.println("Number of Days :");
		int numberDays = in.nextInt() ;
		String dayresult = " ";
		double amount = startAmount;
		
		
		for (int i = 1; i <= numberDays; i++)
		{
		while (amount<winLimit && amount>0) 
		{
			if (Math.random() < winChance)
			{ 
				
				amount--; 
		
			}
			else
			{		
				amount++; 
			}
			x ++ ;
		}
		if (amount<= 0)
			dayresult = "Ruin";
		else
			dayresult = "Success";
		System.out.println("Simulation " + i +": " + dayresult );
		
		double totalGames = x ;
		System.out.println("Total Games: " + totalGames);
		amount = startAmount; 
		x = 0;
		}
		
		
		//boolean startAmount = 0 ;
		//boolean winChance = 0 ;
		
		

	}

}
