import java.util.*;
public class Functions {
    public static int multiply(int a, int b){
        int mul=a*b;
        return mul;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mul = multiply(a,b);
        System.out.println("Multiply of a and b:"+mul);
        sc.close();
    }

    


}
