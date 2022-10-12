package projetosFuncionais;

import java.util.Scanner;

public class maximoNumero {

	public static void main(String[] args){

        	int[] notas = new int[5];
       		Scanner scanner = new Scanner(System.in);

		int contadorTrofeu = 0;
		int contadorPlaca = 0;

		int max = 0;

		//adicionando os valores ao vetor/ definindo max
        for(int i = 0; i < notas.length; i++){

			System.out.println("Entre com a nota de cada aluno: ");
			notas[i] = scanner.nextInt();

			if(i == 0){
				max = notas[i];
			}else{
				if(max < notas[i]){
					max = notas[i];
				}
			}
		}
        //aplicando a lógica para a saída de dados
		for(int y = 0; y < notas.length; y++){
			if(notas[y] == max){
				contadorTrofeu += 1;
			}else{
				if(notas[y] >= 90){
					contadorPlaca += 1;
				}
			}
		}
		scanner.close();
		System.out.println(contadorTrofeu + " : " + contadorPlaca);
	}
}