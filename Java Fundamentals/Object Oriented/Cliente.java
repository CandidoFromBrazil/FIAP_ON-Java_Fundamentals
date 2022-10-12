package br.com.fiap.banco.teste;

public class Cliente {
	private boolean especial;
	public boolean isEspecial(){
		return especial;
	}
	
	private void setEspecial(boolean especial){
		this.especial = especial;
	}
	
	
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		cliente1.setEspecial(true);
		System.out.println("Is he a special cliente?");
		System.out.println(cliente1.isEspecial());
	}
}

