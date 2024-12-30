import java.util.Scanner;

 // By Aditya C Mahajan

 class Assign_23
 {
   public static void main(String args[])
   { 
     Scanner scr = new Scanner(System.in);
     System.out.println("Enter A Term");
     int term = scr.nextInt();
     int num1 = 0;
     int num2 = 1;
     int result;
     System.out.println(num1);
     System.out.println(num2);
     
     
     for(int i = 2; i < term; i++){
       
       result = num1+num2;  // 0+1 // 1+1 // 1+2
       System.out.println(result);
       num1 = num2; // 1 // 1. // 2
       num2 = result; // 1 // 2 // 3
       
       
     }
     
    
   }
 }
