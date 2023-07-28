

public class Search_by_Name extends Menu{
	
	
	    

		void Linear_search_byname(String[][] x, String w){
   	 
	    	boolean found2 = false;
	    	
				
				for(int g=1;g<=numloops;g++){
				   
		           for(int f=4;f<=49;f++){
					  	
	                    if((x[g][f]).equals(name_search)){
	                       System.out.println(x[g][1]+" "+x[g][f+1]+" "+x[g][f+2]);
	                       found2 = true;
				        }
	               }
	            }
				
				if(found2==false){
					System.out.println("\nThere isn't reservention by this name at any hotel ... \n");
				}
	    
	    }

}
