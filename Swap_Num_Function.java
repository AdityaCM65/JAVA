import java.util.Scanner;

 // By Aditya C Mahajan

 class Swap_Num_Functionsn   /// This Is Main Class Swap_Num_Function
 {
   ////// Swap Two Numbers with third variable
   
   public static void main(String args[])
   { 
     
     Scanner scr = new Scanner(System.in); //// User Input Class Scanner Initialize
     
     System.out.print("Enter Value Of A : ");  // Print statement 
     int a = scr.nextInt();   ///// declare Variable a to Store user input value
     
     System.out.print("Enter Value Of B : ");   // Print statement
     int b = scr.nextInt();   ///// declare Variable a to Store user input value
     
     swapNumFunction(a, b);    //// Call Function With parameter a and b 
     
   }
   
   public static void swapNumFunction(int num1, int num2){     ///// this is swap function
     
     System.out.println("Before Swap A :"+ num1 +" And B : "+num2);    // print statement before swap 
     
     ///// num1 = 5, num2 = 10    
     int result = num1;   /// result = 5
     num1 = num2; ///// num1 = 10
     num2 = result;  ///// num2 = 5
     
     System.out.println("After Swap A : "+ num1 +" And B : "+num2);   //  // print statement After swap 
     
      
     
     
   }
   
   
 }
