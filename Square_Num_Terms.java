import java.util.*;

 // By Aditya C Mahajan

 class Square_Num_Terms
 {
   public static void main(String args[])
   { 
     Scanner scr = new Scanner(System.in);
    
    System.out.println("Enter A Term");
   int num = scr.nextInt();
     
     for(int i = 1; i <= num; i++){
       
       System.out.println(i+" Squared is : "+(i*i));
       
     }
     
    }
 }
