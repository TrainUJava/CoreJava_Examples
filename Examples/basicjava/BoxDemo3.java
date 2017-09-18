// This program uses a constructor.
class Box {
	double width;
	double height;
	double depth;
// def of constructor
	Box() {
	width = 10;
	height =10;
	depth =10;
	}

		// compute and return volume
		double volume() {
			return (width * height * depth);
			}
	}

class BoxDemo3 {
	public static void main(String args[]) {
	// declare, allocate, and initialize Box objects
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		double vol;
	// get volume of first box
	vol = mybox1.volume();
	System.out.println("Volume is " + vol);
	// get volume of second box
	vol = mybox2.volume();
	System.out.println("Volume is " + vol);
	}
}
