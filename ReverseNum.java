import java.util.Scanner;

 // By Aditya C Mahajan

 class Assign_04
 {
   /// **** REVERSE ENTER NUMBER ****
   
   public static void main(String args[])
   { 
     Scanner scr = new Scanner(System.in); // Scanner Class 
     int num,s,c,r;   //// Declare Variables num , s, c , r;
    System.out.println("Enter Number"); //print Statement
    num = scr.nextInt(); /// get user input with nextInt() method
    
    s = num;   /// store user input value in s variable
   c = 0;   ///c = 0;
    
    while(num > 0){
      
      r = num % 10;
      c = (c*10)+r;
      num = num/10;
      
      
    }
  System.out.println(c);  /// print Reverse Number 
   }
 }
