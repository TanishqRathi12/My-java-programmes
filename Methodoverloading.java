public class Methodoverloading {
    public int add(int a , int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public String Concatenate(String m , String n ){
        return m+n;
    }
    public static void main(String args[]){
        Methodoverloading abs = new  Methodoverloading();
        int r1 = abs.add(5,10);
        int r2 = abs.add(5,10,15);
        String  r3 = abs.Concatenate("Hello","World!");
        System.out.println("Result"+r1);
        System.out.println("Result"+r2);
        System.out.println("Result"+r3);
    }
}
