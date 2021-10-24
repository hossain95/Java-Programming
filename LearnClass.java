/*
 *a class is that it defines a new data type.
 *This new type can be used to create objects of that type.
 *A class is a template for an object, and an object is an instance of a class.
 *The data, or variables, defined within a class are called instance variables.
 *The code is contained within methods.
 *The methods and variables defined within a class are called members of the class.
 *Variable defined within a class are called instance variables because each instance of the class contains its own copy of these variables.
 *A class declaration only creates a template; it does not create an actual object.
 */
class Box
{
	double width;
	double height;
	double depth;
}
public class LearnClass
{
	
	public static void main(String[] args)
	{
		Box mybox = new Box(); // mybox is a object
		mybox.width = 10;
		mybox.height = 23;
		mybox.depth = 23;
	}

}
/*
 * mybox is a instance of Box
 */