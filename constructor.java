class A{
    int a,b;
    A()
    {
     a=5;
     b=4;
    }
    A(int a)
    {
     this.a=a;
     b=3;
    }
    A(int a, int b)
    {
     this.a=a;
     this.b=b;
    }
    A(A ob){
     a=ob.a;
     b=ob.b;
    }
    void show()
    {
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
   
public class constructor {
    public static void main(String args[]){
        A a1 = new A();
        A a2 = new A(10);
        A a3 = new A(20,30);
        A a4 = new A(a1);
        a1.show();
        a2.show();
        a3.show();
        a4.show();
    }
}
