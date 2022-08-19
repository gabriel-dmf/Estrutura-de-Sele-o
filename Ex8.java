package Estrutura_Selecao;
import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe sua nota: ");
		float a = entrada.nextFloat();
		
		System.out.print("Informe sua nota: ");
		float b = entrada.nextFloat();
		
		float media = (a + b)/2;
		
		if (media < 7) {
			System.out.println("Reprovado!");
		} else {
			System.out.println("Aprovado!");
		}
		
		entrada.close();
	}

}
