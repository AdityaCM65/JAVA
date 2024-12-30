// Write Java Code To Display Above Output
//  2 4 6 8 15
//  4 8 12 16 20
//  5 10 15 20 25
//  6 12 18 24 30
//  7 14 21 18 35


import java.util.*;

 // By Aditya C Mahajan

 class Assign_26
 {
   public static void main(String args[])
   { 
     // Instace Or Global Variables Are Declare
     int num1 = 2;
     int num2 = 4;
     int num3 = 5;
     int num4 = 6;
     int num5 = 7;
     
     // Outer For Loop
     for(int i = 1; i <= 5; i++){
       // Inner For Loop
       for(int j = 1; j <= 5; j++){
         
         if(i == 1){ // Outer Loop at i == 1;
          if(num1 == 10){
             System.out.print("\t 15");
             break;
           }
           System.out.print("\t "+num1);
           num1 += 2;
           
         }
         
         
         if(i == 2){ // Outer Loop at i == 2;
           
           System.out.print("\t "+num2);
           num2 += 4;
           
         }
         
         if(i == 3){ // Outer Loop at i == 3;
           
           System.out.print("\t "+num3);
           num3 += 5;
           
         }
         if(i == 4){  // Outer Loop at i == 4;
           
           System.out.print("\t "+num4);
           num4 += 6;
           
         }
         if(i == 5){ // Outer Loop at i == 5;
           
           System.out.print("\t "+num5);
           num5 += 7;
           
         }
         
         
         
         
       }
       System.out.println(); // After One Line Print Then Print New Line
     }
   
   }
 }
