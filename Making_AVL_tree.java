

class Node {
	
	int key, height;
	int index;
	Node left, right;
	
	Node(int d, int c) {
		key = d;
		index = c;
		height = 1;
	}
	
}


public class Making_AVL_tree {

	/* Intialize the root of the tree */
	Node root;
	
	/* Checking the height of the Node */
	int height_Node(Node x){
		
		if(x == null)
		  return 0;
			
		return x.height;
			
	}
	
	/* Find which of two integers is bigger and return this number */
	int max(int a, int b){
		
		return (a>b) ?a:b;
		
	}
	
	
	Node rightRotate(Node y){
		
		Node x = y.left;
		Node T2 = x.right;
		 
        // Perform rotation
        x.right = y;
        y.left = T2;
 
        // Update heights
        y.height = max(height_Node(y.left), height_Node(y.right)) + 1;
        x.height = max(height_Node(x.left), height_Node(x.right)) + 1;
 
        // Return new root
        return x;
		
	}
	
	Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;
 
        // Perform rotation
        y.left = x;
        x.right = T2;
 
        //  Update heights
        x.height = max(height_Node(x.left), height_Node(x.right)) + 1;
        y.height = max(height_Node(y.left), height_Node(y.right)) + 1;
 
        // Return new root
        return y;
    }
	
	 int getBalance(Node N) {
	        if (N == null)
	            return 0;
	 
	        return height_Node(N.left) - height_Node(N.right);
	 }
	 
	 Node insert(Node node, int key, int c) {
		 
	        /* 1.  Perform the normal BST insertion */
	        if (node == null)
	            return (new Node(key,c));
	 
	        if (key < node.key)
	            node.left = insert(node.left, key, c);
	        else if (key > node.key)
	            node.right = insert(node.right, key, c);
	        else // Duplicate keys not allowed
	            return node;
	 
	        /* 2. Update height of this ancestor node */
	        node.height = 1 + max(height_Node(node.left),
	                              height_Node(node.right));
	 
	        /* 3. Get the balance factor of this ancestor
	              node to check whether this node became
	              unbalanced */
	        int balance = getBalance(node);
	 
	        // If this node becomes unbalanced, then there
	        // are 4 cases Left Left Case
	        if (balance > 1 && key < node.left.key)
	            return rightRotate(node);
	 
	        // Right Right Case
	        if (balance < -1 && key > node.right.key)
	            return leftRotate(node);
	 
	        // Left Right Case
	        if (balance > 1 && key > node.left.key) {
	            node.left = leftRotate(node.left);
	            return rightRotate(node);
	        }
	 
	        // Right Left Case
	        if (balance < -1 && key < node.right.key) {
	            node.right = rightRotate(node.right);
	            return leftRotate(node);
	        }
	 
	        /* return the (unchanged) node pointer */
	        return node;
	    }
	 
	 
	    void preOrder(Node node) {
	        if (node != null) {
	            System.out.print(node.key + " ");
	            preOrder(node.left);
	            preOrder(node.right);
	        }
	    }
	
        void Avl_Search(Node node, int w,String[][] r1){
        	int a = 0;
               		
        	if(node.key == w){
        		
               a = node.index;
               System.out.println("\nThe result of the AVL search by ID is :\n");
           
          	   
      	       for(int p=0; p<=51; p++){
                     System.out.print(r1[a][p] + " ");
      	       }
      	       System.out.println();
      	   
        	}else if(node.key != w && node.left == null && node.right == null){
    	    	  
        	   System.out.println("Not matching search !!!\n");

            }else{
        		if(w < node.key){
    			    Avl_Search(node.left, w, r1);
    		        
        		}else if(w > node.key){
    			    Avl_Search(node.right, w, r1);
    		        
        		}
        	}
       
        	
        	

        	
        }


}
