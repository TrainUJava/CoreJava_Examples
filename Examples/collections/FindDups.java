import java.util.*;

public class FindDups {
    public static void main(String[] args) {
        Set<String> s = new HashSet<String>();
        for (String a : args)
            if (!s.add(a))
                System.out.println("Duplicate detected: " + a);

        System.out.println(s.size() + " distinct words: " + s);
    }
}

Now run the program. 
java FindDups i came i saw i left

The following output is produced. 
Duplicate detected: i
Duplicate detected: i
4 distinct words: [i, left, saw, came]

