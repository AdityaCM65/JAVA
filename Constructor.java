import java.util.*;

// ************ CONSTRUCTOR *************
 /* 
   - Constructor :
     constructor is use to initialze an object
     
  * Types Of Constructor
  1. Default Constructor --> its a non argument constructor created by java compiler
  2. Non Args Constructor --> its also non argument constructor but created by user or programmer
  3. Parameterized Constructor --> its a parameter constructor, user pass parameter in constructor 
*/

 // By Aditya C Mahajan
 
// Class Constructor
 class Constructor
 {
   // Non Args Constructor
   Constructor(){
     this("aditya");  // Call Parameterized Constructor with this keyword
     System.out.println("Default Constructor");// Its automatically call when instance of class
    
   }
   // Parameterized Constructor
   Constructor(String name){
    System.out.println(name); // print statement
    System.out.println("Succesfull !!");
     
    
   }
   
   public static void main(String args[])
   { 
     
     // Creating Object Of Constructor Class
     Constructor cn = new Constructor();
     
   }
 }
