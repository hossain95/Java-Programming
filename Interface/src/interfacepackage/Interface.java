/*
 * an interface is a collection of abstract methods.
 * interface is fully abstract
 * it supports multiple inheritance
 * interface methods are declared without any body.
 * any number of classes can implement an interface. Also, one class can implement any number of interfaces.
 * interfaces cannot be used to create objects
 * interface methods do not have a body - the body is provided by the implement class
 * on implementation of an interface, you must override all of its methods
 * Interface methods are by default abstract and public
 * Interface attributes are by default public, static and final
 * An interface cannot contain a constructor.
 */
/*
 * Why And When To Use Interfaces?
	1) To achieve security - hide certain details and only show the important details of an object (interface).
	2) Java does not support "multiple inheritance" (a class can only inherit from one superclass).
	   However, it can be achieved with interfaces, because the class can implement multiple interfaces.
	   Note: To implement multiple interfaces, separate them with a comma (see example below).
 */
/*
	 interface Animal
	{
		....
	}
	interface Dog extends Animal
	{
		....
	}
	Dog interface can extends Animal interface
*/
/*
interface Animal
{
	....
}
class Dog implements Animal
{
	....
}
Dog class can implements Animal interface
*/



package interfacepackage;
public class Interface
{
	public static void main(String[] args)
	{
		Dog dog = new Dog();
		dog.eat();
	}
}
