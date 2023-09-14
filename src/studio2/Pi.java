package studio2;

import java.util.*;

public class Pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Total Simulations?");
		int simulations = in.nextInt();
		int hit = 0;
		
		for(int i = 0; i < simulations; i ++) {
			double x = Math.random() - 0.5;
			double y = Math.random() - 0.5;
			
			double dist = Math.sqrt(Math.pow(x, 2) + Math.pow(y,2));
			if(dist < 0.5) {
				hit++;
			}
			
		}
		
		double pi = 4 * hit;
		pi /= simulations;
		
		System.out.println("Our appoximate for Pi is " + pi);
		

	}

}
