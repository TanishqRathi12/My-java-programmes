import java.util.HashMap;
public abstract class Hashmap {
    public static void main(String args[]){
        HashMap<String , String> Stream = new HashMap<String , String>();
           Stream.put("Tanishq","AI&ML");
           Stream.put("Sahas","Agriculture");
           Stream.put("Deepika","Cyber Security");
           Stream.put("Siddharth vats","CSE"); 
            // System.out.println(Stream.get("Sahas"));
           // Stream.remove("Deepika");
          // Stream.clear();
          // System.out.println(Stream);
           //System.out.println(Stream.size());
           //for(String i : Stream.values()){
             //System.out.println(i);
           //}
          for(String i : Stream.keySet()){
             System.out.println("Keys: " + i + "             Values: " + Stream.get(i));
          }
    }
}
