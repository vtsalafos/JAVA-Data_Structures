import java.io.*;


public class Save extends Menu{
	
	
	void Save_file(String[][] t2){
		
        try {
		
             String s = null ;
		
             BufferedWriter br = new BufferedWriter(new FileWriter(file));
		
             StringBuilder sb = new StringBuilder();
		   
		   
              System.out.println(numloops2);
		    
              s=sb.append(t2[0][0]).append(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;").append("\n").toString();
		
              for (int e = 1; e <= numloops2; e++) {
			
			         for(int r = 0; r <= 51; r++){
			
                        s=sb.append(t2[e][r]).append(";").toString();
		   
                   }
			
                   s=sb.append("\n").toString();
		
              }

		        br.write(s);			
              br.close();
		        } catch (IOException e) {
			    e.printStackTrace();
		        }
		
	
}

}
