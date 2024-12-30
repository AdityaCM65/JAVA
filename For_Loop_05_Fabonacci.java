import java.util.Scanner;

 // By Aditya C Mahajan

 class For_Loop_05_Fabonacci
 {
   public static void main(String args[])
   { 
     
     Scanner scr = new Scanner(System.in);
     
     
    System.out.println("Enter Term");
    int num = scr.nextInt();
    int fnum = 0,snum = 1;
    
    System.out.print(fnum+" ");
    System.out.print(snum+" ");
    
    for(int i = 0; i < num-2; i++){
      
      int result = fnum + snum;
      
      System.out.print(result+" ");
      
      
      
      fnum = snum;       ///  fnum = 1
       snum = result;    /// snum = 1
      
      
    }
    
   }
 }
