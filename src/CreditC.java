import java.util.ArrayList;
import java.util.Iterator;

public class CreditC {
	
	public static void main(String[] args) {
		CreditC comp = new CreditC();
		comp.displayAccount("Bob");
		comp.increaseLimit("Bob",750);
		comp.charge("Bob", 32.25);
		comp.displayAllAccounts();
		comp.purge();
		comp.displayAllAccounts();
	}
	
	private ArrayList<Customer> customers; // list of customers
	
	//Constructor - creates list and adds three customers
	public CreditC() {
		customers = new ArrayList<Customer>();
		customers.add(new Customer("Bigfoot"));
		customers.add(new Customer("Mr.Peanut"));
		customers.add(new Customer("Bob"));
	}
	
	/**
	 * Given a customer's name, this method prints that
	 * customer's information.
	 * @param name name of customer
	 */
	public void displayAccount(String name) {
		for(Customer c : customers) { // for each c in customers...
			if(c.getName().equals(name)){ // does customers name equal given name?
				System.out.println(c);
			}
		}
	}
	
	public void displayAllAccounts() {
		for(Customer c : customers)
			System.out.println(c);
	}
	
	/**
	 * Increased specified custome's credit limit
	 * @param name customer's name
	 * @param amount amount to increase credit limit
	 */
	public void increaseLimit(String name, double amount) {
		for(Customer c : customers) {
			if(c.getName().equals(name)) {
				c.setLimit(c.getLimit()+amount);
			}
		}
	}
	
	public boolean charge(String name, double amount) {
		for(Customer c : customers) {
			if(c.getName().equals(name)) {
				//Will charge put balance over limit
				if(c.getLimit()>=c.getBalance()+amount) {
					c.raiseBalance(amount); //charges account
					return true;
				}
			}
		}
		return false;
	}
	
	public void credit(String name, double amount) {
		for(Customer c : customers) {
			if(c.getName().equals(name)) {
				c.lowerBalance(amount);
			}
		}
	}
	
	public void printDebtors(double amount) {
		for(Customer c : customers) {
			if(c.getBalance()>amount) {
				System.out.println(c.getName());
			}
		}
	}
	
//	public void purge() {
//		for(int i=0;i<customers.size();i++) {
//			Customer c = customers.get(i);
//			if(c.getBalance()==0) {
//				customers.remove(c);
//				i--;
//			}
//		}
//	}
	
	public void purge() {
		Iterator<Customer> iter = customers.iterator();// standard line
		while(iter.hasNext()) {// standard line
			Customer c = iter.next();// standard line
			if(c.getBalance()==0) {
				iter.remove();
			}
		}
	}	
}

