package contador;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro: ");
		int parametroUm = scan.nextInt();
		scan.nextLine();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = scan.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			exception.getMessage();
			new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
		}
		
	}

	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if(parametroUm>parametroDois) {
			throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
		}
		
		int contagem = parametroDois - parametroUm;
		for(int i = 1; i <= contagem; i++) {
			System.out.println(i);
		}
	
	}
}
