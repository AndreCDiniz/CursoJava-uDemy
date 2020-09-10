package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
			
		List<String> list = new ArrayList<>(); //Como instanciar uma lista.
		
		list.add("Andre"); //como adicionar na lista.
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		list.add(2, "Marco"); //como adicionar na posição desejada. Lembrando que a lista começa em 0.
				
		System.out.println(list.size()); //mostrar o tamanho da lista. 
		
		list.remove("Ana"); //removendo da lista.
		list.remove(1); // removendo a posição desejada.
		
		System.out.println("------------------------------");
		
		list.removeIf(x -> x.charAt(0) == 'M' ); //como remover da lista utilizando um predicado (lambda) iniciando com uma letra.
		
		for (String x : list) { //como percorrer a lista utilizando o for each. 
			System.out.println(x); // imprimindo o resultado.
		}
		
		System.out.println("------------------------------");
		
		System.out.println("Index of Bob: " + list.indexOf("Bob")); //como retornar em qual posição o nome está. 
		System.out.println("Index of Bob: " + list.indexOf("Marco")); //se não existir na lista ele retornará -1
		
		System.out.println("------------------------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); //como filtrar a lista começando por uma letra desejada. apenas no java 8 em diante.
		
		for (String x : result) {
			System.out.println(x); //imprimindo o resultado.
		}

		System.out.println("------------------------------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null); // como filtrar da lista o primeiro nome iniciado com A se não existir irá retornar null.
		System.out.println(name);
	
	}

}
