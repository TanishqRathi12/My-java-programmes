import java.util.Scanner;

public class countno {
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     long n, temp,sum=0;
     n=sc.nextLong();
     while(n>0){
      n=n/10;  
      sum++;
     }
     System.out.println(sum);
    }
 }

