import java.util.Scanner;

 // By Aditya C Mahajan

 class For_Loop_02
 {
  
   
   
   public static void main(String args[])
   { 
     /// Addition of numbers until the user enter number
     
  Scanner scr = new Scanner(System.in);
    System.out.println("Enter a number : ");
    int num = scr.nextInt();
    int sum = 0;
    
    
    for(int i = 0; i <= num; i++){
      
      sum += i;  /// sum = sum + i
      
      
    }
    
    System.out.println(sum);
    
    
    
   }
 }
