import java.util.Scanner;

 // By Ankush Patil



class MyClass
{
  
  Scanner scr = new Scanner(System.in);
  
  int num1 , num2;
  
  
  
  void read(){
    System.out.print("Enter A Number ");
    num1 = scr.nextInt();
    System.out.print("\nEnter A Number ");
    num2 = scr.nextInt();
  }
  
  void show(){
    
    System.out.println("Sum Of Two Numbers Is : "+(num1+num2));
    
  }
}

 class AnkushClassObj
 {
   public static void main(String args[])
   { 
    MyClass m1 = new MyClass();
    m1.read();
    m1.show();
   }
 }
