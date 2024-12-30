import java.util.*;

 // By Aditya C Mahajan
 
 // ************* INTERFACE IN JAVA ********
   
 // Create InterFace AnimalColor
 interface AnimalColor
{
  // Member Function
  public void color(); // Its A Method Of Color
}

// Create InterFace AnimalSpeed
interface AnimalSpeed
{ 
  // Member Function
  public void speed(); // Its A Method Of Speed
}


class Animal implements AnimalColor, AnimalSpeed
{
  public void color(){
    System.out.println("Yellow");
  }
  
  public void speed(){
    System.out.println("40kmph");
  }
}

 class MulInheritanceInterface
 {
   public static void main(String args[])
   { 
     
     Animal a = new Animal();
     a.color();
     a.speed();
   }
 }
