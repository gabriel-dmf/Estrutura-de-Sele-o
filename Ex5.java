package Estrutura_Selecao;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um caractere: ");		
		char caractere = entrada.nextLine().charAt(0);
		
		caractere = Character.toLowerCase(caractere);
		
		if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
			System.out.println("É vogal!");
		} else {
			System.out.println("Nâo é vogal!");
		}
		
		entrada.close();
	}

}
