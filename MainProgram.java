import java.util.ArrayList;
import java.util.Scanner;

public class MainProgram {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
	      ArrayList<Person> person = new ArrayList<Person>();
	      ArrayList<Bank> bank = new ArrayList<Bank>();
	      ArrayList<BankAccount>  bankAccount = new ArrayList<BankAccount>();
	        
		System.out.println("Enter a command: ");
		String command = scan.next();
		
		while(!command.equals("Q")) {
			
			switch(command) {
			
			case "createPerson":
				String firstName = scan.next();
				String lastName= scan.next();
				String birthDay= scan.next();
				String street = scan.next();
				String city = scan.next();
				String postCode = scan.next();
				String country = scan.next();
			   
				Address address1= new Address(street, city, postCode, country);
				Person person1 = new Person(firstName, lastName, address1, birthDay);
			    person.add(person1);
				System.out.println(person1.toString());
			
				break;
				
			case "createBank":
				String bankName = scan.next();
				String street1= scan.next();
				String city1= scan.next();
				String postCode1=scan.next();
				String country1=scan.next();
			
				Address bankAddress = new Address(street1, city1, postCode1, country1);
				Bank bank1 =  new Bank(bankName, bankAddress);
				bank.add(bank1);
			    System.out.println(	bank1.toString());
				
				break;
			
			case "createBankAccount":
				int personIndex= scan.nextInt();
				int bankIndex=scan.nextInt();
				double balance=scan.nextDouble();
				int accountNumber=scan.nextInt();
				
				BankAccount account = new BankAccount(bank.get(bankIndex), person.get(personIndex), balance, accountNumber);
		        bankAccount.add(account);
				System.out.println(account.toString() );
		        
		
		        break;
			
			case "withdraw":
				int accountnumber2=scan.nextInt();
				double amount =scan.nextDouble();
				
				for(int i = 0 ; i <bankAccount.size() ; i++){
		              if(bankAccount.get(i).getAccountnumber() == accountnumber2)
		                if(bankAccount.get(i).withdraw(amount) == -1)
		                  System.out.println("Cannot withdraw a bigger amount than balance.");
		                else
		                  System.out.println(bankAccount.get(i).toString());
		            }
				
				break;
				
			case "deposit":
				int accountnumber3=scan.nextInt();
				double amount2=scan.nextDouble();
				for(int i = 0 ; i <bankAccount.size() ; i++){
		              if(bankAccount.get(i).getAccountnumber() == accountnumber3) {
		                bankAccount.get(i).deposit(amount2);
		                System.out.println(bankAccount.get(i).toString());
		            }
		          }
				
				break;
				
			case "changeAccountNum":
				int accountNumIndex = scan.nextInt();
				int newaccountNumIndex = scan.nextInt();
				
				for(int i =0; i < bankAccount.size();i++ ) {
					if(bankAccount.get(i).getAccountnumber() == accountNumIndex) {
						 bankAccount.get(i).setAccountnumber(newaccountNumIndex);
	                        System.out.println(person.get(i).toString());
	                        System.out.println("New account number: "+newaccountNumIndex);
					}
				}
				
				break;
			
			case "Q":
				break;
			}
			
			System.out.println("Enter a command: ");
			command = scan.next();
			
			
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
