import java.util.Scanner;

public class sumdigit {
    public static void main(String args[]){
        Scanner cs = new Scanner(System.in);
        long n=cs.nextLong();
        long temp,sum=0;
        while(n>0){
            temp=n%10;
            sum+=temp;
            n=n/10;
        }
        System.out.println(sum);
    }
}
