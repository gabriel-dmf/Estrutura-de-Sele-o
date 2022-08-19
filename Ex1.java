package Estrutura_Selecao;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		int a = entrada.nextInt();
		
		System.out.print("Informe um número: ");
		int b = entrada.nextInt();
		
		if (a == b) {
			System.out.println("Números iguais");
		} else {
			if (a > b) {
				System.out.println("O primeiro número informado é o maior");
			} else {
				System.out.println("O segundo número informado é o maior");
			}
		}		
		
		entrada.close();
	}

}
