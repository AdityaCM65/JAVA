import java.util.Scanner;

 // Aditya C Mahajan

 class Pattern_Star_06
 {
   public static void main(String args[])
   { 
     
        Scanner scr = new Scanner(System.in);
         System.out.print("Enter a Number : ");
         int num = scr.nextInt();
         
         for(int i = 1; i <= num; i++){
           
           
           for(int j = 1; j <= num-i; j++){
             
             System.out.print("  ");
             
           }
           
           
           for(int j = 1; j <= i; j++){
             
             
             System.out.print("* ");
             
             
           }
           System.out.println();
           
           
         }
         
         
         
         
   }
 }
