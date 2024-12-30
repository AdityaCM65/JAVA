import java.util.Scanner;

 // By Aditya C Mahajan

 class Calculater_Java
 {
   public static void main(String args[])
   {
     
     
       Scanner scr = new Scanner(System.in);
   
      
     int a; 
     int b;
     int result = 0;
    
    System.out.print("Enter value of A : ");
    a = scr.nextInt();
    
    System.out.print("Enter the value of B : ");
    b = scr.nextInt();
    
    
    scr.nextLine();
    
    
    System.out.println("Enter Operation");
     
     
     char o = scr.nextLine().charAt(0);
     
    switch(o){
      
      case '+':
        result = a + b;
        break;
      
      
      case '-':
        result = a - b;
        break;
        
        
      case '*':
        result = a * b;
        break;
        
        
        
        
      case '/':
        result = a / b;
        break;
        
        
     default :
       
       System.out.println("INVALID OPERATIONS");
        
        
        
    } 
     
     
       System.out.println("The result is : "+result);
     
     
    
   }
 }
