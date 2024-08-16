class Student 
{
	public String name;
	public Student(String name)
	{
		this.name=name;
	}
	public void study()
	{
		System.out.println("study daily");
	}
	public void prepare()
	{
		System.out.println("prepare for exam");
	}
	public void perform()
	{
		System.out.println("perform well");
	}
}
class Mainclass1
{
	public static void display(Student student)
		{
			student.study();
			student.prepare();
			student.perform();
		}
        public static void main(String[] args)
		{
			display(new Student("raja"));
			display(new Student("suresh"));
			display(new Student("vijay"));
	    }
}
