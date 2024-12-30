import java.util.*;

 // By Aditya C Mahajan

class Demo1
{
  void show1(){
    System.out.println(" Demo1 Method");
  }
}

class Demo2 extends Demo1
{
  void show2(){
    System.out.println(" Demo2 Method");
  }
}

class Demo3 extends Demo2
{
  void show3(){
    System.out.println(" Demo3 Method");
    super.show1();
  }
}


 class MultiLevelInherit
 {
   public static void main(String args[])
   { 
    Demo3 d1 = new Demo3();
    d1.show1();
    d1.show2();
    d1.show3();
   }
 }
