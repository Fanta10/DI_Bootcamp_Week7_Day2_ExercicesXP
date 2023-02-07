package exercice3;

import java.text.DecimalFormat;

public class Account extends Customer{
	private int id;
	private Customer customer;
	private double balance = 0.0;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int id, Customer customer, double balance, int ID, String name, char gender) {
		super(ID, name, gender);
		this.id = id;
		this.customer = customer;
		this.balance = balance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		DecimalFormat val = new DecimalFormat();
		return this.customer.toString() +  "Account [id=" + id + ", balance=" + val.format(balance) + "]";
	}
	
	public String getCustomerName() {
		return super.getName();
		
	}
	public Account deposit(double amount) {
		 this.balance = this.balance + amount;
		 return this;
	}
	
	public Account withdraw(double amount) {
		if(this.balance >= amount) {
			double balanceTotale = 0;
			balanceTotale = this.balance - amount ;
			 System.out.println(balanceTotale); 
		}else {
			System.out.println("amount withdrawn exceeds the current balance!");
		}
		return this;

	}

}
