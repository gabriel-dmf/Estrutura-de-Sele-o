package Estrutura_Selecao;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um n�mero: ");
		int a = entrada.nextInt();
		
		System.out.print("Informe um n�mero: ");
		int b = entrada.nextInt();
		
		if (a == b) {
			System.out.println("N�meros iguais");
		} else {
			if (a > b) {
				System.out.println("O primeiro n�mero informado � o maior");
			} else {
				System.out.println("O segundo n�mero informado � o maior");
			}
		}		
		
		entrada.close();
	}

}
