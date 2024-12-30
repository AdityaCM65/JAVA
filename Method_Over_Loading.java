import java.util.*;

 // By Aditya C Mahajan

 class Method_Over_Loading
 {
   public static void main(String args[])
   { 
     
     Method_Over_Loading obj = new Method_Over_Loading();
     
     int a = 5,b =10;
     int c = 3;
     
     int area_rectangle = obj.area(a, b);
     
     float area_circle  = obj.area(c);
    
    System.out.println(" The area of rectangle is : "+area_rectangle );
    
    System.out.println(" The area of rectangle is : "+area_circle );
    
        
    
    
   }
   
   public static int area(int num1, int num2){
     
     int result = num1 * num2;
     
     return result;
     
     
   }
 
  public static float area(int num){
     
     float result = 3.14f * num * num;
     
     return result;
     
   }
 
 
 
 
 
 
 
 
 
 }
