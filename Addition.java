
import java.util.*;

public class Addition extends Menu{
	
     private Scanner scan4;

	void Add_registration(String[][] t1, String[][] t2){
   	 
   	 scan4 = new Scanner(System.in);
		 
   	 System.out.println("Write the new registration with all arguments in one line and also with one ; between them !!!\n");
			
   	 String insert = scan4.nextLine();
			
			int h=0;
			
			while( h<1){
				
			String[] N_Reg = insert.split(";");	
			
			int add = Integer.parseInt(t1[0][0]);
			add = (add + 1);
			 
			t2[0][0] = Integer.toString(add);
			
			System.out.print(t2[0][0]);
			
			 for(int q=1;q<=51;q++){
				
				 t2[0][q]="";
			     System.out.print(t2[0][q]+" ");

			 }
			 
			 System.out.println();

		     numloops2 = add;
			
			for(int e=1;e<=numloops;e++){
			    for(int r=0;r<=51;r++){
			
			    t2[e][r] = t1[e][r];
			    
			    System.out.print(t2[e][r]+" ");
			    }
			    
			    System.out.println();
			}
			
		     
//System.out.println(numloops2+"\n");

			       
           for(int p=0;p<N_Reg.length; p++){
			    	 
//System.out.print(N_Reg[p]);
				      
               t2[numloops2][p] = N_Reg[p] ;
				      
               System.out.print(t2[numloops2][p]+" ");
			       
           }
		     
			       
			      
           System.out.println("\n\nSuccess Registration !!! Please FIRST save the file to UPDATE the array !!!");
			h++;
		
           }
    
   }

}
