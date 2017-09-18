//demo for search methods in String Class;
//JavaPoint Computers;
public class StringDemo2 {

    public static void main(String[] args) {

        String s1 = "Hyderabad";
        System.out.println
                ("length = " + s1.length()); 
        System.out.println
                ("pos 4 = " + s1.charAt(4)); 

       String s2 = "Madras";
       System.out.println(s1.equals(s2)); 
       String s3 = "madRas";
       System.out.println(s2.equals(s3)); 
       System.out.println
            (s2.equalsIgnoreCase(s3)); 

       System.out.println
            (s1.startsWith("Hyder")); 
       System.out.println
            (s2.startsWith("Hyder")); 

       System.out.println
            (s1.endsWith("bad")); 
       System.out.println
            (s2.endsWith("bad")); 

       System.out.println
            (s1 + s2); 
       System.out.println
            (s1.concat(s2)); 
    }
}

