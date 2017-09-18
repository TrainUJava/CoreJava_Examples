//StringTokenizer Demo
//JavaPoint Computers;
import java.util.*;
class STDemo1{
public static void main(String[] args){

String s = "Author = javaPoint;"+ "Place = Ameerpet;"+"Faculty = Raju;";

StringTokenizer st = new StringTokenizer( s, "=;");

while(st.hasMoreTokens()){
	String str = st.nextToken();
	String val = st.nextToken();
System.out.println(str+'\t'+val);
}
}
}

