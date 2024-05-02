class circle{
    double x,y;
    double r;
    circle(double a,double b,double c){
        x=a;
        y=b;
        r=c;
    }
    circle(double c){
        x=0;
        y=0;
        r=c;
    }
    circle(circle c){
        x=c.x;
        y=c.y;
        r=c.r;
    }
    circle(){
        x=0.0;
        y=0.0;
        r=1.0;
    }
    double circumfrence(){
        return 2*3.14159*r;
    }
    double area(){
        return 3.14159*r*r;
    }
}
public class Constructoroverloading {
    public static void main(String []args){
        circle c1 = new circle(3.0,4.0,5.0);
        circle c2 = new circle(5.0);
        circle c3 = new circle(c1);
        circle c4 = new circle() ;
       System.out.println("circumfrence="+c1.circumfrence());
       System.out.println("area"+c1.area());
       System.out.println("circumfrence="+c2.circumfrence());
       System.out.println("area"+c2.area());
       System.out.println("circumfrence="+c3.circumfrence());
       System.out.println("area"+c3.area());
       System.out.println("circumfrence="+c4.circumfrence());
       System.out.println("area"+c4.area());
    }
}
