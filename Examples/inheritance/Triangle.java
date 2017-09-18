//Inheritance Demo
class Rectangle{
public double dim1, dim2;
Rectangle( double x, double y){
dim1 = x;
dim2 = y;
}
public double getArea(){
return dim1*dim2;
}
};

class Square extends Rectangle{

Square( double l, double s){
super (l,s);
}
public double getArea(){
return dim1*dim2;
}
};

class Triangle extends Rectangle{
Triangle( double x, double y){
super(x,y);
}
public double getArea(){
return (dim1*dim2)/2;
}

public static void main( String[] args){
Triangle t = new Triangle(12,20);
Rectangle r = new Triangle(11,22);
Square s = new Square( 10,10);
Rectangle rr;
rr = t;


System.out.println(" The Area of the Triangle  = " + rr.getArea());
rr = s;
System.out.println(" The Area of the square  = " + rr.getArea());
}
};
