public class Dynamic {
    public static void main(String args[]){
    A a;
    a = new B();
    a.show();
    a.display();
    
    }
}
class A{
    void show(){
        System.out.println("Show from A");
    }
    void display(){
        System.out.println("Display from A");
    }
}
class  B extends A{
    void show(){
        System.out.println("Show from B");

    }
    void display(){
        System.out.println("Display from B");
    }
    void mydisplay(){
        System.out.println("My display from B");
    }
}
class C extends A{
    void show(){
        System.out.println("Show from c");

    }
    void mydisplay(){
        System.out.println("My display from c");
    }
}
