
public class BankAccount {

	Bank bank;
	Person owner;
	private double balance;
	private int accountnumber;

	
	public BankAccount(Bank bank, Person owner, double balance, int accountnumber) {
		super();
		this.bank = bank;
		this.owner = owner;
		this.balance = balance;
		this.accountnumber = accountnumber;
	}
	
	public double withdraw(double amount) {
		if(amount>balance) {
			//System.out.println("Cannot withdraw a bigger amount than balance. ");
			return -1;
			
		}
		balance = balance-amount;
		return balance;
		
	}
	
	public double deposit(double amount) {
		balance = balance + amount; 
		return balance;
		
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public Person getOwner() {
		return owner;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}

	@Override
	public String toString() {
		return "Bank Account Information:" + "\n"
			 + "Balance= "+ + balance + "\n"  
			  +"Account Number= "+accountnumber + "\n"
			  +bank+"\n"
			  +owner;
				
	}
	
	
	
	
}
