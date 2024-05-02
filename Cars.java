 abstract class Vehicle{
    String make;
    String Model;
    int year;
    abstract void showDetail();
}
class CAR extends Vehicle{
    CAR(String make, String Model , int year){
        this.make=make;
        this.Model=Model;
        this.year=year;
    }
    void showDetail(){
        System.out.println("make="+" "+make+"Model="+" " +Model+"year="+" "+year);
    }
}
class BIKE extends Vehicle{
    BIKE(String make, String Model , int year){
        this.make=make;
        this.Model=Model;
        this.year=year;
    }
    void showDetail(){
        System.out.println("make="+" " +make+" "+"Model="+Model+" "+"year="+year);
    }
}
public class Cars {
    public static void main(String args[]){
        Vehicle v;
        v= new CAR("Verna" , "V7",2024 );
        v.showDetail();
        v= new BIKE("Honda" , "vs7",2025 );
        v.showDetail();

    }
}
