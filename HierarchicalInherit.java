import java.util.*;

 // By Aditya C Mahajan

class SuperClass
{
  int a;
  void read()
  {
    a = 10;
    // System.out.println(" Method In Super Class");
  }
}

class Demo1 extends SuperClass
{
  void sqr(){
    System.out.println(a*a);
  }
}

class Demo2 extends SuperClass
{
  void cube(){
    System.out.println(a*a*a);
  }
}

class Demo3 extends SuperClass
{
  int b = 10;
  void sum(){
    int c = a + b;
    System.out.println(c);
  }
}



 class HierarchicalInherit
 {
   public static void main(String args[])
   { 
     Demo1 d1 = new Demo1();
    d1.read();
     d1.sqr();
     
     
     Demo2 d2 = new Demo2();
     d2.read();
     d2.cube();
     
     
     Demo3 d3 = new Demo3();
     d3.read();
     d3.sum();
     
    
     
   
   }
 }
