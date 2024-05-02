import java.util.Scanner;
class Leetcode1 {
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        n =sc.nextInt();
        int[]array = new int[2];
        for(int i=0;i<n;i++){
        array[i] = sc.nextInt();
        } 
        for(int i=0;i<n;i++){
        System.out.println(array[i]);
        }
    }
}