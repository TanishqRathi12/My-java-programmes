import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Dateformat {
    public static void main(String []args){
        LocalDateTime obj1 = LocalDateTime.now();
        System.out.println("before Formatting: "+obj1);
        DateTimeFormatter obj2 = DateTimeFormatter.ofPattern("ddE-MMM MM-yyyy  hh-mm-ss");
        String FM =obj1.format(obj2);
        System.out.println("After Formaatting: "+FM);
    } 
}
