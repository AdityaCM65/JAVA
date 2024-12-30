import java.util.Scanner;

 // By Aditya C Mahajan

 class Fact_Num
 {
   public static void main(String args[])
   { 
     
     Scanner scr = new Scanner(System.in);
     
     int fact = 1, i, num;
     
    System.out.println("Enter A Number");
    num = scr.nextInt();
    
    for(i=1; i<=num; i++){
      
      fact = fact*i;
    }
    
  System.out.println("The Factorial Of "+num+" Giver Number is : "+fact);
    
   }
 }
