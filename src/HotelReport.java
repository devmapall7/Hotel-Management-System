//Name: Lyubomir Kostov
//Date: 12.04.2016
//Project: Project 2 (HotelReport)
public class HotelReport 
{
	//printing using the toString method defined in the Hotel class
	public static void report(Hotel a)
	{
		System.out.println(a);
	}
	// main used only to test if it works
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
		report(a);
	}
}
