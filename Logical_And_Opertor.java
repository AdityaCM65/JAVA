import java.util.Scanner;

 // Compiler version JDK 11.0.2

 class Logical_And_Operator
 {
   public static void main(String args[])
   { 
     
     Scanner scr = new Scanner(System.in);
     
    System.out.println("enter a number");
   int num = scr.nextInt();
   
   if(num >= 1 && num <= 100){
     System.out.println("number is in the range [ 1 - 100 ]");
     
   }
   else{
     System.out.println("number is not in the range [ 1 - 100 ]");
     
     
   }
   }
 }
