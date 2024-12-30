import java.util.Scanner;

 // By Aditya C Mahajan

 class Pattern_Star_05
 {
   public static void main(String args[])
   { 
     Scanner scr = new Scanner(System.in);
     
    System.out.println("Enter a Number");
    int num = scr.nextInt();
    
    for(int i = 1; i <= num; i++){
      
      
      for(int k = 1; k <= num-i+1; k++){
        
        System.out.print("   ");
        
      }
      
      
      for(int k = 1; k <= i; k++){
        
        System.out.print("* ");
        
      }
      
      System.out.println();
      
      
      
    }
    
       
   
   }
 }
