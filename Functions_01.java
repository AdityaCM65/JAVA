import java.util.*;

 //by Aditya C Mahajan

 class Functions_01
 {
      //////////  void functions /////////
   public static void main(String args[])    /// this is main function 
   {
     
     
      
    aditya();    //// call function aditya()
    add(5, 6);    ///// call function add() with parameters value 5 and 6
   }
   
   public static void aditya(){      ///  because of static keyword this function not call with an object
     System.out.println("Hi I am Aditya");   //// print message "Hi I Am Aditya"
     /////  this function not return value so we use void keyword
   }
   
   public static void add(int num1 , int num2 ){   ////  because of static keyword this function not call with an object with two parameters 
     int res = num1 + num2;                      /// create int to store sum of this numbers
     System.out.print(" The sum is : "+ res);   ///  print statement
     
   }
   
   
   
   
 }
