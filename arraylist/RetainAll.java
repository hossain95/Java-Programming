package arraylist;

import java.util.ArrayList;

public class RetainAll
{
	public static void main(String[] args)
	{
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Tipu"); arr.add("Asif"); arr.add("Rahim"); arr.add("Karim"); arr.add("Suman");
		arr.add("Rupa"); arr.add("Tipu");
		
		ArrayList<String> arr2 = new ArrayList<String>();
		arr2.add("Suman"); arr2.add("Latif"); arr2.add("Tipu");
		
		//retain keeping all the elements to match each other
		
		arr.retainAll(arr2);
		System.out.println("All the match elements: "+ arr);
	}
}


/*
All the match elements: [Tipu, Suman, Tipu]
 */
/*
 * retainAll(second ArrayList) // keep all the match elements
 */