package Herança;

public class ContaCorrente extends Conta {
	
	private String type;
	private double specialCheck;
	
	public ContaCorrente(String type) {
		this.type = type;
	}
	
	public String getTipo() {
		return this.type;
	}
	
	public void setTipo(String tipo) {
		this.type = type;
	}
	
	public double getSpecialCheck() {
		return this.specialCheck;
	}
	
	public void setspecialCheck(double specialCheck) {
		this.specialCheck = specialCheck;
	}
	
	 //método vindo da SuperClass;
	public double getAccountBalance() {
		return getAccountBalance() + this.specialCheck;
	}

	 //Usando de polimorfismo (withdraw vindo da SuperClass)
	@Override
	public void withdraw(double value) {
		value = value + 10;
		super.withdraw(value);
	}
}

