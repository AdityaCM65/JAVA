import java.util.Scanner;

 // By Aditya C Mahajan

 class Reverse_Astring
 {
   public static void main(String args[])
   { 
     
     Scanner scr = new Scanner(System.in);
   
    System.out.println("Enter String You have to reverse : ");   /// print statement
    String original = scr.nextLine();     //// store user enter string in variable original 
    
    String rev = "";     //// store reverse string in variable rev
    
    int len = original.length();    //////  find length of string with length()  and store it in variable len
     
    for(int i=len-1; i>=0; i--){   /// beginiung of (i--) in decreament reverse loop
      
   rev = rev + original.charAt(i);        //// charAt()  is function to find in which index which value is present 
      
    }    ////// ending of for loop
    
    System.out.println(rev);   //// and print reverse string 
   }
 }
