import java.io.*;
import java.util.*;

public class Menu {


static int numloops = 0;
static int numloops2 = 0;
static String line = "";
static String csvsplitby = ";"; 
static String file;
static BufferedReader br =null;
static String id_search = null;
static String name_search = null;
static int b_search_id = 0;
static int i_search_id = 0;
public  static int avl_search_id = 0;

static Making_AVL_tree tree1 = new Making_AVL_tree();
static Making_Digital_Trie tr2 = new Making_Digital_Trie();
private static Scanner scan;
private static Scanner scan7;
private static Scanner scan78;
private static Scanner scan2;
private static Scanner scan6;
private static Scanner scan62;
private static Scanner scan1;

public static void main(String[] args) {
		
		
/*if(args.length == 0){
			
throw new IllegalArgumentException("Wrong Output");
		}
file = args[0];*/
		
		
file = "C:/Users/Vasilis/Desktop/data.csv";
		
		

Menu app1 = new Menu();
Loader app2 = new Loader();
Addition app3 = new Addition();
Save app4 = new Save();
Sorting app5 = new Sorting();
Search_by_Name app6 = new Search_by_Name();
Search_by_ID app7 = new Search_by_ID();


int f=1;
		
        

     while(f>0){
		 
        app2.Read_size();
	    numloops2=numloops;
			
	    String[][] LArray  = new String[(numloops+1)][52];
	    String[][] LArray2  = new String[(numloops2+2)][52];  

        int l=1;
		
	 while (l > 0){
		
        app1.Create_Menu();
		
		scan = new Scanner(System.in);
		int answer = scan.nextInt();
		
		
		if (answer == 1){
	        app2.Loading_File(LArray);
	        Load_AVL_Tree(LArray, numloops, tree1);
	        Load_Trie(LArray, numloops, tr2);
		}else if(answer == 2){
			
		    app4.Save_file(LArray2);
			System.out.println("\nLoad the new FILE !!!");
		    l=0;
			
		}else if(answer == 3){
			
			app3.Add_registration(LArray,LArray2);
			
		}else if(answer == 4){
			
			String item = null;
			
			System.out.println("\nChoose with which method you want to search the Array !!!\n\n"+
			
					"For Linear_search press : a\n\n"+
			
					"For Binary_search press : b\n\n"+
			
					"For Interpolation_search press : c\n\n"+
					
					"For AVL_SEARCH press : d\n\n");
			
			scan7 = new Scanner(System.in);
			item = scan7.next();
			
			
            if(item.equals("a")){
            	
            	System.out.println("\nGive the ID of hotel that you want to search :\n");
        		
       		    scan1 = new Scanner(System.in);
       		    id_search = scan1.next();
            	
            	double startTime = System.nanoTime();
            	app7.Linear_search_byID(LArray,id_search);
            	
            	double endTime = System.nanoTime();
    	        double duration = ((endTime - startTime)/1000000000.0);
    	        System.out.printf("\nLinear Search: %f seconds \n",duration);
    	        
            }else if(item.equals("b")){
			
               int index = Integer.parseInt(LArray[0][0]);
               
               System.out.println("\nGive the ID of hotel that you want to search :\n");
     			
     		   scan6 = new Scanner(System.in);
     		   b_search_id = scan6.nextInt();
               
               double startTime1 = System.nanoTime();
               
               app5.Quicksort(LArray,1,index);
           	   
               double endTime1 = System.nanoTime();
   	           double duration1 = ((endTime1 - startTime1)/1000000000.0);
   	           
   	           
               double startTime2 = System.nanoTime();
               
               app7.Binary_search_byID(LArray,numloops,b_search_id);
           	   
               double endTime2 = System.nanoTime();
   	           double duration2 =  ((endTime2 - startTime2)/1000000000.0);
   	           System.out.printf("\nQuickSort:  %f seconds \n", duration1);
   	           System.out.printf("Binary Search: %f seconds \n",duration2);

           }else if(item.equals("c")){
			
        	   System.out.println("\nGive the ID of hotel that you want to search :\n");
     			
     		   scan62 = new Scanner(System.in);
     		   i_search_id = scan62.nextInt();
     		    
        	   int index = Integer.parseInt(LArray[0][0]);
        	   
        	   double startTime1 = System.nanoTime();
        	   app5.Quicksort(LArray,1,index);
           	   
        	   double endTime1 = System.nanoTime();
   	           double duration1 = ((endTime1 - startTime1)/1000000000.0);
   	       
        	   
   	           double startTime2 = System.nanoTime();
   	           app7.Interpolation_search(LArray,numloops,i_search_id);
           	   
			   double endTime2 = System.nanoTime();
   	           double duration2 = ((endTime2 - startTime2)/1000000000.0);
   	           System.out.printf("\nQuickSort:  %f seconds \n", duration1);
   	           System.out.printf("Interpolation Search %f seconds \n",duration2);
   	           
           }else if(item.equals("d")){
           
           	   System.out.println("\nGive the ID of hotel that you want to search :\n");
       		
       		   scan6 = new Scanner(System.in);
       	       avl_search_id = scan6.nextInt();
        	   
        	   double startTime = System.nanoTime();
        	   tree1.Avl_Search(tree1.root, avl_search_id,LArray);
        	   
        	   double endTime = System.nanoTime();
   	           double duration = ((endTime - startTime)/1000000000.0);
   	           System.out.printf("\nAVL Search: %f seconds \n",duration);
           }else{
				
               System.out.println("\nThere is not searching method combined with this key !!! Please choose between a, b, c ...");
	       
           }
			
		}else if(answer == 5){
			
              String item = null;
			
			System.out.println("\nChoose with which method you want to search the Array !!!\n\n"+
			
                               "For Linear_search press : a\n\n"+
                               
                               "For Digital_Trie_search press : b\n\n");
			
			scan78 = new Scanner(System.in);
			item = scan78.next();
			
			switch (item){
			
			case "a" : 	       
				System.out.println("\nGive the Name of the reservation that you want to search :\n");
		       
	                   scan2 = new Scanner(System.in);
	                   name_search = scan2.next();
				       
				       double startTime1 = System.nanoTime();       
			           app6.Linear_search_byname(LArray, name_search);
		               
				       double endTime1 = System.nanoTime();
		    	       double duration1 = ((endTime1 - startTime1)/1000000000.0);
		    	       System.out.printf("\nLinear Search: %f seconds \n",duration1);
		    	       
			           break;
			           
			case "b" :     	
			    System.out.println("\nGive the Name of the reservation that you want to search :\n");
			       
					   scan2 = new Scanner(System.in);
					   name_search = scan2.next();
				
				       double startTime2 = System.nanoTime();
			           tr2.Trie_search(name_search);
		               
			           double endTime2 = System.nanoTime();
		    	       double duration2 = ((endTime2 - startTime2)/1000000000.0);
		    	       System.out.printf("\nTrie Search: %f seconds \n",duration2);
		    	       
				       break;
				       
			default : System.out.println("\nThere is not searching method combined with this key !!! Please choose between a, b ...");
			           break;
			}
		}else if(answer == 6){
			
			System.out.println("Good Bye !!!");
			l=0;
		    f=0;
		}
		
		
    }
		
        
    }
	
}
	
	
      void Create_Menu(){
		
		   System.out.println("\n------Hotel Manager------\n\n\n"
				
				  + "1. Load Hotels and Reservations from file\n"
				  + "2. Save Hotels and Reservations to file\n"
				  + "3. Add a Hotel (with Reservations)\n"
				  + "4. Search and Display a Hotel by id\n"
				  + "5. Display Reservations by surname search\n"
				  + "6. Exit\n");
		
	   	   System.out.println("\nGive the number of option that the algorith want to execute :\n");
	  }
	
    
    
      static void Load_Trie(String t1[][], int x,Making_Digital_Trie y){
    
    	   for(int e = 1; e <= x; e++){
    		   for(int j = 4; j < 51; j=j+3){
    			
    			  y.insert(t1[e][j], t1[e][1] , t1[e][j+1], t1[e][j+2]);
    		   }
    		
    	   }
    	
      }
    
    
      static void Load_AVL_Tree(String[][] t1, int x, Making_AVL_tree y){
    	

    	 for(int e = 1; e <= x; e++){
    		
    		 int g1 = Integer.parseInt(t1[e][0]);
    		 y.root = y.insert(y.root, g1, e);
    		
    	 }
    	
    	 System.out.println("\nPreorder traversal of constructed tree is : ");
         y.preOrder(y.root);

    	
      }
    
     
     
}

