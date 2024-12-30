import java.util.*;

 // By Aditya c Mahajan

 class AscendingArray
 {
   public static void main(String args[])
   { 
     
     int []arr = new int[5];
     int temp;
     
     Scanner scr = new Scanner(System.in);
    System.out.println(" Enter Array Elements : ");
    
    for(int i = 0; i < arr.length; i++ ) {
      arr[i] = scr.nextInt();
    }
    
    // for Ascending Order
   for( int i = 0; i < arr.length; i++) {
     for( int j = i+1; j < arr.length; j++) {
       if( arr[i] > arr[j] ) {
         temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
       }
     }
   }
   
   // print Array In Ascending Order
  System.out.println("Array In Ascending Order");
   for(int i = 0; i < arr.length; i++) {
     System.out.print(" "+arr[i]);
   }
   
   System.out.println();
   
   // for Descending Order
   for( int i = 0; i < arr.length; i++) {
     for( int j = i+1; j < arr.length; j++) {
       if( arr[i] < arr[j] ) {
         temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
       }
     }
   }
   // Print Array In Descending Order
    System.out.println("Array In Descending Order");
   for(int i = 0; i < arr.length; i++) {
     System.out.print(" "+arr[i]);
   }
   
   }
 }
