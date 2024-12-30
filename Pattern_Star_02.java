import java.util.Scanner;

 // Compiler version JDK 11.0.2

 class Pattern_Star_02
 {
   public static void main(String args[])
   { 
     Scanner scr = new Scanner(System.in);
     
    System.out.println("Enter a Number : ");
    int num = scr.nextInt();
    
    /*
      
      *
      * *       
      * * *
      * * * *
     
     n = 4   
      */
   
   
   for(int i = 1; i <= num; i++){
     
     for(int j = 1; j <= i; j++){
       
       System.out.print("* ");
       
     }
     System.out.println();
   }
   
   
   }
 }
