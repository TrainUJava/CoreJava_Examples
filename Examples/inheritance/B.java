class A {
int i= 10;
int j =20;
public void add(){
System.out.println(" The sum of i and j is .." + (i+j));

}
};

class B extends A {
public void show(){
System.out.println(" This is class B");
}

public static void main( String[] args){
B b = new B();
b.add();
b.show();
}
}; 