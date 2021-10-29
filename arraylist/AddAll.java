package arraylist;
import java.util.ArrayList;
public class AddAll
{
	public static void main(String[] args)
	{
		ArrayList<Integer>arr = new ArrayList<Integer>();
		arr.add(12); arr.add(2); arr.add(10); arr.add(5); arr.add(15); arr.add(40);
		
		ArrayList<Integer>arr2 = new ArrayList<Integer>();
		arr2.add(1); arr2.add(45); arr2.add(10);
		
		System.out.println("Before add: "+ arr);
		//add all to arr
		arr.addAll(arr2);
		System.out.println("After add: "+arr);
		
		
		//add specific index
		arr.addAll(1, arr2);
		System.out.println("After add all the index 1 in arr: "+ arr);
	}

}
/*
Before add: [12, 2, 10, 5, 15, 40]
After add: [12, 2, 10, 5, 15, 40, 1, 45, 10]
After add all the index 1 in arr: [12, 1, 45, 10, 2, 10, 5, 15, 40, 1, 45, 10]
*/

/*
 * addAll(second ArrayList)
 * addAll(index, second ArrayList)
 */