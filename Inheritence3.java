class shape{                                  //Heirarchy Level Inheritence
    public void area(){
        System.out.println("Display Area");
    }

 }
 class Triangle extends shape{
    public void area(int l,int b){
        System.out.println(1/2*l*b);
    }
class Equilateraltriangle extends Triangle{
    public void area(int l, int b){
        System.out.println(1/2*l*b);
    }
    class circle extends shape{
        public void area(int r){
        System.out.println(3.14*r*r);
        }
    }

}

 }
 public class Inheritence3 {
    public static void main(String args[]){
    Triangle t1 = new Triangle();
 }
}
