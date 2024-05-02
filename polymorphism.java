class Student{                                    //Funtion Overloading  or Compile time polymorphism
    String name;
    int age;
public void printinfo(String name){
      System.out.println(name);
}
public void printinfo(int age){
    System.out.println(age);
}
public void printinfo(String name, int age){
    System.out.println(name+" "+age);
}
}
public class polymorphism {
    public static void main(String args[]){
        Student s = new Student();
        s.name = "Tanishq Rathi";
        s.age = 19;
        s.printinfo(s.name,s.age);
            }
}
