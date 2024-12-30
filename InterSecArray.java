import java.util.*;

 // By Aditya C Mahajan

 class InterSecArray
 {
   public static void main(String args[])
   { 
    int a[] = { 2 , 5 , 7 , 8 , 11 , 12};
    int b[] = { 11 , 12 , 4 , 8};
    
    
    for(int i = 0; i < a.length; i++){
      
      for(int j = 0; j < b.length; j++){
        
        if(a[i] == b[j]){
      
         System.out.print(" "+a[i]);
         
        }
        
      }
    }
    
   }
 }
