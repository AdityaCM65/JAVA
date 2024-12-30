import java.util.Scanner;

 // By Aditya C Mahajan


// Declare A Class
class CubeOfNum {
  
  // Creating Object Of A Scanner Class
  Scanner scr = new Scanner(System.in);
  
  // Data Members
  int num,n;
  
  // Member Function Read To Get Number
  void read(){
 
    System.out.print("Enter A Number : ");
   // call nextInt Method With Object Scr
    num = scr.nextInt();
    
    // Store Num Value In n Variable
    n = num;
    
  }
  
  // Member Function For Display Result
  void display (){
    
    // Calculation for find cube of number
    num = num * num * num;
    
    // print statement
    System.out.println("Cube Of "+n+" Is : "+num);
  }
}


// Main Class
 class Cube_Num
 {
   public static void main(String args[])
   { 
    
    // Creating Object Of CubeOfNum Class
    CubeOfNum cbn = new CubeOfNum();
    
    // Call Method Of CubeOfNum Class With cbn Object
    cbn.read();
    
    // Call Method Of CubeOfNum Class With cbn Object
    cbn.display();
    
   }
 }
