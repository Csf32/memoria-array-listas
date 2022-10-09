package Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista_Parte2 {

	public static void main(String[] args) {
		
//<> = genérics, quando coloca o tipo como parâmetro, aceita somente Wrraper Classes e importa
		
	//Instanciando a lista, como List é interface, pode-se colocar a classe ArrayList e importa:
		
		List<String> list = new ArrayList<>();
	
		list.add("Caique");
		list.add("Eliana");
		list.add("Vera");
		list.add("Antônio");
	
	//Inserir um novo elemento entre Vera e Eliana
		
		list.add(2,"Pais:");
		
	//Ver o tamanho da lista com o método size():
		
		System.out.println(list.size());
		
	//Remover um elemento da lista:
		//Por comparação:
		
		list.remove("Caique");
		
		//Por posição:
		
		list.remove(1);
		
		//Por predicado: remove todos que começarem com uma letra, por exemplo, e retorna um booleano
		
			// Pega um valor em listas e retorna verdadeiro se essa listas.charAt(0) == 'A'; apagando a string 'A'
		
		list.removeIf(listas -> listas.charAt(0) == 'E'); //Lâmbida

		for (String listas : list) {
			System.out.println(listas);
		}
	
	//Encontrar a posição de um elemento: indexOf
		
		//Quando o indexOf não encontra o elemento ele retorna -1
		
		System.out.println(list.indexOf("Caique"));
		
	
/*Para filtrar os elementos da lista anterior instânciada que comecem com a letra 'A', precisa 
 criar uma nova lista e buscar as informações na de cima, convertendo com o método stream(), pois aceita informações com o lâmbida e
 depois, converte novamente para lista com a função collect(Collectors.toList())
 */
	//O filter é compatível com predicado
		
		//Converte para stream().filter e volta como lista (collect(Collectors.toList())
		
		List<String> result = list.stream().filter(listas -> listas.charAt(0) == 'V').collect(Collectors.toList()); 
	
	System.out.println(result);

	//Encontrar um elemento na lista pelo predicado com o stream().filter e o método findFirst().orElse(null):
		
	String name = list.stream().filter(listas -> listas.charAt(0) == 'V').findFirst().orElse(null);
	
	System.out.println(name);
	
	
	
	
	}
	
	

}
