

public class Search_by_ID extends Menu{
	
	
	
	
	void Linear_search_byID(String[][] x, String t){
		 
    	boolean fl = true;
		 
		 for(int g=1;g<=numloops;g++){
			
		 	if((x[g][0]).equals(t)){
				
				System.out.println("\nThe result of the linear search by ID is :\n");
				
				for(int f=0;f<=51;f++){

					System.out.print(x[g][f]+" ");
				}
			
			 fl = false;
			
			 if(fl==true)
				 System.out.println("Not matching search !!!\n");
			 
			 System.out.println();
			
           }
			
		}
		 
		 if(fl==true)
			 System.out.println("Not matching search !!!\n");
    
   }
	
	
    void Binary_search_byID(String[][] t1, int w, int e){
   	 
		    boolean fl = false;
		    int right = w ;
		    int left = 1;
		    int s8 = 0;
		    
   	    while(left <= right){
   		
   	    	int b_search_m = (left+right)/2;
   	    	 s8 = Integer.parseInt(t1[b_search_m][0]);
   	    	
   	    	 
   	    	if(e < s8){
   			
				  right = b_search_m -1;
				  
   			}else if(e > s8){
   		    	
   		      left = b_search_m + 1;
                   
   		    }else if(e == s8){
   		    	
   		    System.out.println("\nThe result of the binary search by ID is :\n");
   		    	
   		       for(int p=0; p<=51; p++){
       				
                      System.out.print(t1[b_search_m][p] + " ");
       		   }
   		    	
   		           System.out.println();
   		    	
   		           
   		           fl=true;
   		    	   break;
   		    
   		       }
   		 }
   		
   	    if(fl==false)
   			 System.out.println("Not matching search !!!\n");
           
   }
   
   
    void Interpolation_search(String[][] t1, int w, int g){
  	 

		    
		    boolean fl = false;
		    int right = w;
		    int left = 1;
		    int s6 = 0, s7 = 0,s8 = 0,pos = 0,distance = 0, value_range = 0, index_range = 0;
		    double franction = 0, estimation = 0;
		    
		    s6 = Integer.parseInt(t1[left][0]);
		    s7 = Integer.parseInt(t1[right][0]);
		    
		   
		      while(left <= right && g >= s6 && g <= s7 ){
		    	
		    	s6 = Integer.parseInt(t1[left][0]);
			    s7 = Integer.parseInt(t1[right][0]);
		    	 
			    
			      if(s6 == s7){
			    	System.out.println("\nThe result of the interpolation search by ID is :\n");
  		    	
			        for(int p=0; p<=51; p++){
      				
                      System.out.print(t1[w][p] + " ");
      				
      			}
  		    	
			        fl=true;
  		    	System.out.println();
  		    	break;
			    }
		    	
			    distance = right-left;
			    value_range = s7-s6;
			    franction = (double)distance/(double)value_range;
			    index_range = g - s6;
			    estimation = left + franction * index_range;
			    pos = (int) estimation;

		    	System.out.println(pos);
			    s8 = Integer.parseInt(t1[pos][0]);
		    
		    	
		    		if( s8 == g){
		    		
		    		System.out.println("\nThe result of the interpolation search by ID is :\n");
  		    	
		    		for(int p=0; p<=51; p++){
      				System.out.print(t1[pos][p] + " ");
      				
      			    }
  		    	
		    		fl=true;
  		    	
		    		System.out.println();
  		    	break;
		    	
		    	}else if(g > s8){
		    		
		    		left = pos + 1;
		    	
		    	}else {
		    		
		    		right = pos - 1;
		    	
		    	}
		    	
		    }
  	 
		    
          if(fl==false)
		    	System.out.println("Not matching search !!!\n");
   
  }

}
