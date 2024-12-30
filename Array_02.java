import java.util.*;

 // By Aditya C Mahajan

 class Array_02
 {
   public static void main(String args[])
   { 
     int a[] = new int[5];
     int b[] = new int[5];
     int c[] = new int[5];
     int num = 5;
     
     for(int i = 0; i < 5; i++){
       
       a[i] = i;
     }
     
     for(int i = 0; i < 5; i++){
       
       b[i] = num;
       num++;
     }
     
     System.out.print(" Array A : ");
     
     for(int i = 0; i < 5; i++){
       System.out.print(a[i] + " ");
       
     }
     
     System.out.println("\n");
     System.out.print(" Array B : ");
     
     for(int i = 0; i < 5; i++){
       System.out.print(b[i] + " ");
       
     }
     System.out.println("\n");
     
     System.out.print(" Array C : ");
     for(int i = 0; i < 5; i++){
       
       
       c[i] = a[i] + b[i];
     }
     
     for(int i = 0; i < 5; i++){
       
       System.out.print(c[i] + " ");
       
     }
     
     
     
     
    
   }
 }
