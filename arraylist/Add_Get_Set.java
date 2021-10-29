package arraylist;
import java.util.ArrayList;
public class Add_Get_Set
{
	public static void main(String[] args)
	{
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		//add method
		arr.add(12); arr.add(2); arr.add(10); arr.add(5); arr.add(15); arr.add(40);
		//arr =[12, 2, 10, 5, 15, 40]
		System.out.println(arr);
		
		//get method
		System.out.println(arr.get(1));
		
		//set method
		arr.set(0, 100);
		System.out.print(arr);
	}
}

/*
 * add(value)
 * get(index)
 * set(index, value)
 */
/*
[12, 2, 10, 5, 15, 40]
2
[100, 2, 10, 5, 15, 40]
*/