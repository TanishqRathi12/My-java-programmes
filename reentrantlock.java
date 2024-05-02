import java.util.concurrent.locks.ReentrantLock;
class Table{
   ReentrantLock r;
   Table(ReentrantLock r){
       this.r=r;
   }
   
    public void printTable(int n){
        r.lock();
        for(int i=1;i<=10;i++)
        {
            try{
                Thread.sleep(5);
            }
            catch(Exception e){
               
            }
             System.out.println(n*i);
        }
        r.unlock();
        
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
public class reentrantLock {
    public static void main(String args[]){
   ReentrantLock r = new ReentrantLock();
    Table t = new Table(r);
    A a = new A(t);
    B b = new B(t);
    a.start();
    b.start();
    }

}

