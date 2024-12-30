import java.util.Scanner;

 // By Aditya C Mahajan

// Declare Class
class NumOfSqr
{
  // Creating Object Of A Scanner Class
  Scanner scr = new Scanner(System.in);
  
  // Data Members
  int num1 , num2;
  
  
  // Member Function For Get User Input
  void read(){
    System.out.println("Enter First Number");
    num1 = scr.nextInt();
    
    System.out.println("Enter Second Number");
    num2 = scr.nextInt();
  }
  
  // Member Function For Display Result
  void display (){
    
    System.out.println("Square Of "+num1+" Is : "+num1*num1);

    System.out.println("Square Of "+num2+" Is : "+num2*num2);


  }
  
}

// Declare A Main Class 
 class SqrNum
 {
   public static void main(String args[])
   { 
     // Creating Object Of NumOfSqr Class (User Defined)
     NumOfSqr nsr = new NumOfSqr();
     
     // Call Methods For Execute
     nsr.read();
     // Call Methods For Execute
     nsr.display();
   
   }
 }
