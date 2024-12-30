
// Write Java Code To Display Above Output
//  2 4 6 8 15
//  4 8 12 16 20
//  5 10 15 20 25
//  6 12 18 24 30
//  7 14 21 18 35



import java.util.*;

 // By Aditya C Mahajan

 class Assign_26_02
 {
   public static void main(String args[])
   { 
     // Instance Variable Declare
     int c;
     
     // Outer For Loop
     for(int i = 2; i <= 7; i++){
       
       if(i == 3){ // 3 6 9 13 are Not In Series Because Of 
         continue; // when Outer Loop At 3 The. Continue
       }
       // Inner For Loop
       for(int j = 1; j <= 5; j++){
         c = i * j;
         if(i == 2 && j == 5){
          System.out.print("15");
          break;
         }
         System.out.print(c+"\t ");
       }
       System.out.println(); // Print New Line Statement
     }
   
   }
 }
