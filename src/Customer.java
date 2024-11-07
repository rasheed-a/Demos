public class Customer {
	
	private String name;			// customer's name
	private AccountNumber number;	// account number
	private double balance;			// current account balance
	private double limit;			// credit limit
	
	/**
	 * Create a new account for the given customer.
	 * @param name customer's name
	 */
	public Customer(String customerName) {
		name = customerName;
		number = new AccountNumber();
		balance = 0;
		limit = 1000;
	}
	
	// ***** GET METHODS *****
	
	public String getName() {
		return name;
	}
	
	public AccountNumber getNumber() {
		return number;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getLimit() {
		return limit;
	}
	
	// ***** SET METHODS *****
	
	/**
	 * Increases account balance by given amount.
	 * Displays an error if the given amount is negative.
	 * @param amount amount to add to balance
	 */
	public void raiseBalance(double amount) {
		if (amount >= 0) {
			balance += amount;
		} 
	}
	
	/**
	 * Reduces balance by given amount.
	 * Displays an error if the given amount is negative.
	 * @param amount amount to subtract from balance
	 */
	public void lowerBalance(double amount) {
		if (amount >= 0) {
			balance -= amount;
		} 
	}
	
	/**
	 * Sets credit limit to given amount.
	 * Displays an error if the given amount is negative.
	 * @param amount new credit limit
	 */
	public void setLimit(double amount) {
		if (amount >= 0) {
			limit = amount;
		} 
	}
	
	// ***** OTHER METHODS *****
	
	// Returns this object formatted as a string (so it can be printed).
	public String toString() {
		return number.toString() + "\t" + name + 
				"\n\tBalance: $" + String.format("%.2f", balance) +
				"\n\tLimit:   $" + String.format("%.2f", limit);
	}
	
}
