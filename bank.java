class Costomer
{
	String cName;
	Long aCno;
	static double balance = 1000.0;

	void costmerDetails()
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter costemer name :");
		cName = sc.nextLine();
		System.out.println("costemer details are :");
		System.out.println("****************************");
		System.out.println("Costomer name is :"+cName);
		System.out.println("Costomer Acount number is :"+ aCno);
		System.out.println("Costomer current balance is :" + balance);
	}
}
class Deposit extends Costomer
{
	void depositAmount()
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter amount to Deposit");
		double amount = sc.nextDouble();
		balance = balance+amount;
		System.out.println("After Deposit amount :"+ balance);
	}
}
class Withdraw extends Costomer
{
	void witdrawAmount()
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter amount to Withdraw");
		double withdraw = sc.nextDouble();
		balance = balance - withdraw;
		System.out.println("Ypur curtent balance is :"+ balance);

	}
}
class Account
{
	public static void main(String[] args) {
		
	
		Costomer c = new Costomer();
		c.costmerDetails();
		Deposit d = new Deposit();
		d.depositAmount();
		Withdraw w = new Withdraw();
		w.witdrawAmount();
	}
}