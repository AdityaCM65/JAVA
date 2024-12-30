import java.util.Scanner;

 // By Aditya C Mahajan

 class Rating_Switch
 {
   public static void main(String args[])
   { 
     
     Scanner scr = new Scanner(System.in);
     System.out.println(" Enter Your Rating ");
     int  r  =  scr.nextInt(); 
     
     switch(r){
       
       case 1:
         System.out.println("Not Bad ");
         break;
         
         case 2:
           System.out.println(" Good ");
           break;
           
           case 3:
             System.out.println(" Very Good ");
             break;
        
         case 4:
           System.out.println("Outstanding");
         break;
       
       case 5:
         System.out.println(" Excellent");
       break;
       
       default:
         System.out.println("Invalid Rating ");
         break;
       
       
     }
    
   }
 }
