import java.util.ArrayList;
public class araylist {
  public static void main(String[] args){
  ArrayList<String> cars = new ArrayList<String>();
  cars.add("Jaguar");
  cars.add("Verna");
  cars.add("Creta");
  cars.add("Grand Vitara");
  cars.add("Hector");
  cars.add("Sonet");
  cars.set(1, "Rolls Royce");
  cars.remove(1);
  cars.add(1, "Verna");
  for(int i=0;i<cars.size();i++){
    System.out.println(cars.get(i));
  }
  System.out.println(cars.size());
  }    
}
