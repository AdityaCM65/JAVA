import java.util.*;

 // By Aditya C Mahajan

 class StarPrint     ///// Main Class Is StarPrint
 {
   public static void main(String args[])
   { 
     int n = 5;    /* *
       we print this :   *     1
                         **    2
                         ***   3
                         ****  4
                         ***** 5   n = 5 ;
       
       
       
       */
     
     for(int i = 0; i < n; i++){     /// we are using nested for loop, this loop for how many lines we print
     
  
   
   
     for(int j = 0; j <= i; j++){     /// this loop for how many stars print in each line
    System.out.print("*");    //// print *
   }
   System.out.println();    ///// this line code for after print star new line
   }     // ending of for 2nd loop
   
 }    //// Ending for loop 1st 
 
 }
