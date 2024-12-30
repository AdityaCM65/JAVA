import java.util.Scanner;

 // By Aditya C Mahajan

 class Assign_14
 {
   public static void main(String args[])
   {
     Scanner scr = new Scanner(System.in);
     System.out.println("Enter a Number : ");
     int num = scr.nextInt();
    int res = 1; 
  for(int i = 1; i <= num; i++){
    
    
    res = i * i;
    
    if(res == num){
      
      
     System.out.println("Square root of : "+num+" is : "+i);
      
      break;
    }
    
    if(res > num){
      
      
     System.out.println("Not a perfect integer aquare root of : "+num);
      
      break;
      
    }
    
    
    
  }
 
 
   }
 }
