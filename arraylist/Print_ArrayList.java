package arraylist;
import java.util.ArrayList;
public class Print_ArrayList
{
	public static void main(String[] args)
	{
		ArrayList<Integer>arr = new ArrayList<Integer>();
		arr.add(12); arr.add(2); arr.add(10); arr.add(5); arr.add(15); arr.add(40);
		//arr [12, 2, 10, 5, 15, 40]
		
		//printing the arraylist object
		System.out.println("Using ArrayList object: "+arr);
		
		
		//Iterating ArrayList using for-each loop
		System.out.print("Using for-each loop: ");
		for(int i : arr)
		{
			System.out.print(i+ " ");
		}
		System.out.println();
		
		// iterating using get method
		System.out.print("Using get method: ");
		for(int i = 0; i < arr.size(); i++)
		{
			System.out.print(arr.get(i)+ " ");
		}
		System.out.println();
	}

}
/*
Using ArrayList object: [12, 2, 10, 5, 15, 40]
Using for-each loop: 12 2 10 5 15 40 
Using get method: 12 2 10 5 15 40
*/