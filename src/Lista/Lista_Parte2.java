package Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista_Parte2 {

	public static void main(String[] args) {
		
//<> = gen�rics, quando coloca o tipo como par�metro, aceita somente Wrraper Classes e importa
		
	//Instanciando a lista, como List � interface, pode-se colocar a classe ArrayList e importa:
		
		List<String> list = new ArrayList<>();
	
		list.add("Caique");
		list.add("Eliana");
		list.add("Vera");
		list.add("Ant�nio");
	
	//Inserir um novo elemento entre Vera e Eliana
		
		list.add(2,"Pais:");
		
	//Ver o tamanho da lista com o m�todo size():
		
		System.out.println(list.size());
		
	//Remover um elemento da lista:
		//Por compara��o:
		
		list.remove("Caique");
		
		//Por posi��o:
		
		list.remove(1);
		
		//Por predicado: remove todos que come�arem com uma letra, por exemplo, e retorna um booleano
		
			// Pega um valor em listas e retorna verdadeiro se essa listas.charAt(0) == 'A'; apagando a string 'A'
		
		list.removeIf(listas -> listas.charAt(0) == 'E'); //L�mbida

		for (String listas : list) {
			System.out.println(listas);
		}
	
	//Encontrar a posi��o de um elemento: indexOf
		
		//Quando o indexOf n�o encontra o elemento ele retorna -1
		
		System.out.println(list.indexOf("Caique"));
		
	
/*Para filtrar os elementos da lista anterior inst�nciada que comecem com a letra 'A', precisa 
 criar uma nova lista e buscar as informa��es na de cima, convertendo com o m�todo stream(), pois aceita informa��es com o l�mbida e
 depois, converte novamente para lista com a fun��o collect(Collectors.toList())
 */
	//O filter � compat�vel com predicado
		
		//Converte para stream().filter e volta como lista (collect(Collectors.toList())
		
		List<String> result = list.stream().filter(listas -> listas.charAt(0) == 'V').collect(Collectors.toList()); 
	
	System.out.println(result);

	//Encontrar um elemento na lista pelo predicado com o stream().filter e o m�todo findFirst().orElse(null):
		
	String name = list.stream().filter(listas -> listas.charAt(0) == 'V').findFirst().orElse(null);
	
	System.out.println(name);
	
	
	
	
	}
	
	

}
