package Estrutura_Selecao;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com um n�mero: ");
		int num = entrada.nextInt();
		String txt = "N�mero ";
		
//		De qualquer forma, para transformar um n�mero �mpar para par e par para impar � s� somar 1:
		
		if (num % 2 == 0) {
			txt += "par: " + num + " para �mpar: ";
			num += 1;
		} else {
			txt += "�mpar: " + num + " para par: ";
			num += 1;
		}
		txt += num;
		
		System.out.println(txt);
		
		entrada.close();
	}

}
