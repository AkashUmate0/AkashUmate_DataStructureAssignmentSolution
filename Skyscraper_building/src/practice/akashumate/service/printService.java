package practice.akashumate.service;

import java.util.PriorityQueue;

public class printService {
	public void setConstuctionOrder(int[] floars, int noFloars) {
		System.out.println("The order of construction is as follows");
		PriorityQueue<Integer> queue = new PriorityQueue<>(java.util.Collections.reverseOrder());
		
		int[] storeUnsortedElement = new int[noFloars];
		int max = noFloars;
		System.out.println();
		
		for(int i=0; i<noFloars; i++) {
			System.out.println("Day: "+(i+1));
			storeUnsortedElement[i] = floars[i];
			queue.add(storeUnsortedElement[i]);
			while (!queue.isEmpty() && queue.peek() == max) {

				System.out.print(queue.poll() + " ");

				max--;

			}
			System.out.println();
		}
		
	}

}
