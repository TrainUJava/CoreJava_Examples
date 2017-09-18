class Box {
double length = 30, breadth = 20,height = 20;
Box( double l, double b, double h){
length = l;
breadth = b;
height = h;
}
Box(double l){
length = l;
breadth = l;
height = l;
}
public double getVol(){
return length*breadth*height;
}
};