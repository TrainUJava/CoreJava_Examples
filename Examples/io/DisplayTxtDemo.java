import java.io.*;

class DisplayTxtDemo{
public static void main( String[] args) throws Exception{
FileInputStream fis = new FileInputStream("abc.txt");
FileOutputStream fos = new FileOutputStream("xyz.txt");
int i;

while((i=fis.read())!=-1){
	fos.write(i);
char c = (char)i;
System.out.print(c);
}
fis.close();
fos.close();
}
};
