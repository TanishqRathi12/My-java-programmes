class A extends threadzz{
    public void run(){
        
        System.out.println("1st Thread is Running");
        System.out.println("!st is Complete");
    
    }
}
class B extends threadzz{
    public void run(){
        
        System.out.println("2nd Thread is Running");
        System.out.println("2nd is Complete");
        
    }
}
public class notworkinginvs  {
    public static void main(String []args){
        A t1 = new A();
        B t2 = new B();
        t1.start();
        t2.start();
    }
}
