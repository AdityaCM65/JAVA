import java.io.*;

 // By Aditya C Mahajan

 class Assign_22
 {
   public static void main(String args[])   throws Exception 
   { 
    
   //   ********   InputStreaReader and BufferredReader *******
   
   // InputStreamReader r = new  InputStreamReader(System.in);
   // BufferedReader br = new BufferedReader(r);        
   // System.out.println("Enter Your Name");
   // String n = br.readLine();
   // System.out.println("Welcome "+n);
   
  // write java  code to display 45 89 122 452 5632 54221
  
  //DataInsputStream d = new DataInputStream(System.in);
  
  try{
    
    
    
  for(int i = 1; i <= 6; i++){
    
    if(i == 1){
      
      System.out.print("45 \t");
    }
    if(i == 2){
      
      System.out.print("89 \t");
    }
if(i == 3){
      
      System.out.print("122 \t");
    }
    
    if(i == 4){
      
      System.out.print("452 \t");
    }

if(i == 5){
      
      System.out.print("5632 \t");
    }
    if(i == 6){
      
      System.out.println("54221 \t");
    }
  }
  }
  
  catch(Exception e) {
    
   
  }
    
   System.out.println("SUCCESSFULLY RUN");
  
  
  
    
  
   
   
   }
 }
