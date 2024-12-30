import java.util.*;

 // By Aditya C Mahajan

class Demo
{
 public void showSup(){
   System.out.println(" Super Class ");
 }
}

class Demo2 extends Demo
{
 public void showSub(){
   System.out.print(" Sub Class ");
 }
}

 class SingleInherit
 {
   public static void main(String args[])
   { 
    Demo2 d1 = new Demo2();
    d1.showSup();
    d1.showSub();
   }
 }
