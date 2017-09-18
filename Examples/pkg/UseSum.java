import com.example.Sum;

class UseSum
{
	public static void main(String[] args) 
	{
		//create an object of Sum class
		Sum s = new Sum(4,5);

		//display the sum by calling the method getSum()
		System.out.println("The sum = "+s.getSum());
	}
}
