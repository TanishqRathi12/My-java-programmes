import java.util.Scanner;

public class reverse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        while(n>0){
            System.out.print(n%10);
            n=n/10;
        }

    }
}