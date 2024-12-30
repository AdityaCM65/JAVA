import java.util.Scanner;

 // By Aditya C Mahajan

 class Logical_Or_Operator
 {
   public static void main(String args[])
   { 
     
     Scanner scr = new Scanner(System.in);
     
    System.out.println("Enter your class : ");
   int age = scr.nextInt();
   
   if(age == 10 || age == 12){
     System.out.println("you can gave board exam now ");
     
   }
   else{
     System.out.println("you can not gave board exam now ");
     
     
   }
   }
 }
