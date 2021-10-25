/*
 * A package is a group of related classes, interfaces and sub packages.
 * There are 2 types of package in java.
 * 1) built-in package (example: import java.util.Scanner)
 * 		java (package)
 * 		io, lang, net, util, awt, applet (sub package)
 * 		Reader, Writer, file (class and interface) under of io sub package
 * 		Math, String, StringBuffer, System (class and interface) under of lang sub package
 * 2) user-defined package
 */
/*
 *
 * same class name can use in two different package
 * the compiler allows both classes to have the same name if they are in different packages.
 * The package is both a naming and a visibility control mechanism.
 * You can define classes inside a package that are not accessible by code outside that package.
 * You can also define class members that are only exposed to other members of the same package.
 * This allows your classes to have intimate knowledge of each other, but not expose that knowledge to the rest of the world.
 * Package names are written in all lower case to avoid conflict with the names of classes or interfaces.
 */
package mypackage1;
import package2.*;

public class Package
{
	public static void main(String[] args)
	{
		System.out.println("Calling from package");
		AccountBalance ab = new AccountBalance();
		ab.main(args);
		System.out.println("Calling end from package");
	}
}
