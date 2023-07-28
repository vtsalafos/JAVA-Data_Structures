import java.util.*;

class TrieNode {
	
	    TrieNode[] arr;
	    boolean endofword;
	    ArrayList<String> hotel_name = new ArrayList<String>();
	    ArrayList<String> date_reserv = new ArrayList<String>();
	    ArrayList<String> num_days = new ArrayList<String>();
	    
	    
	    // Initialize your data structure here.
	    public TrieNode() {
	        this.arr = new TrieNode[26];
	  
	    }
	
}


public class Making_Digital_Trie {
	
	TrieNode root = new TrieNode();
	

    // Inserts a word into the trie.
    public void insert(String word, String H_Name, String D_Reserv, String Num_Days) {
        TrieNode p = root;
        
        for(int i=0; i<word.length(); i++){
            char c = Character.toLowerCase(word.charAt(i));
            int index = c-'a';
            //System.out.println(index);
            //System.out.println(p.arr[index]);
            if(p.arr[index]==null){
                TrieNode temp = new TrieNode();
                p.arr[index]=temp;
                p = temp;
            }else{
                p=p.arr[index];
            }
        }
        p.endofword = true;
        p.hotel_name.add(H_Name);
        p.date_reserv.add(D_Reserv);
        p.num_days.add(Num_Days);
    }
    
    // Returns if the word is in the trie.
    public void Trie_search(String word) {
        
    	String message = "\nThere isn't reservention by this name at any hotel ... \n";
    	TrieNode p = searchNode(word);
        if(p==null){
            System.out.println (message);
        }else{
            if(p.endofword)
            	for(int i = 0; i < p.hotel_name.size(); i++){
            	System.out.println(p.hotel_name.get(i)+" "+p.date_reserv.get(i)+" "+p.num_days.get(i));
            	}
        }
    }



    public TrieNode searchNode(String s){
        TrieNode p = root;
        for(int i=0; i<s.length(); i++){
        	char c = Character.toLowerCase(s.charAt(i));
            int index = c-'a';
            if(p.arr[index]!=null){
                p = p.arr[index];
            }else{
                return null;
            }
        }

        if(p == root)
            return null;

        return p;
    }

    

}
