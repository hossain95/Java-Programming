package arraylist;
import java.util.ArrayList;
public class Remove_RemoveAll_Clear
{
	public static void main(String[] args)
	{
		//add method
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Tipu"); arr.add("Asif"); arr.add("Rahim"); arr.add("Karim"); arr.add("Suman");
		arr.add("Rupa"); arr.add("Tipu");
		
		System.out.println("Before removing element: "+ arr);
		
		//remove from index 0
		arr.remove(0);
		System.out.println("Remove element from index 0: "+ arr);
		
		//remove karim
		arr.remove("Karim");
		System.out.println("After remove karim from the ArrayList: "+ arr);
		
		
		ArrayList<String> arr2 = new ArrayList<String>();
		arr2.add("Suman"); arr2.add("Latif"); arr2.add("Tipu");
		
		//remove all match elements
		arr.removeAll(arr2);
		System.out.println("After removing all matching elements: "+ arr);
		
		//clear
		arr.clear();
		System.out.println("After clear the ArrayList: "+ arr);
	}
}
/*
Before removing element: 				[Tipu, Asif, Rahim, Karim, Suman, Rupa, Tipu]
Remove element from index 0: 			[Asif, Rahim, Karim, Suman, Rupa, Tipu]
After remove karim from the ArrayList: 	[Asif, Rahim, Suman, Rupa, Tipu]
After removing all matching elements: 	[Asif, Rahim, Rupa]
*/

/*
 * remove(index)
 * remove(string key)
 * removeAll(second ArrayList) // remove all the elements match to each other
 * clear()
 */