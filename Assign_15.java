import java.util.Scanner;

 // By Aditya C Mahajan

 class Assign_15
 {
   public static void main(String args[])
   { 
     
     Scanner scr = new Scanner(System.in);
     
    System.out.println("Enter the First Number");
    int num1 = scr.nextInt();
    
    
    System.out.println("Enter the Second Number");
    int num2 = scr.nextInt();
    
    
    System.out.println("Enter the Third Number");
    int num3 = scr.nextInt();
    
    int result = (num1 * num2) + num3;
    
    System.out.println("Result is : "+result);
    
   }
 }
