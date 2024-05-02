import java.util.Scanner;

public class palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n,m,temp;
        int sum=0;
        n=sc.nextInt();
        temp=n;
        while (n>0) {
            m=n%10;
            sum=(sum*10)+m;
            n=n/10;
        }
        if(temp==sum){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

    }
}
