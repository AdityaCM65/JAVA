import java.util.*;

 // By Aditya C Mahajan

// ********** MULTIPLE INHERITANCE ********
  
// Declare SuperClass Employee
class Employee
{
  // Data Member Salary Of The Employee
  float salary = 40000f;
}
// Declare SubClass 
class Developer extends Employee
{
  // Data Member Bonas Of The Developer
  float bonas = 10000f;
}

// Declare Main Class 
 class MulInheritance
 {
   public static void main(String args[])
   { 
     
     // Creating Object Of Developer Class d1
     Developer d1 = new Developer();
    
    // Print Salary Of The Developer
    System.out.println("Developer Salary Is : "+d1.salary);
    
    // Print Bonas Of The Developer
    System.out.println("Developer Bonas Is : "+d1.bonas);
   }
 }
