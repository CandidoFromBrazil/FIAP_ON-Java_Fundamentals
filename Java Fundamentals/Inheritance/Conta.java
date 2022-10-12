package Herança;

public class Conta {
	
	private int number;
	private int agency;
	private double accountBalance;
	
	
	public Conta() {
		
	}
	
	public Conta(int number, int agency) {
		this.setNumber(number);
		this.setAgency(agency);
	}
	
	
	public void deposit(double deposit) {
		this.accountBalance += deposit;
	}
	
	public void withdraw(double withdraw) {
		accountBalance -= withdraw;
	}
	
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	
	public int getAgency() {
		return agency;
	}
	
	public void setAgency(int agency) {
		this.agency = agency;
	}
	
	
	public double getaccountBalance() {
		return accountBalance;
	}
}
