class SpiderMan 
{
	public void SuperPower()
	{
		System.out.println("Super Powers");
	}
}
class Peter extends SpiderMan
{
	public void StudyAndResearch()
	{
      System.out.println("Study and research");
	}
}
class Mainclass1
{
public static void main(String[] args) 
	{
	SpiderMan spiderman = (SpiderMan)new Peter();
	spiderman.SuperPower();
	Peter peter=(Peter) spiderman;
	peter.SuperPower();
	peter.StudyAndResearch();
	}
}
