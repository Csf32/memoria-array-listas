import java.util.Locale;
import java.util.Scanner;

import Exercicio3.Pacote_do_Exercicio3;

public class Exercicio3 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Pacote_do_Exercicio3[] quartos = new Pacote_do_Exercicio3[10];
		
		System.out.println("Quantos quartos ser�o alugados?");
		
		int x = sc.nextInt();
		
		for(int i = 1; i <= x; i++) {
			
			System.out.println("Aluguel " + i);
			System.out.println("Nome: ");
			sc.nextLine();
			
			String nome_estudantes = sc.next();
			System.out.println("E-mail: ");
			
			String email_estudantes = sc.next();
			
			System.out.println("Quarto:");
			
			int numero_do_quarto = sc.nextInt();
		
			quartos[numero_do_quarto] = new Pacote_do_Exercicio3(email_estudantes, nome_estudantes);
		}
		
		System.out.println();
		System.out.println("Quartos ocupados:");
		
		for (int i=0; i<10; i++) {
		
			if (quartos[i] != null) {
				System.out.println(i + ": " + quartos[i]);
		}
	}
		
		
		sc.close();
	}

}
