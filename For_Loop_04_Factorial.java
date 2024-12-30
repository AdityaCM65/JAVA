import java.util.Scanner;

 // By Aditya C Mahajan

 class For_Loop_04_Factorial
 {
   public static void main(String args[])
   { 
     
     ////  find factorial of given number 
     
     Scanner scr = new Scanner(System.in);
     
    System.out.println("Enter Number to find Factorial");
    int num = scr.nextInt();
    int fact = 1;
    
    
    for(int i = num; i >= 1; i--){
      
      fact = fact * i;
      
    }
    
    System.out.println(" Factorial is : "+fact);
   
   
   }
 }
