// Write A Java Program To Demonstrate Interface

import java.util.*;

 // By Aditya C Mahajan

interface Animal {
  void eat();
  void run();
}

class Dog {
  public void eat() {
    System.out.println("Dog Is Eating");
  }
  
  public void run() {
    System.out.println("Dog Is Running");
  }
}

class Tiger {
  public void eat() {
    System.out.println("Tiger Is Eating");
  }
  
  public void run() {
    System.out.println("Tiger Is Running");
  }
}


 class InterfaceProg
 {
   public static void main(String args[])
   { 
    Dog d1 = new Dog();
    d1.eat();
    d1.run();
    
    Tiger t1 = new Tiger();
    t1.eat();
    t1.run();
   }
 }
 
   }
 }
