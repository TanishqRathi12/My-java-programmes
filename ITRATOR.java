import java.util.ArrayList;
import java.util.Iterator;
public class ITRATOR {
    public static void main(String args[]){
        ArrayList<String> chips = new ArrayList<String>();
        chips.add("Lays");
        chips.add("Uncle Chips");
        chips.add("kurkure");
        chips.add("TakaTak");
        chips.add("Bingo");

        Iterator<String> it = chips.iterator();
        while(it.hasNext()){
        System.out.println(it.next());
        }
    }
}
