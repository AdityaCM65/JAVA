import java.util.*;

 // By Aditya C Mahajan

abstract class Animal
{
  abstract void eat();
}


class Dog extends Animal
{
  void showD(){
  System.out.println("This Is Dog Class");
  }
  void eat(){
    System.out.println("Eat Method In Dog");
  }
  
}

class Tiger extends Animal
{
  
  void eat(){
    System.out.println("Eat Method In Tiger");
  }
  void showT(){
  System.out.println("This Is Tiger Class");
  }
}

 class AbstractClass 
 {
  
   public static void main(String args[])
   { 
     Animal a1 = new Dog();
     a1.eat();
     
     Animal a2 = new Tiger();
     a2.eat();
   
   
   }
 }
