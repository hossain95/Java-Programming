package arraylist;
import java.util.ArrayList;
import java.util.Collections;
public class Sorting
{
	public static void main(String[] args)
	{
		ArrayList<Integer>arr = new ArrayList<Integer>();
		arr.add(12); arr.add(2); arr.add(10); arr.add(5); arr.add(15); arr.add(40);
		
		System.out.println("Before sorting: "+arr);
		
		//sort the ArrayList
		Collections.sort(arr);
		System.out.println("After sorting ascending order: "+ arr);
		
		
		//sort the ArrayList descending order
		Collections.sort(arr, Collections.reverseOrder());
		
		System.out.println("After sorting descending order: "+arr);
	}
}

/*
Before sorting: 				[12, 2, 10, 5, 15, 40]
After sorting ascending order: 	[2, 5, 10, 12, 15, 40]
After sorting descending order: [40, 15, 12, 10, 5, 2]
*/

/*
 * Collections.sort()
 * Collections.sort(ArrayList name, Collections.reverseOrder())
 */