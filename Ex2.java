package Estrutura_Selecao;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um n�mero inteiro: ");
		int num = entrada.nextInt();
		
		if (num == 0) {
			System.out.println("N�mero � igual a zero!");
		} else {
			if (num > 0) {
				System.out.println("N�mero � positivo!");
			} else {
				System.out.println("N�mero � negativo!");
			}
		}
		
		entrada.close();
	}

}
