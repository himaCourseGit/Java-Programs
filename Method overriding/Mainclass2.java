class Employee 
{
	public void work()
	{
		System.out.println("works for 10 hours");
	}
}
class Manager extends Employee
{
public void work()
	{
	System.out.println("works for 12 hours");
}
}
class Mainclass2
{
	public static void main(String[] args) 
	{
	 Employee employee=(Employee)new Manager();
	 employee.work();
	}
}
