import java.util.*;

 // By Aditya C Mahajan

 class Result
 {
   public static void main(String args[])
   { 
     int marks = 100;
     
     if(marks < 50){
       System.out.println("You Are FAIL!!!");
     }
     
     else if(marks >= 50 && marks <= 60){
       System.out.println("You Are Grade D!!");
     }
    
     else if(marks > 60 && marks <= 75){
       System.out.println("You Are Grade C!!");
     }
    
      else if(marks > 75 && marks < 90){
       System.out.println("You Are Grade B!!");
     }
    
     else if(marks >= 90 && marks <= 100){
       System.out.println("You Are Grade A!!");
     }
    
     else{
    System.out.println("Invalid!");
   }
   }
 }
