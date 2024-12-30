import java.util.Scanner;

 // By Aditya C Mahajan

 class Assign_09
 {
   public static void main(String args[])
   { 
     
     /////////   ******* PERFECT NUMBER OR NOT ***********
     
     //// Ex : 6 divisible by  1 2 3 
     ////  and addition of these numbers 1 + 2 + 3 = 6   hence it is perfect number
    
    Scanner scr = new Scanner(System.in);
    
    System.out.print("Enter a Number : ");
    int num = scr.nextInt();
    
    
    int i = 1;
    int sum = 0;
    
    while(i <= num/2){
      
      if(num % i == 0){
        
        sum = sum + i;
      }
      
      i++;
    }
    
    if(sum == num){
      System.out.println(num+" is Perfect Number");
    }
  else{
      System.out.println(num+" is Not Perfect Number");
    }
  
   }
 }
