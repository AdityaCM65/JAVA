import java.util.Scanner;

 // By Aditya C Mahajan

class Palindrome_Num_Check
  {
   public static void main(String args[])
   {
     
     ///// CHECK NUMBER IS PALINDROME OR NOT
     /// palindrome number is like mirror the number is reverse then  it is same 

     ///// Ex :  121 = 121 is palindrome number
      ////       345 = 345   is not palindrome number
     Scanner scr = new Scanner(System.in);   /// creating object of scanne class
    System.out.println(" Enter Number to check Palondrome or not : ");  /// print statement
    int num = scr.nextInt();  ///// store user enter value in num variable
    
    int temp = num;   //// also store user enter value in temp variable
    int revs = 0;  //// in revs variable we store reverse number
    
    
    while(temp > 0){    /// when temp is greater than 0 then this loop is execute
      
      int lastDigit = temp % 10;    //// find last digit of number
      revs = revs * 10 + lastDigit;   // store one by one digit in revs variable
        temp = temp / 10;    ////  temp is divide by 10 because we find starting number
      
      
    }
    if(revs == num){    /// if revs  number is equal to user enter number then it's palindrome
   System.out.println(num+ " The number is Palindrome ");  ////// print statement 
   }
   else{  //else is not palindrome
     
     System.out.println(num+ " The number is not Palindrome ");  //// print statement 
   
   }
   
   }
 }
