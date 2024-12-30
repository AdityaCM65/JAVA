import java.util.Scanner;

 // By Aditya C Mahajan

 class Simple_Interest_Calc      ///// THIS IS MAIN CLASSS
 {
   
   //// ***** CALCULATE SIMPLE INTEREST ******
   
   public static void main(String args[])
   { 
     
     Scanner scr = new Scanner(System.in);
   
   
     
   System.out.print(" Enter The Principal : ");  /// print statement
   int principal = scr.nextInt();  /// access Principal from user input
 
   System.out.print(" Enter The Rate : ");  /// print statement
   float rate = scr.nextFloat();  /// access Rate from user input
 
   System.out.print(" Enter The Time : ");  /// print statement
   int time = scr.nextInt();  /// /// access Time from user input
 
   float si = (principal * rate * time )/100;  /// formula for calculate simple interest
 
    System.out.print(" The Simple Interest Is :  "+si);  /// print statement and Display Final result
 
 
   }
   
 }
