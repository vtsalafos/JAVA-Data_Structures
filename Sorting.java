
public class Sorting extends Menu{
	
     void Quicksort(String[][] t1, int leftbound, int rightbound){
   	 
    	
   	 int i = leftbound; 
   	 int j = rightbound ;
   	 String temp = null;
   	 int pivot = Integer.parseInt(t1[i+(j-i)/2][0]);
   	 
   	 
   	     while(i <= j){
   	    	 
   	    	 int s1 = Integer.parseInt(t1[i][0]);
   	    	
   	    	 while(s1 < pivot){
   	    		 i++;
   	    		 s1 = Integer.parseInt(t1[i][0]);
   	    	 }
   	    	 
   	    	 int s2 = Integer.parseInt(t1[j][0]);
   	    	 
   	    	 while(s2 > pivot){    	    		 
   	    		 j--;
   	    		 s2 = Integer.parseInt(t1[j][0]);
   	    	 }
   	    	 
   	    	 if( i <= j ){
   	    		 
   	    	   for(int m = 0; m <= 51; m++){
   	    		 temp = t1[i][m];
   	    		 t1[i][m] = t1[j][m];
   	    		 t1[j][m] = temp;
   	    		    	    		 
   	    	   }
   	    		 
   	    		 i++;
   	    		 j--;
   	    	 } 
   	     }
     
   	     
   	     if( leftbound < j)
   	       Quicksort(t1,leftbound,j);
   	     if(i < rightbound )
              Quicksort(t1, i, rightbound);
      }

}
