import java.util.*;

 // By Aditya C Mahajan

 class Calculator
 {
   public static void main(String args[])
   { 
     
     boolean run = false;
     
     
     
     while(!run) {
     
     int sum , div , sub , mul;
     Scanner scr = new Scanner(System.in);
    System.out.println("Enter A Number");
    int num1 = scr.nextInt();
    System.out.println("Enter Operator ( + , - , / , *)");
    char opr = scr.next().charAt(0);
    System.out.println("Enter A Number");
    int num2 = scr.nextInt();
    
    
    switch (opr) {
      case '+' :
        sum = num1 + num2;
        System.out.println(" Addition Is : "+sum);
        break;
       case '-' :
        sub = num1 - num2;
        System.out.println(" Substraction Is : "+sub);
         break;
         case '*' :
        mul = num1 * num2;
        System.out.println(" Multiplication Is : "+mul);
        break;
       case '/' :
        div = num1 / num2;
        System.out.println(" Dividation Is : "+div);
         break;
         default :
           System.out.print(" Enter Valid Operations");

    }
    }
   }
 }
