import java.util.*;

 // By Aditya C Mahajan

 class Functions_02
 {
   public static void main(String args[])
   { 
     Functions_02 obj = new Functions_02(); 
    int a = 67,b = 50;
    int result = obj.add(a,b);
    
    System.out.println(" The Sum Of This Two Numbers Is : " + result);
    
    
   }
   
   public int add(int num1 , int num2){
     
     int result = num1 + num2;
     
     return result;
     
     
   }
   
   
   
   
 }
