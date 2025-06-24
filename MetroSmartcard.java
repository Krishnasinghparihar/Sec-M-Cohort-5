package Day4_Method;

import java.util.Scanner;

public class MetroSmartcard {
	public static void main(String args[]) {
	Scanner input = new	Scanner (System.in);
	System.out.println("enter card balance");
	int CardBalance= input.nextInt();
	
	
	while(CardBalance>0) {
		System.out.println("enter distance");
	int distance =input.nextInt();

	
	input.close();
    int fare = (distance <= 50) ? 100 : 200;
	System.out.println(+fare);
	CardBalance=CardBalance-fare;
	
	
	}
	}

}
