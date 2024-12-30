import java.util.*;

 // By Aditya C Mahajan

 class Nested_If_Else
 {
   public static void main(String args[])
   { 
     int a = 25, b = 40, c = 35;
     int result = 0;
     
     if(a > b){
       
       if(a > c){
         result = a;
       }
       else{
         result = c;
       }
     }
     else{
       if(b > c){
         result = b;
       }
       else{
         
         result = c;
       }
     }
    System.out.println("largest number between this three numbers is : "+ result);
   }
 }
