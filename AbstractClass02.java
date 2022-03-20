import java.util.*;

 // By Aditya C Mahajan

abstract class Mobile{
  abstract void prize();
  }

class RealMe extends Mobile{
  void prize(){
    System.out.println("Real Me Prize Under 10 - 20");
  }
  }
  
 class AbstractClass02
 {
   public static void main(String args[])
   { 
     Mobile m1 = new RealMe();
     m1.prize();
    
   }
 }
