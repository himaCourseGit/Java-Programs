class Author 
{
	public String name;
	public String title;
	public int pages;
	public Author(String name,String title,int pages)
	{
		this.name=name;
		this.title=title;
		this.pages=pages;
	}
	public void name()
	{
		System.out.println("author name:"+name);
	}
	public void title()
	{
		System.out.println("poetry title:"+title);
	}
	public void pages()
	{
		System.out.println("poetry pages:"+pages);
	}} class Mainclass2
	{
	public static void display(Author author)
{
	author.name();
	author.title();
	author.pages();
}
	public static void main(String[] args) 
	{
		display(new Author("amish","sita",230));
		display(new Author("kevin","kalki",190));
		display(new Author("gupta","the hidden hindu",210));
	}
}
