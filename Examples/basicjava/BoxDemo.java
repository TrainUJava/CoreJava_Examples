class Box {
double width;
double height;
double depth;

// display volume of a box
void volume() {
	System.out.print("Volume is ");
	System.out.println(width * height * depth);
	}
}

class BoxDemo {
public static void main(String args[]) {
	Box mybox = new Box();
	// assign values to mybox's instance variables
	mybox.width = 10;
	mybox.height = 20;
	mybox.depth = 15;
	// call  volume()  of box
	mybox.volume();
	}
}
