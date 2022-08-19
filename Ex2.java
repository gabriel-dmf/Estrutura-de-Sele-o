package Estrutura_Selecao;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um número inteiro: ");
		int num = entrada.nextInt();
		
		if (num == 0) {
			System.out.println("Número é igual a zero!");
		} else {
			if (num > 0) {
				System.out.println("Número é positivo!");
			} else {
				System.out.println("Número é negativo!");
			}
		}
		
		entrada.close();
	}

}
