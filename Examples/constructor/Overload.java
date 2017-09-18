// Demonstrate method overloading.
class Overload {
  void test() {
    System.out.println("No parameters");
  }

  // Overload test for one integer parameter.
  void test(int a) {
    System.out.println("a: " + a);
  }

  // Overload test for two integer parameters.
  int test(int a, int b) {
    //System.out.println("a and b: " + a + " " + b);
	return a+b;
  }

  // overload test for a double parameter
  double test(double a) {
    System.out.println("double a: " + a);
    return a*a;
  }
}
  
class OverloadDemo {
  public static void main(String args[]) {
    Overload ob = new Overload();
    double result;

    // call all versions of test()
    ob.test(); 
    ob.test(10);
	int i= ob.test(10,20);
   System.out.println( i);
    result = ob.test(123.2);
    System.out.println("Result of ob.test(123.2): " + result);
  }
}
