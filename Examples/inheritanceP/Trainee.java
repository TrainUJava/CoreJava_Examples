public class Trainee extends Employee
{
	private double cgpa;

	public Trainee()
	{
		System.out.println("Trainee :inside the constructor");
	}
	public Trainee(String name,double age,int id,double cgpa)
	{
		super(name,age,id);
		this.cgpa=cgpa;
	}
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("CGPA  : "+cgpa);
	}
};