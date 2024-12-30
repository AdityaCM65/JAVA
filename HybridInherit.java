import java.util.*;

 // By Aditya C Mahajan

class Demo1
{
  void display1()
  {
    System.out.print(" Demo1 ");
  }
}

class Demo2 extends Demo1
{
  void display2()
  {
    System.out.print(" Demo2 ");
  }
}

class Demo3 extends Demo1
{
  void display3()
  {
    System.out.print(" Demo3 ");
  }
}

class Demo4 extends Demo2
{
  void display4()
  {
    
   
    System.out.print(" Demo4 ");
  }
}

 class HybridInherit
 {
   public static void main(String args[])
   { 
    Demo4 d1 = new Demo4();
    d1.display4();
   }
 }
