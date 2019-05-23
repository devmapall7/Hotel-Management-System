//Name: Lyubomir Kostov
//Date: 12.03.2016
//Project: Project 2 (Room)
public class Room 
{
	private int bedCount;
	private Bed [] beds;
	private boolean vacant;
	public int getBedCount()
	{
		return bedCount;
	}
	public void setBedCount(int bedCount) 
	{
		this.bedCount = bedCount;
	}
	public Bed[] getBeds()
	{
		return beds;
	}
	public void setBeds(Bed[] beds)
	{
		this.beds = beds;
	}
	public boolean getVacant()
	{
		return vacant;
	}
	public void setVacant(boolean vacant)
	{
		this.vacant=vacant;
	}
	//room constructor that requires an int for the bedCount and a string array for the names of the beds
	public Room (int bedCount, String [] beds, boolean vacant)
	{
		setBedCount(bedCount);
		this.beds= new Bed [this.bedCount];
		for (int i=0;i<this.bedCount;i++) this.beds[i]=new Bed(beds[i]);
		this.vacant=vacant;
	}
	public String toString()
	{
		String a;
		if (bedCount==1) a=String.format("room has: %d bed. ", bedCount);
		else a=String.format("room has: %d beds. ", bedCount);
		for (int i=0;i<bedCount;i++) 
		{
			a+= "\n" + "The " + (i+1) + " " + beds[i].toString();
		}
		return a;
	}
}
