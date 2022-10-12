package LoopsArraisStringCollections;

import java.util.Scanner;

public class _string {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String name = new String();
		 
		name = scanner.next();
		System.out.println(name + " = " + name.length());
		
		//intânciando uma string; criando outra sem instânciar
		String course = new String("Estácio");
		String year = "2021";
		
		//uso do método da classe String(concat())
		String college = course.concat(" - ").concat(year);
		System.out.println(college);
		
		/*comparação de strings - métodos de strings: 
		 * (equals;equalsignoreCase;startsWith;endsWith;length,charAt.indexOf,lastIndexOf;subString;toUpperCase;toLowerCase;replace)
		 * */
		String day = "monday";
		String weekend = new String("sunday");
		if(day.equals(weekend)) {
			System.out.println("same");
		}else {
			System.out.println("different");
		}
		
		//convertendo string em array
		String facu = "FIAP - A Melhor Faculdade de Tecnologia";
		String[] palavras = facu.split(" ");
		for (String p : palavras) {
		    System.out.println(p);
		}
		String disciplinas = "LTP;Web;Algoritmos;Banco de Dados";
		String[] dis = disciplinas.split(";");
		for (String d : dis) {
		    System.out.println(d);
		}
		scanner.close();
	}
}
