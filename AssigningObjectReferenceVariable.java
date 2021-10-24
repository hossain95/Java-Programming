class Box
{
	double width;
	double height;
	double depth;
}
public class AssigningObjectReferenceVariable
{
	public static void main(String[] args)
	{
		Box b1 = new Box();
		
		b1.width = 10;
		b1.height = 20;
		b1.depth = 5;
		Box b2 = b1;
		System.out.println("b1: "+b1.width+ " "+b1.height+ " "+b1.depth);
		System.out.println("b2: "+b2.width+ " "+b2.height+ " "+b2.depth);
		b2.width = 8;
		System.out.println("b1: "+b1.width+ " "+b1.height+ " "+b1.depth);
		System.out.println("b2: "+b2.width+ " "+b2.height+ " "+b2.depth);
	}
}
/*
 *b1 and b2 will both refer to the same object.
 *the assignment of b1 to b2 did not allocate any memory or copy any part of the original object.
 *any changes made to the object through b2 will affect the object to which b1 is referring, since they are the same object.
 *b1 and b2 both refer to the same object, they are not linked in any other way.
b1: 10.0 20.0 5.0
b2: 10.0 20.0 5.0
b1: 8.0 20.0 5.0
b2: 8.0 20.0 5.0
 */
