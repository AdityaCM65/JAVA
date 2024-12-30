import java.util.Scanner;

 // By Aditya C Mahajan

 class Assign_02
 {
   public static void main(String args[])
   { 
     Scanner s1 = new Scanner(System.in);
     
     String name,addr;
     float per;
     
    System.out.println(" Enter Your Name ");
    name = s1.next(); 
    
    System.out.println(" Enter Your Address ");
    addr = s1.next(); 
    
    System.out.println(" Enter Your Percentage ");
    per = s1.nextFloat(); 
    
    System.out.print("Name : "+name+"\t");
     
     System.out.println("Address : "+addr);
     
     System.out.println("Percentage : "+per);
    
   }
 }
