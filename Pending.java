import java.util.ArrayList;
import java.util.Scanner;

public class Pending{

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       ArrayList<ArrayList<Integer>> Mainelist = new ArrayList<>();
       for(int i=0;i<t;i++){
           int m = sc.nextInt();
           ArrayList<Integer> List = new ArrayList<>();
           for(int j=0;j<m;j++){
               int n = sc.nextInt();
               List.add(n);
            }    
           Mainelist.add(List);
       }
       int l = sc.nextInt();
       for(int k=0;k<l;k++){
           int row=sc.nextInt();
           int col=sc.nextInt();
           try
           {
               System.out.println(Mainelist.get(row-1).get(col-1));
           }
           catch(Exception e)
           {
               System.out.println("ERROR!");
            }
        }
       sc.close();
    }
}
