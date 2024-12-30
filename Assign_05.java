import java.util.Scanner;

 // By Aditya C Mahajan

 class Assign_05
 {
   public static void main(String args[])
   { 
     
     Scanner scr = new Scanner(System.in);
     
    System.out.print("Enter A Number : ");
   int num = scr.nextInt();
   
   
   int fact = 1;
   
   for(int i = 1; i <= num; i++){
     
     fact = fact * i;
     
     
   }
  System.out.println("The Factorial of "+num+" number is : "+fact);
   
   }
 }
