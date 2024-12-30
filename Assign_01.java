import java.util.Scanner;

 //By Aditya C Mahajan

 class Assign_01
 {
   public static void main(String args[])
   { 
     Scanner scr = new Scanner(System.in);
     
     System.out.print("Enter A Number a : ");
     
     int a = scr.nextInt();
     System.out.print("Enter A Number b : ");
     
     int b = scr.nextInt();
     
     if(a > b){
    System.out.println("The Greater Number Is a = "+a);
    }
    else{
     System.out.println("The Greater Number Is b = "+b);
   
      
    }
   }
 }
