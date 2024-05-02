class pen{
    String color;
    String Type;

public void write(){
    System.out.println("Write Something");
}
    public void printcolor(){
        System.out.println(this.color);
    }
    public void printType(){
        System.out.println(this.Type);
    }

}
class Student{
    String name;
    int age;
public void printinfo(){
System.out.println(this.name);
System.out.println(this.age);
}
//Student(){
  //  System.out.println("Hello");     1-Method
    //}
    Student(String name, int age){
     this.name= name;                //2-Method
     this.age=age;
    }
}
//public class OOPs {
   // public static void main(String args[]){
   // pen pen1 = new pen();
   // pen1.color="Blue";
   // pen1.Type="Ball";
   // pen pen2 = new pen();
   // pen2.color ="Black";
   // pen2.Type="gel";
   // pen1.printcolor();
   // pen2.printcolor();
   // pen1.printType();
   // pen2.printType();
   // }

//}

public class OOPs{
    public static void main(String args[]){
Cars s1 = new Cars("Tanishq Rathi", 19);
//s1.name = "Tanishq Rathi";
//s1.age = 19;
s1.printinfo();
    }
}
