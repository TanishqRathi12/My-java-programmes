class B{
    {
        System.out.println("Instance initialization of Block B");
    }
    static{
        System.out.println("Static keyword of Class B");
    }
}
class A{
    static{
        System.out.println("Static Block of class A");
    }
    int a;
    A(){
        System.out.println("Constructor From A");
    }
    {
        a=20;
        System.out.println("a="+a);
    }
}

public class Static {
    {
        System.out.println("Main Class Instance block");
    }
    static{
        System.out.println("Static block of main class");
    }
    public static void main(String[]args){
    B b = new B();
    Static m = new Static();
    A a =new A(); 
    
    
    }
}
