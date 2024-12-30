import java.util.*;

 //By Aditya C Mahajan

 class PerfectNum
 {
   public static void main(String args[])
   { 
    Scanner scr = new Scanner(System.in);
    System.out.print(" Enter A Number ");
    int num = scr.nextInt();
    
    // Perfect Num 6 = 6/1 6/2 6/3 == 0 1 + 2 + 3 = 6
   
   int sum = 0;
   
   for(int i = 1; i <= num/2; i++)
   {
     if(num % i == 0)
     {
       sum = sum + i;
       
     }
   }
   
   if( sum == num )
   {
     System.out.println(num+" Is A Perfect Number ");
   }
   else
   {
     System.out.println(num+" Is Not A Perfect Number ");
   }
 
   }
 }
