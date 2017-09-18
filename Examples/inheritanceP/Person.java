public class Person
{
	private String name;
	private double age;

	public Person()
	{
		System.out.println("Person :inside the constructor");
	}
	public Person(String name,double age)
	{
		this.name=name;
		this.age=age;
	}
	public void displayDetails()
	{
		System.out.println("Name : "+name);
		System.out.println("Age  : "+age);
	}
};