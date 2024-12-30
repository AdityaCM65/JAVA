import java.lang.Thread;

 // By Aditya C Mahajan


class MyThread1 extends Thread {
  @Override 
public void run() {
    int i = 0;
    while(i < 400) {
    System.out.println(" Cooking ");
    i++;
    }
  }
}



class MyThread2 extends Thread {
  @Override
  public void run() {
    int i = 0;
    while(i < 400) {
    System.out.println(" Coding ");
    i++;
    }
  }
}



 class MultiThread {
   public static void main(String args[]) { 
     
   MyThread1 t1 = new MyThread1();
   MyThread2 t2 = new MyThread2();
  t1.start();
   t2.start();
   }
 }
