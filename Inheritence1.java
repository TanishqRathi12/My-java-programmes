 class shape{                               //Single Level Inheritence
    public void area(){
        System.out.println("Display Area");
    }

 }
 class Triangle extends shape{
    public void area(int l,int b){
        System.out.println(1/2*l*b);
    }

 }
 public class Inheritence1 {
    public static void main(String args[]){
    Triangle t1 = new Triangle();
    
    }
}
