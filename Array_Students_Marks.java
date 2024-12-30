import java.util.Scanner;

 // Aditya C Mahajan

 class Array_Students_Marks
 {
   public static void main(String args[])
   { 
     ////  how many students get from user and enter each student marks and display average of students
     
     Scanner scr = new Scanner(System.in);   ///  creating object of scanner class
   
    System.out.println("Enter how many students");  // print statement
   
   
    int num = scr.nextInt();  /// get user input how many students
      int averageMarks =  0;   /// this is variable declare and 0 value is store this is for store student average
    
    int [] marks = new int[num];  //  creating array with name marks for storing student marks
    for(int i = 0; i < num; i++){   // this is loop for initializing value in array 
     
     System.out.print(" Enter Marks : ");   /// print statement
      marks[i] = scr.nextInt();   // when loop in i position then user enter statement execute
      
    }  /// ending of for loop
  
  for(int i = 0; i < num; i++){   // this is loop for average of students calculate in array 
     
      
      averageMarks = averageMarks + marks[i]/num;  // calculating average of students
      
      
    } 
    System.out.println(" The Average of "+num+" Students is : "+averageMarks);  /// print statement
  
  
  
  
   }
 }
