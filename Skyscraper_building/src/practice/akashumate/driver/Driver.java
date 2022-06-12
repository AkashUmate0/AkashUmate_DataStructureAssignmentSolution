package practice.akashumate.driver;

import java.util.Scanner;

import practice.akashumate.service.printService;

public class Driver {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the total no of floors in the building");
		
		int noFloars = sc.nextInt();
		
		int[] floors =  new int[noFloars];
		
		for(int i=0; i<noFloars; i++) {
			System.out.println("enter the floor size given on day : "+(i+1));
			floors[i] = sc.nextInt();
		}
		System.out.println();
		
		printService ps = new printService();
		ps.setConstuctionOrder(floors, noFloars);
		
	}
}
