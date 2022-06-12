package practice.akashumate.driver;

import practice.akashumate.services.Main;
import practice.akashumate.services.Node;

public class Driver {

	public static void main(String[] args) {
		
		Main tree = new Main();
		
		// Test Case 1
		tree.node = new Node(50); 
		tree.node.left = new Node(30); 
		tree.node.right = new Node(60); 
		tree.node.left.left = new Node(10); 
		tree.node.right.left= new Node(55);
		
		/* Test Case 2
		tree.node = new Node(60); 
		tree.node.left = new Node(45); 
		tree.node.left.left = new Node(40); 
		tree.node.left.left.left = new Node(35);
		
		tree.node.left.right = new Node(50); 
		tree.node.left.right.left = new Node(48);  
		tree.node.left.right.right = new Node(55);  
	
		tree.node.right = new Node(80); 
		tree.node.right.left= new Node(70);
		tree.node.right.right= new Node(90);
		*/
		
		System.out.print("After convert Binary Search Tree into a Skewed Tree:");
		
		tree.arrengedBstToSkewed(tree.node);
		tree.traverseRightSkewed(tree.node);
		

	}

}
