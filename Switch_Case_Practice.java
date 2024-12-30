import java.util.Scanner;

 // By Aditya C Mahajan

 class Switch_Case_Practice
 {
   public static void main(String args[])
   { 
     Scanner scr = new Scanner(System.in);
    
    
     System.out.println("Enter First Number : ");
     int fnum = scr.nextInt();
     
     System.out.println("Enter Second Number : ");
      int snum = scr.nextInt();
      
      System.out.println("Enter Operation (+ - * /) : ");
       String opn = scr.next();
       
    //   System.out.println(fnum);
    //   System.out.println(snum);
    //   System.out.println(opn);
       
     switch(opn){
        
       case "+" :
        System.out.println(" The Addition is : "+(fnum + snum));
         break;
         
         
       case "-" :
         System.out.println(" The Substraction is : "+(fnum - snum));
         
         break;
         
       case "*" :
         System.out.println(" The Multiplication is : "+(fnum * snum));
         break;
         
       case "/" :
         System.out.println(" The Dividation is : "+(fnum / snum));
         break;
       
       default :
         System.out.println(" Invalid Operation ");
      
     }
      
     
    
   }
 }
