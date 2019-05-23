//Name: Lyubomir Kostov
//Date: 12.04.2016
//Project: Project 2 (HotelConfigure)
import java.util.Scanner;
public class HotelConfigure 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the name of the hotel?");
		String hotelName=keyboard.nextLine();		
		System.out.println("How many rooms would you like?");
		int roomCount=keyboard.nextInt(); // variable to store the number of rooms
		if (roomCount<1) throw new IllegalArgumentException("You need to have at least 1 room in a hotel.");
		Hotel testHotel; // the hotel object we create with HotelConfigure
		Room [] testRooms=new Room[roomCount]; // used to create the rooms of the hotel
		for (int i=0;i<testRooms.length;i++) //creating the room array
		{
			System.out.println("How many beds would you like room " + (i+1) + " to have?");
			int bedCount=keyboard.nextInt(); //used to store the bed count
			if (bedCount<1) throw new IllegalArgumentException("You need to have at least 1 bed in a room.");
			String [] beds= new String [bedCount]; // used to store the bed sizes
			for (int j=0;j<bedCount;j++)
			{
				System.out.println("What is the size of the " + (j+1) + " bed? (single or souble)");
				beds[j]=keyboard.next();
				if (!beds[j].toLowerCase().equals("single") && !beds[j].toLowerCase().equals("double")) throw new IllegalArgumentException("Rooms can only be single or double.");
			}
			System.out.println("Is the room vacant? (yes or no)");
			String vacant=keyboard.next().toLowerCase(); // used to determine if a room is vacant or not
			if (vacant.equals("yes")) testRooms[i]=new Room(bedCount, beds, true);
			else if (vacant.equals("no")) testRooms[i]=new Room(bedCount, beds, false);
			else throw new IllegalArgumentException("Incorrect input! Your answer should have been yes or no!");
		}
		testHotel=new Hotel(hotelName,testRooms);
		System.out.println(testHotel);
	}
}
