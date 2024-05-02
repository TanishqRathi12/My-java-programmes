class Stringbuilder {
    public static void main(String[] args)
    {
 
        // create a StringBuilder object
        // with a String pass as parameter
        StringBuilder str
            = new StringBuilder("Tanishq");
 
        // print string
        System.out.println("String = "
                           + str.toString());
 
        // reverse the string
        StringBuilder rr = str.reverse();
 
        // print string
        System.out.println("Reverse String = "
                           + rr.toString());
    }
}
