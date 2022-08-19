package Estrutura_Selecao;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com o sexo (M/F): ");
		char caractere = entrada.nextLine().charAt(0);
		
		if (caractere == 'M') {
			System.out.println("Masculino!");
		} else {
			if (caractere == 'F') {
				System.out.println("Feminino!");
			} else {
				System.out.println("Caractere inválido!");
			}
		}
		
		entrada.close();
	}

}
