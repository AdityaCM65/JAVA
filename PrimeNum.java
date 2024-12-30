import java.util.*;

 // By Aditya C Mahajan

 class PrimeNum
 {
   public static void main(String args[])
   { 
    Scanner scr = new Scanner(System.in);
    System.out.println(" Enter A Number To Check Prime Or Not");
    int num = scr.nextInt();
    
    // Prime Number Divided by 1 and Itself

   int count = 1;
   
   for(int i = 2; i<=num/2; i++)
   {
     if( num % i == 0){
       count++;
     }
   }
   
   if(count <= 1){
     System.out.println(num+" is Prime Number ");
   }
   else{
     System.out.println(num+" is Not Prime Number");
   }
   }
 }
