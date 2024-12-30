import java.util.Scanner;

 // Compiler version JDK 11.0.2

 class Assign_User_Inp_01
 {
   public static void main(String args[])
   { 
     
     Scanner s1 = new Scanner(System.in);
     
    
     System.out.print("Enter Value Of A :");
      int a = s1.nextInt();
     System.out.print("Enter Value Of B :");
   int b = s1.nextInt();
   
     if(a>b){
       
       System.out.println("A Is Greater Than B , A : " +a);
     }
     else{
    System.out.println("B Is Greater Than A, B : "+b);
    }
   }
 }
