import java.util.*;

 // By Aditya C Mahajan

class Demo{
  
  int rollNum;
  int pinCode;
  String name;
  String div;
  String std;
  String clgName;
  String add;

// value read function
void read(){
  rollNum = 39;
  pinCode = 425405;
  name = "Mahajan Aditya Chandrakant";
  div = "A";
  std ="SYBCA";
  clgName = "R.C.Patel IMRD Shirpur";
 add = "Ramsingh Nagar Shirpur"; 
  
}

// values show function
void show(){
  System.out.println("Name  :\t \t"+name);
   System.out.println("College  :  \t"+clgName);
    System.out.println("Standard  : \t"+std);
     System.out.println("Division : \t"+div);
      System.out.println("Roll Number :\t "+rollNum);
       System.out.println("Address : \t"+add);
        System.out.println(" Pincode : \t"+pinCode);
  
}

} 



 class Assign_21
 {
   public static void main(String args[])
   { 
    
    Demo dm = new Demo();
    
    dm.read();
    dm.show();
    
    
    
   }
 }
