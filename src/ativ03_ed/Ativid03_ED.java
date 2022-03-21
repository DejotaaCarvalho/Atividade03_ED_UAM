package ativ03_ed;

import java.util.*;

public class Ativid03_ED {
	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<>(5);
		Stack<Integer> pilha = new Stack<>();
		Queue<Integer> fila = new LinkedList<>();
		
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		System.out.printf("Lista: %s\nPilha: %s\nFila: %s\n\n", lista, pilha, fila);
		
		while(!lista.isEmpty()) {
			int elemento = lista.remove(0);
			pilha.push(elemento);
			System.out.printf("Lista: %s\nPilha: %s\nFila: %s\n\n", lista, pilha, fila);
		}
		
		while(!pilha.isEmpty()) {
			int elemento = pilha.pop();
			fila.add(elemento);
			System.out.printf("Lista: %s\nPilha: %s\nFila: %s\n\n", lista, pilha, fila);
		}
		
		lista.add(6);
		lista.add(7);
		lista.add(8);
		lista.add(9);
		lista.add(10);
		System.out.println("Inserindo os valores [6, 7, 8, 9, 10] na lista");
		System.out.printf("Lista: %s\nPilha: %s\nFila: %s\n\n", lista, pilha, fila);
		
		while(!lista.isEmpty()) {
			int elemento = lista.remove(0);
			pilha.push(elemento);
			System.out.printf("Lista: %s\nPilha: %s\nFila: %s\n\n", lista, pilha, fila);
		}
		
		while(!pilha.isEmpty()) {
			int elemento = pilha.pop();
			fila.add(elemento);
			System.out.printf("Lista: %s\nPilha: %s\nFila: %s\n\n", lista, pilha, fila);
		}
		System.out.println("Fila final: "+fila);
	}
	
	
}
