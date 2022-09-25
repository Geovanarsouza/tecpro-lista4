package lista;

import java.util.Scanner;

/*Escreva um programa Java para reverter uma string sem usar o método reverse da
classe String.*/
public class Exercício7 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Informe a string que deseja reverter: ");
		String nome=input.nextLine();
		int i=nome.length();
		while(i>0) {
			System.out.print(nome.charAt(i-1));
			i--;
		}
	}
}
