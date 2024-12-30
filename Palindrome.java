import java.util.*;

 // By Aditya C Mahajan

 class Palindrome
 {
   public static void main(String args[])
   { 
     Scanner scr = new Scanner(System.in);
     
    System.out.println("Enter A Number");
    int num = scr.nextInt();
    
     int  cnum = num;
     int s = 0;
     int rnum;
     
     while(num>0){
       
       rnum = num % 10;
       s =(s*10)+rnum;
       num /= 10;
     }
     
     if( cnum == s)
     {
       System.out.println(cnum+" is Palindrome Number");
       
        }
        
        else {
       System.out.println(cnum+" is Not Palindrome Number");
       
        }
     
     
   }
 }


