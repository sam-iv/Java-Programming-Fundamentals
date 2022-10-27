package lab5_exercise2;

public class GasBill {
	private String accountNumber;
	private double amount;
	private Customer customer;
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public String getCustomer() {
		return customer.toString();
	}
	
	public GasBill(String accountNumber, double amount, Customer customer) {
		super();
		this.accountNumber = accountNumber;
		this.amount = amount;
		this.customer = customer;
		
		
		for (int i = 0; i < 13; i++) {
			if (i == 4 || i == 9) {
				if (this.accountNumber.charAt(i) != '-') {
					this.accountNumber = "Invalid Account";
				} else {
					continue;
				}
			}
		}
	}
	
	private String displayAmountDue() {
		String output = amount+"0";
		return output;
	}
	
	public boolean checkAccountAccuracy() {
		if (accountNumber == "Invalid Account") {
			return false;
		} else {
			return true;
		}
	}
	
	public String displayAccountDetails() {
		return "Gas Bill" + "\n" + " Account Number:"
		 + getAccountNumber() + "\n" + " Customer:" + customer.toString() + "\n"
		  + " Amount due:" + displayAmountDue();
	}
}
