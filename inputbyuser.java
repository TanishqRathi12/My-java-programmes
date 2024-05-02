import java.util.Scanner;
public class inputbyuser {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the 1st Value:");
        int a = sc.nextInt();
        System.out.println("Ener the 2nd Value:");
        int b = sc.nextInt();
        System.out.println("Your Sum is:");
        int sum = a+b;
        System.out.println(sum);
    
    sc.close();
    }
    
}
