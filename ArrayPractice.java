import java.util.*;

//// By Aditya C Mahajan

public class ArrayStudentMarks {

  public static void main(String[] args){

     Scanner scr = new Scanner(System.in);
    float avrAllStd = 0f;
    
    System.out.println("******************** STUDENTS MARKS AVERAGE CALCULATOR ******************** ");
    
    System.out.print("\nEnter How Many Students : ");
     int nStd = scr.nextInt();

     int []marks = new int[nStd];
     String []names = new String[nStd];
     
     for(int j = 0; j < nStd; j++){
       
       System.out.print("\n Enter Name Of Student : ");
     
       names[j] = scr.next();
      
     }
     
     for(int i = 0; i < nStd; i++){
        System.out.print("\nEnter Maks Of "+names[i]+" : ");
       marks[i] = scr.nextInt();       
     } 
     
     for(int i = 0; i < nStd; i++){
       
       System.out.println("\n\n \t Name : "+names[i]+" - \t Marks : "+marks[i]);
     }
     
     for(int i = 0; i < nStd; i++){
       
     avrAllStd += marks[i]; 
       
     }
    
    avrAllStd /= nStd;
    
    System.out.println("\n\n\n ************** The Average of Sudent Marks Is : "+avrAllStd);
   System.out.println("Thanks For Comming ......    - Aditya C Mahajan"); 
    

  }
}
