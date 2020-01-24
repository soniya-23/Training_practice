import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Account_operations implements Accounts {
	
	List<Account_operations> list = new ArrayList<>();
	
	public int ac_no;
	public String ac_Name;
	public int amount;

	public int w_limit;
	public int t_limit;
	public int d_limit;

	public int w_amount;
	public int t_amount;
	public int d_amount;
	public int withdrawn=0;

	// to view balance in your account.
	@Override
	public int get_balance() {
		System.out.println("Enter account number:: ");
		int accountNo = new Scanner(System.in).nextInt();
		Account_operations a = null;
		for(Account_operations ao : list)
		{
			if(ao.ac_no == accountNo)
				//System.out.println("your account balance is:" + ao.amount);
				a = ao;
		}
		//System.out.println(list);
		return a.amount;
	}

	// to withdraw amount from your account.
	@Override
	public void withdraw(int w_amount) {
		
		int bal = get_balance();
		System.out.println(bal+ "  "+ new Salary().w_limit + "    "+ w_amount);
		if (w_amount <= new Salary().w_limit && w_amount<= bal) {
			//w_amount = sc.nextInt();
			amount -= w_amount;
			 withdrawn += w_amount;
			System.out.println("you have withdrawn" + withdrawn);

		} else
			System.out.println("oops");
	}

	@Override
	public void deposit(int amount) {

		if (d_amount <= d_limit) {
			amount += d_amount;
			int deposited = d_amount;
			System.out.println(deposited + " amount credited to your account");

		} else
			System.out.println("oops");
	}

	@Override
	public void trasfer_Fund(Account_operations ac, int t_amount) {

		if (t_amount <= t_limit && t_amount <= amount)

		{
			ac.amount += t_amount;
			amount -= t_amount;
			int transfered = t_amount;
			System.out.println(transfered + "amount is transferred to" + ac.ac_Name);
		} else
			System.out.println("oops");

	}

	public void createAc() {
		//ArrayList<Account_operations> list = new ArrayList<Account_operations>();
		System.out.println("********WELCOME*********");
		System.out.println("Select the type of account you need\n" + "1.savings\n 2.cuurent\n 3.salary\n 4.deposit");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		sc.nextLine();
		System.out.println("enter the account number");
		int ac_no = sc.nextInt();
		System.out.println("enter account holder name");
		String ac_Name = sc.next();
		System.out.println("enter initial amount");
		int amount = sc.nextInt();

		switch (choice) {
		case 1:

			Savings r = new Savings(ac_no, ac_Name, amount);
			list.add(r);
			break;
		case 2:

			Current r1 = new Current(ac_no, ac_Name, amount);
			list.add(r1);
			break;
		case 3:
			
			Salary r2 = new Salary(ac_no, ac_Name, amount);
			list.add(r2);
			break;

		default:
			System.out.println("sorry! select the correct option");

		}
		if (choice == 1 || choice == 2 || choice == 3)
			System.out.println("account created");
		else
			System.out.println("sorry! try again");

	}

	public static void main(String args[]) {

		System.out.println("Select the type of operation you need\n"
				+ "1.create account\n2.get balance\n 3.withdraw\n 4.transfer\n 5.deposit\n 6. exit");

		Account_operations op = new Account_operations();
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		sc.nextLine();

		while (true) {

			switch (c)

			{
			case 1:
				op.createAc();
				break;
			case 2:
				System.out.println(op.get_balance());
				break;
			case 3:
				System.out.println("Enter amount:: ");
				int amount = sc.nextInt();
				op.withdraw(amount);
				break;
			case 4:
				op.trasfer_Fund(op, c);
				break;
			case 5:
				op.deposit(c);
				break;
			case 6:
				System.out.println("***THANK YOU***");
				System.exit(0);
			}
			System.out.println("Select the type of operation you need\n"
					+ " 1.create account\n 2.get balance\n 3.withdraw\n 4.transfer\n 5.deposit\n6.exit");

			c = sc.nextInt();

		}

	}

}
