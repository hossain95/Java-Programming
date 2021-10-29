package arraylist;

import java.util.ArrayList;

public class IsEmpty
{
	public static void main(String[] args)
	{
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Tipu"); arr.add("Asif"); arr.add("Rahim"); arr.add("Karim"); arr.add("Suman");
		arr.add("Rupa"); arr.add("Tipu");
		
		System.out.println(arr.isEmpty());
		arr.clear();
		System.out.println(arr.isEmpty());
	}
}

/*
false
true
 */