import java.util.*;

 // By Aditya C Mahajan

 class MethodOverloading
 {
   //Two Parameters Pass Method of Adding two numbers
   void add(int a, int b){
     System.out.println(a+b);
   }
   
    //Three Parameters Pass Method of Adding three numbers
   void add(int a, int b, int c){
     System.out.println(a+b+c);
   }
    
   //Four Parameters Pass Method of Adding four numbers
    void add(int a, int b, int c, int d){
     System.out.println(a+b+c+d);
   }

   
   public static void main(String args[])
   { 
   
   // Creating Object Of MethodOverloading Class
   MethodOverloading ml = new MethodOverloading();
   
   // Call Add Method With Object ml
   ml.add(6,7,4,45);
   
   }
 }
