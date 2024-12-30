import java.util.*;

 // By Aditya C Mahajan

 class ArmstrongNum
 {
   public static void main(String args[])
   { 
    Scanner scr = new Scanner(System.in);
    
    System.out.print("Enter A Number : ");
    int num = scr.nextInt();
    
    int sum = 0;
    int rmd;
    int check = num;
    
    while (num > 0){
      rmd = num % 10;
      sum = sum + (rmd * rmd * rmd);
      num = num /10;
    }
    
    
    if(check == sum)
    {
      System.out.println(check+" Is Armstrong Number");
    }
     else{
      System.out.println(check+" Is Not Armstrong Number");
    }
   }
 }
