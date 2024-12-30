import java.util.*;

 // By Aditya C Mahajan

 class MenuCard
 {
   public static void main(String args[])
   { 
   
   /// Design Menu Card
   System.out.println("   ********** MENU CARD **********");
   System.out.println("_____________________________________");

   
   System.out.println("        ITEMS     |     PRIZE   ");
   System.out.println("-------------------------------------");
   System.out.println("1. Mixed Vege.    |       250/- ");
  
  
   System.out.println("-------------------------------------");
   System.out.println("2. Paneer Saag    |       270/- ");
   
   System.out.println("-------------------------------------");
   System.out.println("3. Paneer Tikka   |       220/- ");
   
    
   System.out.println("-------------------------------------");
   System.out.println("4. Veg Biryani    |       240/- ");
   
   System.out.println("_____________________________________ \n \n");
   
   
   /// Getting User Input 
   
   Scanner scr = new Scanner(System.in);
   
   int oNum , nOrd;
   double result;
   
   System.out.print(" Enter Order Number : ");
   oNum = scr.nextInt();
   
   System.out.print(" Enter Number Of Order : ");
   nOrd = scr.nextInt();
   
   System.out.println("\n");
   System.out.println("     ***** YOUR BILL PAYMENT ***** ");
   System.out.println("_____________________________________");
   switch (oNum) {
     
     case 1 : 
       System.out.println("        Your Order : Mixed Vege");
       System.out.println("        Prize      :   250/- ");
       System.out.println("        No. Order  :  "+nOrd);
       result = 250 * nOrd;
       System.out.println("        Total      :  "+result);
              break;
              
     case 2 : 
       System.out.println("        Your Order : Paneer Saag");
       System.out.println("        Prize      :   270/- ");
       System.out.println("        No. Order  :  "+nOrd);
       result = 270 * nOrd;
       System.out.println("        Total      :  "+result);
              break;           
              
     case 3 : 
       System.out.println("        Your Order : Paneer Tikka");
       System.out.println("        Prize      :   220/- ");
       System.out.println("        No. Order  :  "+nOrd);
       result = 220 * nOrd;
       System.out.println("        Total      :  "+result);
              break;  
     
     case 4 : 
       System.out.println("        Your Order : Veg Biryani");
       System.out.println("        Prize      :   240/- ");
       System.out.println("        No. Order  :  "+nOrd);
       result = 240 * nOrd;
       System.out.println("        Total      :  "+result);
              break;  
     
     default :
       System.out.print(" Please Enter Proper Order Number ");
   }
   
   System.out.println("_____________________________________");
   System.out.println("          Thanks For Coming ");
   System.out.println("_____________________________________");
   System.out.println(" \n                     - Aditya C M");
   
   }
   
 }
