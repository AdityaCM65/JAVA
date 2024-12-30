import java.util.*;

 // By Aditya C Mahajan

 class Array_01
 {
   public static void main(String args[])
   { 
  /*   char a[] = new char[5];     /// create array with data type char variable a
     
     a[0] = 'A';
     a[1] = 'B';
     a[2] = 'C';
     a[3] = 'D';
     a[4] = 'E';
     
     for(int i = 0; i < 5; i++){      /// for loop for print value in array
     
    System.out.println(a[i]);
   
   } */
   
   ///  INITIALIZE VALUE IN ARRAY
   
   int []a = new int[10];      //// create array integer data type 
   
   for(int i = 0; i < 10; i++){   /// this for loop for initialize value in array
     
   a[i] = i;     /// when i = 0 then a[0] = 0 means when array index is 0 then its value is 0
     
   }
   
   for(int j = 0; j < 10; j++){    //// this for loop for print values of an array
     
   System.out.println(a[j]); 
     
   }
   
   
   
   
   
   
   
   
   
   }
 }
