import java.util.Scanner;

 // By Aditya C Mahajan

 class Sum_Of_Given_Num_Digits
 {
   public static void main(String args[])
   { 
     ///// sum of enter number digits 
     // example   : 
       ////  num = 543 ; 5 + 4 + 3 = 12
     
     Scanner scr = new Scanner(System.in);  /// creating object of scanner class scr
     
    System.out.print("Enter The Number : ");   ///// print statement
   int num = scr.nextInt();    //// get value from user intput
   int temp = num;   ////  store the user enter value in temp variable
   int sum = 0;   //// this is store sum of digits 
   
   while(temp > 0){   ////   when temp value is greater than 0 then this loop is execute
     
     int lastDigit = temp % 10;   ///  find user enter num last digit and store it in lastDigit variable
     temp = temp / 10;  // temp /= 10
     sum = sum + lastDigit; // sum += lastDigit
     
   }
   
   System.out.println(" The Sum Of these digits : "+sum);   //// print sum of digits 
   
   
   
   
   }
 }
