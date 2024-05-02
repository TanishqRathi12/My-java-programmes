
import java.util.Scanner;

public class ifelse {
    public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter Your Age:");
     int age = sc.nextInt();
     if(age>17){
        System.out.println("Adult");
     }
     else{
        System.out.println("Not Adult");
     }
     sc.close();
    
    }
    
}
