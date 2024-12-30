

public class FinalizeMethod
{  
public static void main(String[] args)  
{  
FinalizeMethod de = new FinalizeMethod();  
de.finalize();  

de = null;  
 
//System.gc();  

System.out.println("Inside the main() method");  
}  
protected void finalize()  
{  
System.out.println("Object is destroyed by the Garbage Collector");  
}  
}