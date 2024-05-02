import java.util.LinkedList;
public class Linklist {
    public static void main(String argsp[]){
    LinkedList<String> color = new LinkedList<String>();
    color.add("Red");
    color.add("Green");
    color.add("Yellow");
    color.add("Orange");
    color.addFirst("Black");
    System.out.println(color);
    System.out.println(color.size());
}
}
