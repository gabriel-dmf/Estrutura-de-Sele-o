package Estrutura_Selecao;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com um número: ");
		int num = entrada.nextInt();
		String txt = "Número ";
		
//		De qualquer forma, para transformar um número ímpar para par e par para impar é só somar 1:
		
		if (num % 2 == 0) {
			txt += "par: " + num + " para ímpar: ";
			num += 1;
		} else {
			txt += "ímpar: " + num + " para par: ";
			num += 1;
		}
		txt += num;
		
		System.out.println(txt);
		
		entrada.close();
	}

}
