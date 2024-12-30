import java.util.*;

 // By Aditya C Mahajan

 class Assign_24
 {
   public static void main(String args[])
   { 
   // Instance Or Global Variables Declare
     int num = 7; 
     int num2 = 7;
     
     // Outer For Loop
     for(int i = 1; i<=5; i++){
       // Inner For Loop
       for(int j = 2; j <= 6; j++){
         if(i == 1){
           System.out.print((j*j)+ " \t " );  
         }
       if(i == 2){
         
         System.out.print((j*j*j) + " \t " );  
       }
       if(i == 3){
         
         System.out.print((num * num)+ " \t " );  
         num++;
       }
       
       if(i == 4){
        
         System.out.print((num2 * num2 * num2)+ " \t " );  
     num2++;
     
       }
       
     }
     System.out.println(); //Print New Line Statement
           
   }
   }
 }