package br.com.fiap.banco.teste;

public class Telefone {
	private String ddd;
	private String numero;
	
	//métodos gets e sets

	private String formatarTelefone(String ddd, String numero){
		return "(" + ddd + ")" + numero;
	}
	
	public String getTelefoneFormatado(){
		return formatarTelefone(ddd,numero);
	}
}
