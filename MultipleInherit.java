import java.util.*;

 // By Aditya C Mahajan

interface Demo1
{
  int players = 11;
  public void sports();
}

interface Demo2
{
  
  public void cricket();
}
interface Demo3
{
 public void kabaddi();
}

class MyClass implements Demo1 , Demo2 , Demo3
{
  public void sports()
  {
   
    System.out.println(" Cricket "+players);
 
 
 
  }
  
  public void cricket()
  {
    System.out.println(" Virat Kohli ");
  }
  
  public void kabaddi()
  {
    System.out.println(" Anup Kumar ");
  }
}
 class MultipleInherit
 {
   public static void main(String args[])
   { 
    MyClass m1 = new MyClass();
    m1.sports();
    m1.cricket();
    m1.kabaddi();
   }
 }
