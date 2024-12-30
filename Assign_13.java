import java.util.Scanner;

 // By Aditya C Mahajan

 class Assign_13
 {
   public static void main(String args[])
   { 
     
    Scanner scr = new Scanner(System.in);
   
    System.out.println("Enter a term : ");
    int num = scr.nextInt();
    
    for(int i = 1; i <= num; i++){
      
      int res = i * i;
      
      System.out.println("Square of : "+i+" is : "+res);
      
    }
   
   
   
   }
 }
