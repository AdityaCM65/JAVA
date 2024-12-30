import java.util.Scanner;

 // By Aditya C Mahajan

 class Marks_Calculator
 {
   public static void main(String args[])
   { 
     
     System.out.println("*********** MARKS CALCULATOR ********");
    
     Scanner sc = new Scanner(System.in);
    
    System.out.print(" Enter Your Chemistry Marks : ");
    int a = sc.nextInt();
    
    System.out.print(" Enter Your Physics Marks : ");
    int b = sc.nextInt();
   
   
    System.out.print(" Enter Your Biology Marks : ");
    int c = sc.nextInt();
   
   
    System.out.print(" Enter Your English Marks : ");
    int d = sc.nextInt();
   
   
    System.out.print(" Enter Your Computer Marks : ");
    int e = sc.nextInt();
    
    
    float total = ((a+b+c+d+e)/5f);
    
    if(total>=36){
      System.out.println(" Your Percentage are : "+total+"% And You Are PASS!!!");
    }
    
    
    else{
      System.out.println(" Your Percentage are : "+total+"% And You Are FAIL!!!");
    }
    
    
  
   }
 }
