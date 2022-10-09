import java.util.Locale;
import java.util.Scanner;

import exercicio4.PacoteExercicio4;

public class Exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas vai digitar");				
		int y = sc.nextInt();
		
		PacoteExercicio4[] conjunto = new PacoteExercicio4[y]; 
		
		for(int z = 0; z < y; z++) {
			
			sc.nextLine();
			System.out.println("Digite o nome da " + z + " pessoa");
			String people = sc.nextLine();
			System.out.println("Digite a idade da " + z + " pessoa");
			int age = sc.nextInt();
			
			conjunto[z] = new PacoteExercicio4(people, age); 
		}
		
		int soma = 0;
		
		for(int z = 0; z < y; z++) {
			
			soma += conjunto[z].age;
		}
		
		int media = soma / y;
		
		System.out.println(media);
		
	
		sc.close();
		
		
	}

}
