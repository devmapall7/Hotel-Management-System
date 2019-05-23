//Name: Lyubomir Kostov
//Date: 12.03.2016
//Project: Project 2 (Bed)
public class Bed 
{
	//size stored as String either Single or Double
	private String size;
	public String getSize() 
	{
		return size;
	}
	public void setSize(String size) 
	{
		this.size = size;
	}
	public Bed(String size)
	{
		setSize(size);
	}
	public String toString()
	{
		return String.format("bed is: %s",size);
	}
}
