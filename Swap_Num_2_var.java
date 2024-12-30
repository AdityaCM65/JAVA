import java.util.Scanner;

 // By Aditya C Mahajan

 class Swap_Num_2_var
 {
   public static void main(String args[])
   { 
     
     Scanner scr = new Scanner(System.in);
     
     System.out.print("Enter the value of A : ");
     int a = scr.nextInt();
    
      System.out.print("Enter the value of B : ");
     int b = scr.nextInt();
     
    swap2Num(a, b);
    
   }
   
   
   
   public static void swap2Num(int num1, int num2){
  //   5 10
   
    System.out.println(" Before Swap A : "+num1+" B : "+num2);
     
     num1 = num1+num2; // num = 5 + 10 = 15
     num2 = num1-num2; // num = 15 - 10 = 5
    num1 = num1-num2;  // num = 15 - 5 = 10
    
   /* a=a+b;//a=30 (10+20)    
    b=a-b;//b=10 (30-20)    
    a=a-b;//a=20 (30-10)    
    */
    
    System.out.println(" After Swap A : "+num1+" B : "+num2);
       
       
     
     
   }
 }
