package myPackage2;

class Balance
{
	String name;
	double bal;
	Balance(String str, int val)
	{
		name = str;
		bal = val;
	}
	void showBalance()
	{
		System.out.println("Name: "+name);
		System.out.println("You balance: "+ bal);
	}
}
public class AccountBalance
{
	public static void main(String[] args)
	{
		Balance current[] = new Balance[3];
		current[0] = new Balance("Akash", 10000);
		current[1] = new Balance("Sima", 200000);
		current[2] = new Balance("Tima", 399994);
		for(int i = 0; i < 3; i++)
		{
			current[i].showBalance();
		}
	}
}
