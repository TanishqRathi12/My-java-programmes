class Table{
    synchronized public void printTable(int n){
         for(int i=1;i<=10;i++)
         {
             try{
                 Thread.sleep(500);
             }
             catch(Exception e){
                
             }
              System.out.println(n*i);
         }
         
     }
 }
 class A extends Thread{
     Table t;
     A(Table t){
         this.t=t;
     }
     public void run(){
         t.printTable(5);
     }
 }
 class B extends Thread{
     Table t;
     B(Table t){
         this.t=t;
     }
     public void run(){
         t.printTable(6);
     }
 }
 public class tablz {
     public static void main(String args[]){
     Table t = new Table();
     A a = new A(t);
     B b = new B(t);
     a.start();
     b.start();
     }
 
 }
 
 