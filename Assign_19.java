import java.util.Scanner;
import java.lang.Math;

 // Aditya C Mahajan

 class Assign_19
 {
   public static void main(String args[])
   { 
     int a,b,c;
     
    Scanner scr = new Scanner(System.in);
    
    System.out.println("Enter the length  of First Side : " );
     a = scr.nextInt();
    
    System.out.println("Enter the length  of Second Side : " );
    b = scr.nextInt();
    
   c = (a*a)+(b*b);
    
    System.out.println("Hypotaneus Of Triangle is : "+(Math.sqrt(c)));
    
    
   }
 }