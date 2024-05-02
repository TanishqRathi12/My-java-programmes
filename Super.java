class N{
    int a;
    N(int a){
        this.a=a;
    }
     void show(){
            System.out.println("a="+a);
    }
     void display(){
            System.out.println("Hello");
   }
    
}
public class Super extends N {
    Super(int a){
        super(a);
    }
    void display(){
        super.show();
        super.display();
        super.a=50;
        super.show();
    }
    public static void main(String args[]){
       
      Super ob = new Super(10);
      ob.display();
    }
}
