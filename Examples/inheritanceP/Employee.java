public class Employee extends Person
{
	private int id;

	public Employee()
	{
		System.out.println("Employee :inside the constructor");
	}
	public Employee(String name,double age,int id)
	{
		super(name,age);
		this.id=id;
	}
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("id  : "+id);
	}
};