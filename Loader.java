import java.io.*;


public class Loader extends Menu {
	
	
    int Read_size(){		
		
    	  try{
  		       
    		  br = new BufferedReader(new FileReader(file));
  	          int i=0; 
  			
  	        while (i==0) {
  				
  	        	line = br.readLine(); 
  	            String [] Ar = line.split(csvsplitby);	
  			
  	            numloops= Integer.parseInt(Ar[0]);
  			
  	            i=i+1;
  	        }
  		
  			}catch(FileNotFoundException e){
                e.printStackTrace();
  			}catch(IOException e){
                e.printStackTrace();
  			}finally{
               if (br != null) {
              try {
                     br.close();
                   }catch (IOException e) {
                      e.printStackTrace();
                   }
                }
            }
  		
       return numloops;
       
    }
      
      
    void Loading_File(String[][] y){
  		 
  		 try {
  				
  			 br = new BufferedReader(new FileReader(file));
  	            
  	             int z=0;
  	          
                   while (z<=numloops) {
  					
                       line = br.readLine(); 
  					
  					
                    String[] InArray = line.split(csvsplitby);
  					
                     for(int x=0;x<InArray.length;x++){
  	
                             y[z][x] = InArray[x];
  					
                     }
  				
                     z++;
  	             
                  }
  				
                  System.out.println();
  				
                  for (int j=0;j<=numloops;j++){
  					
                    for(int p=0;p<=51;p++){
  					
                      System.out.print(y[j][p]+" ");
  					
                    }
                  System.out.println();
  				
                 }
  	           
   
              }catch(FileNotFoundException e){
                  e.printStackTrace();
  			}catch(IOException e){
  			    e.printStackTrace();
  			}finally{		
                if (br != null) {
                  try {
  			         br.close();
                      }catch (IOException e) {     
                       e.printStackTrace();
                      }
                }  
             }
  	 }

    
}
