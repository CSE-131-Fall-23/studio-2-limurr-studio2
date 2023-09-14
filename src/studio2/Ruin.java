package studio2;

import java.util.*;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("What amount of money do you wish to start with?");
		int startAmount = in.nextInt();
		System.out.println("What's your win chance?");
		double winChance = in.nextDouble();
		System.out.println("Whats your win limit?");
		int winLimit = in.nextInt();
		System.out.println("What amount of simulations do you wish to do?");
		int totalSimulations = in.nextInt();
		
		
		double lose = 0;
		int win = 0;
		
		for(int i = 1; i <= totalSimulations; i++) {
		
		int money = startAmount;
		int rounds = 0;
		
			while(money > 0 && money < winLimit) {
				rounds++;
				double fortune = Math.random();
				if(fortune <= winChance) {
					money += 1;
				}else {
					money--;
				}

		
				
			}
			
			String result = "";
			if(money >= winLimit) {
				result = "WIN";
				win++;
			}else {
				result = "LOSE";
				lose++;
			}
			
			System.out.println("SIMULATION DAY " + i + ": " + rounds + " " + result);
		}
		
		System.out.println("Losses: " + (int)lose + " Simulations: " + totalSimulations);
		double simulatedRuin = lose/totalSimulations;
		
		
		double alpha = (1 - winChance)/winChance;
		double expectedRuin = Math.pow(alpha, startAmount) - Math.pow(alpha, winLimit);
		double denominator = 1 - Math.pow(alpha, winLimit);
		expectedRuin = expectedRuin/denominator;
		System.out.println("Ruin rate from Simluation: " + simulatedRuin + " Expected Ruin Rate: " + expectedRuin);

	}

}
