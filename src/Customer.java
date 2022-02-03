
import java.util.Scanner;

class Bank {			// Encapsulation
	// data hiding
	private double bal = 10000;
	private int psw;
	
	/**
	 * @return the psw
	 */
	public int getPsw() {
		return psw;
	}

	/**
	 * @param psw the psw to set
	 */
	public void setPsw(int psw) {
		this.psw = psw;
	}
	
	 /**
	  * Functionality
	  * 
	  * 1. Deposite
	  * 2. Withdrow
	  * 3. CheckBalance
	  */
	
	
	public void deposite(double money) {
		bal += money;
		System.out.println("Deposite money : " + money);
		System.out.println("Total Balance : " + bal);
	}
	
	public void withdrow(double money) {
		System.out.println("Enter Password : ");
		Scanner scn = new Scanner(System.in);
		setPsw(scn.nextInt());
		if(psw == 12345) {
			if(bal >= money) {
				bal -= money;
				System.out.println("Withdrow money : " + money);
				System.out.println("Total Balance : " + bal);
			}else {
				System.out.println("Insufficient Balance in your Acc.");
			}
		}else {
			System.out.println("Password is Incurrect.");
		}
	}
	
	public void checkBalance() {
		System.out.println("Your Acc. Balance is : " + bal);
	}
	
}

public class Customer{
	public static void main(String[] args) {
		Bank obj = new Bank();
		
		int choice;
		double money;
		
		System.out.println("1 for Deposite");
		System.out.println("2 for Withdrow");
		System.out.println("3 for CheckBalance");
		
		System.out.println("Enter your choice : ");
		Scanner scn = new Scanner(System.in);
		choice = scn.nextInt();
		
		switch (choice) {
		case 1:System.out.println("Enter deposite amount : ");
				money = scn.nextDouble();
				obj.deposite(money);
				break;
		case 2: System.out.println("Enter withdrow amount : ");
				money = scn.nextDouble();
				obj.withdrow(money);
				break;
		case 3: obj.checkBalance();
				break;
		default:System.out.println("Incurrect choice.");
			break;
		}
	}
}

