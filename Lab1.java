
class A{
    void show(){
       System.out.println("Hello World");
    }
    void show(int a){
       System.out.println(a);
    }
    void show(int a,int b){
       int c= a+b;
       System.out.println(c);
    }
   }
public class Lab1 {
    public static void main(String args[]){
        A ob = new A();
        ob.show();
        ob.show(10);
        ob.show(10,20);
    }
}



