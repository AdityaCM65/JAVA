import java.util.*;

 // By Aditya C Mahajan

 class Assign_25
 {
   public static void main(String args[])
   { 
     // Instance Or Global  Variable Declare 
     int num1 = 2;
     int num2 = 15;
     int num3 = 16;
     int num4 = 25;
     
     
     // Outer For Loop
     for(int i = 1; i<5; i++){
       // Inner For Loop
       for(int j = 1; j<=5; j++){
       
       if(i==1){ 
        
         System.out.print("\t\t"+num1);
         num1 +=2;     //  num1 =num1 +2;
       }
       
       if(i==2){
         System.out.print("\t\t"+num2);
         num2--;      // num2 = num2 -1;
         
       }
       if(i==3){
        
         
         System.out.print("\t\t"+num3);
          num3++;    // num3 =num3 +1;
       }
       if(i==4){
        
         
         System.out.print("\t\t"+num4);
         num4--;      //  num4 =num4 -1;
       }
       
       
       
       }
       System.out.println(); /// This Is Print Statement
     }
    
   }
 }
