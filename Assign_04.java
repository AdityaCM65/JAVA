import java.util.Scanner;

 // By Aditya C Mahajan

 class Assign_04
 {
   public static void main(String args[])
   { 
     Scanner scr = new Scanner(System.in);
     int num,s,c,r;
    System.out.println("Enter Number");
    num = scr.nextInt();
    
    s = num;
   c = 0;
    
    while(num > 0){
      
      r = num % 10;
      c = (c*10)+r;
      num = num/10;
      
      
    }
    if(s == c){
 System.out.println("The Number Is Palindrome");
      
    }
    else{
     System.out.println("Not Palindrome");
      }
    
   }
 }
