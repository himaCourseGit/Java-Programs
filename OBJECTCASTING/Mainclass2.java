class Shyamsinghroy 
{
	public void Writer()
	{
		System.out.println("He is a writer");
	}
}
class Goutham extends Shyamsinghroy
{
	public void director()
	{
		System.out.println("Directs a movie");
	}
}
class Mainclass2
{		
	public static void main(String[] args) 
	{
		Shyamsinghroy shyamsinghroy =(Shyamsinghroy)new Goutham();
		shyamsinghroy.Writer();
		Goutham goutham=(Goutham)shyamsinghroy;
		goutham.Writer();
		goutham.director();
	}
}
