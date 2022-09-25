package lista;

import java.util.Scanner;

/*Criar um programa que receba um vetor com nomes e retorne quais letras são
vogais e quais são as consoantes para cada nome. Usar uma função que verifica se
é uma vogal ou consoante.*/
public class Exercício4 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		String nome;
		System.out.println("Informe o nome que deseja verificar as vogais e consoantes: ");
		nome=input.nextLine();
		nome.toLowerCase();
		vogalConsoante(nome);
	}
	public static void vogalConsoante(String msg) {
		for(int i=0;i<msg.length();i++) {
			if(msg.charAt(i)=='a' || msg.charAt(i)=='e' || msg.charAt(i)=='i' || msg.charAt(i)=='o' ||
			msg.charAt(i)=='u') {
				System.out.println(msg.charAt(i)+" é vogal");
			}
			else {
				if(msg.charAt(i)!=' ') {
					System.out.println(msg.charAt(i)+" é consoante");
				}
			}
		}
	}

}
