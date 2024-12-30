import java.util.Scanner;

 // By Aditya C Mahajan

 class Pattern_Star_03
 {
   public static void main(String args[])
   { 
     Scanner scr = new Scanner(System.in);
     
    System.out.println("Enter a Number : ");
    int num = scr.nextInt();
    
    
    for(int i = 1; i <= num; i++){
      
      
      for(int j = 1; j <= num-i+1; j++){
      
      System.out.print("* ");
      
    }
     
     System.out.println();
     }
     
    }
 }
