//Name: Lyubomir Kostov
//Date: 12.04.2016
//Project: Project 2 (HotelTest)
public class HotelTest 
{
	//the test method has bed implemented in the Hotel class as the specifications require
	public static void main(String[] args) 
	{
		//using the constructor defined in the Hotel class
		Hotel a= new Hotel("Verea", 5, new int[]{2,3,2,1,1},new String [][]
				{
				new String[]{"Single","Single"},
				new String[]{"Double","Single","Single"}, 
				new String[]{"Double","Single"}, 
				new String[]{"Single"},
				new String[]{"Double"}
				} );
		System.out.println("The maximum occupancy of the hotel is: " + a.test());
	}
}
