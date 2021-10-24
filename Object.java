/*
 *Obtaining objects of a class is a tow-step process.
 *First, you must declare a variable of the class type. This variable does not define an object.
 *Instead, it is simply a variable that can refer to an object.
 *Second, you must acquire an actual, physical copy of the object and assign it to that variable.
 *The new operator dynamically allocates memory for an object and returns a reference to it.
 */

class Box
{
	double width;
	double height;
	double depth;
}
public class Object
{
	public static void main(String[] args)
	{
		Box mybox; // declare reference to object
		mybox = new Box(); // allocate a Box object
	}
}
/*
 *The first line declares mybox as reference to an object of type Box.
 *After this line executes, mybox contains the value null, which indicates that it does not yet point to an actual object.
 *The next line allocates an actual object and assigns a reference to it to mybox.
 */
