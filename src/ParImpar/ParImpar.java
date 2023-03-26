package ParImpar;

import java.util.Scanner;

public class ParImpar {
	
	public static void main(String [] args) {
		
		int numero, restoDivisao;
		System.out.println("Coloque um Número: ");
		Scanner scan = new Scanner(System.in);
		numero = scan.nextInt();
		scan.close();
		
		restoDivisao = numero % 2;
		
		if (restoDivisao == 0) {
			System.out.println("O Número é Par!");
		}else {
			System.out.println("O Número é Impar!");
		}
	}
}
