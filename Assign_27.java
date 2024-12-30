
//Write A Java Code To Display Following Output
//         45 34 23 12 2


import java.util.*;

 // By Aditya C Mahajan

 class Assign_27
 {
   public static void main(String args[])
   { 
     // Instance Or Global Variables Declare
     int num = 45; // First Number In Number Series Is 45
     int num2 = 2; // Last Number In Number Series Is 2
    
    // For Loop 
     for(int i = 1; i <= 4; i++){ // Beginning Of For Loop
    
      System.out.print("\t "+num);  // Print Numbers
       num -= 11; // num = num - 11; num = 45 -11 ; ...
    }
    System.out.print("\t "+num2); // Print Last Number 2
   }
 }
