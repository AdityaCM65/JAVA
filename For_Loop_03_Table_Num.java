import java.util.Scanner;

 // By Aditya C Mahajan

 class For_Loop_03_Table_Num
 {
   public static void main(String args[])
   { 
     
     ///// ** Table of user enter number
     
     Scanner scr = new Scanner(System.in);
     
    System.out.println("Enter A Number : ");
    int num = scr.nextInt();
    int result;
    
    for(int i = 1; i <= 10; i++){
      
      
      result = num * i;
      
      
      System.out.println( num+" X "+i+" = "+result);
    }
   
   
   }
 }
