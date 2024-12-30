import java.util.Random;
import java.util.Scanner;

 // By Aditya C Mahajan

 class Num_Guess_Game
 {
   public static void main(String args[])
   {
         System.out.println(" ********  Number Guessing Game ******** ");
  
      System.out.println(" \n");
      
       Random rnd = new Random();
      
       Scanner scr = new Scanner(System.in);  
     
       int rNum = rnd.nextInt(10);
      
      System.out.print("Enter A Number (1 to 10) : ");
      int num = scr.nextInt();   
   
      System.out.println();
   
    //System.out.println(rNum);
    int count = 0;
   do{
     
     
     if(num < rNum){
       System.out.println(" Enter Higher Number Please !!");
       num = scr.nextInt();
     System.out.println();
     }
     
     
     else if(num > rNum){
       System.out.println(" Enter Lower Number Please !!");
        num = scr.nextInt();
        System.out.println();
     }
  
     count++;
   }while(rNum != num);
   System.out.println("You Guessed in "+count+" Attempts");
   
   
   
   }
 }
