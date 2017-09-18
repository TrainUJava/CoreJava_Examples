//package abc;

import java.io.*; 

public class RandomAccessDemo1 {

    private String fileName;

    private RandomAccessFile raf;

    public static void main(String[] args) 
           throws IOException { 

        RandomAccessDemo1 pqr
            = new RandomAccessDemo1();

        if (args.length > 0) {

            pqr.fileName = args[0];
        }
        else {

            System.out.println
                 ("missing file name");

            return;
        }

        try {

            pqr.process();
        }
        catch (FileNotFoundException e) {

            System.out.println
                 ("File not found: " 
                   + args[0] );
            return;
         }            
        catch (Exception e) {

            System.out.println
                 ("some error occurred");
            System.out.println
                 ( e.getMessage() );
            e.printStackTrace();
            return;
        }
    }

    public void process()
         throws Exception {

        raf = new RandomAccessFile
                          (fileName, "r");

        print(40);
        print(20);
        print(30);
        print(10);
        print(50);
        print(0);

        raf.close();
    }

    public void print(int n)
         throws Exception {

        System.out.println
              ("\n\n\n printing from "
                + n + " \n\n\n");

        raf.seek(n);

        int x;

        while ( ( x = raf.read() ) != -1 ) {

            System.out.print( (char)(x) );
        }

        System.out.println
             ("\n\n reached end of file \n\n");
    }
}
