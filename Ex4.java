package Estrutura_Selecao;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entra com um ano de ao menos 4 dígitos: ");
		int ano = entrada.nextInt();
		
		int anoLength = String.valueOf(ano).length();
		
		if (anoLength >= 4) {
			if (ano % 4 == 0) {
				System.out.println("É ano bissexto!");
			} else {
				System.out.println("Não é ano bissexto!");
			}
		} else {
			System.out.println("Ano inválido!");
		}
		
		entrada.close();
	}

}
