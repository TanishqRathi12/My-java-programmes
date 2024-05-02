abstract class employ{
    String make;
    String Model;
    int year;
    abstract void showDetail();
}
class MAnager extends employ{
    MAnager(String make, String Model , int year){
        this.make=make;
        this.Model=Model;
        this.year=year;
    }
    void showDetail(){
        System.out.println("Manager car="+" "+make+"Model="+" " +Model+"year="+" "+year);
    }
}
class Technician extends employ{
    Technician(String make, String Model , int year){
        this.make=make;
        this.Model=Model;
        this.year=year;
    }
    void showDetail(){
        System.out.println("Technician Car="+" "+make+"Model="+" " +Model+"year="+" "+year);
    }
}
class Engineer extends employ{
    Engineer(String make, String Model , int year){
        this.make=make;
        this.Model=Model;
        this.year=year;
    }
    void showDetail(){
        System.out.println("Enigineer Car=" +make+" "+"Model="+" "+Model+" "+"year="+year);
    }
}
public class Employz {
    public static void main(String args[]){
        employ v;
        v= new MAnager("Verna" , "V7",2024 );
        v.showDetail();
        v= new Technician("Honda" , "vs7",2025 );
        v.showDetail();
        v= new Engineer("Suzuki" , "vs7",2025 );
        v.showDetail();
    }
}