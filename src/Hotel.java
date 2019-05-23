//Name: Lyubomir Kostov
//Date: 12.03.2016
//Project: Project 2 (Hotel)
public class Hotel 
{
	private String name;
	private Room [] rooms;
	private boolean hasVacancies;
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public Room[] getRooms() 
	{
		return rooms;
	}
	public void setRooms(Room[] rooms) 
	{
		this.rooms = rooms;
	}
	//full constructor using parameters to create a hotel from "nothing"
	public Hotel(String name, int roomCount, int [] bedCount, String [][] beds)
	{
		
		this.name=name;
		this.rooms = new Room[roomCount];
		for(int i=0;i<roomCount;i++)
		{
			this.rooms[i]=new Room(bedCount[i], beds[i], true); // we assume rooms are vacant
		}
		this.setVacancy();
	}
	//constructor using a name and array of rooms to create a hotel
	public Hotel(String name, Room[] rooms)
	{
		this.name=name;
		this.rooms=rooms;
		this.setVacancy();
	}
	public String toString()
	{
		String a = String.format("The name of the hotel is: %s%n", name);
		a+="It has " + rooms.length + " rooms.";
		for (int i=0;i<rooms.length;i++) 
		{
			a+= "\n" + "The " + (i+1) + " " + rooms[i].toString();
		}
		if (hasVacancies) a+= "\n" +"The hotel has vacancies!";
		else a+= "\n" + "The hotel has no vacancies!";
		return a;
	}
	//the method for the HotelTest class
	public int test()
	{
		int maxOccupancy=0;
		for (int i=0;i<getRooms().length;i++)
		{
			for (int j=0;j<getRooms()[i].getBedCount();j++)
			{
				if (getRooms()[i].getBeds()[j].getSize()=="Single" || getRooms()[i].getBeds()[j].getSize()=="single") maxOccupancy+=1;
				else maxOccupancy+=2;
			}
		}
		return maxOccupancy;
	}
	// we set the hasVacant property to false at the start because if there is no vacant room then the property won't change
	// if there is a vacant room then the property will change to true and we will exit the loop and the method
	private void setVacancy()
	{
		hasVacancies=false;
		for (int i=0;i<rooms.length;i++)
		{
			if (rooms[i].getVacant()) 
			{
				this.hasVacancies=true;
				break;
			}
		}
	}
	public boolean getHasVacancies()
	{
		return hasVacancies;
	}
}
