package practice.akashumate.services;

public class Main {
	 	public static Node node;
	    static Node prevNode = null;
	    static Node headNode = null;
	    
	    public static void arrengedBstToSkewed(Node root) {

	    	if(root == null){
	            return;
	    	} 	
	    	
	    	arrengedBstToSkewed(root.left);
	    	System.out.print(root.val + " ");
	    	Node rightNode = root.right;
	        Node leftNode = root.left;
	        
	        if(headNode == null){
	            headNode = root;
	            root.left = null;
	            prevNode = root;
	        }else{
	            prevNode.right = root;
	            root.left = null;
	            prevNode = root;
	        }
	        arrengedBstToSkewed(rightNode); 
	    }
	    
	    public static void traverseRightSkewed(Node root){
	        if(root == null){
	            return;
	        }
	        traverseRightSkewed(root.right);         
	    }
}
