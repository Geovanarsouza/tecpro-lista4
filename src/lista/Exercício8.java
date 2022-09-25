package lista;

import java.util.Scanner;

/*Para realizar chamadas, onde geralmente são mostradas somente as teclas para os
números, as letras são organizadas dentro de grupos para cada número. Assim
como na Figura 1 a seguir.Faça um programa em java que receba um número de telefone com letras e símbolos, e
decodifique as letras para o número correspondente de acordo com a imagem. Por
exemplo: 08899334GX##, se tornará: (088)993344911. Lembre-se de colocar os
parênteses, para os três primeiros números que são o DDD.*/
public class Exercício8 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Informe o número de telefone: ");
		String telefone=input.nextLine();
		telefone.toLowerCase();
		System.out.println(descodificar(telefone));
	}
	public static String descodificar(String tell) {
		for(int i=0;i<tell.length();i++) {
			if(tell.charAt(i)=='#') {
				tell=tell.replace(tell.charAt(i), '1');
			}
			if(tell.charAt(i)=='a' || tell.charAt(i)=='b' || tell.charAt(i)=='c' ) {
				tell=tell.replace(tell.charAt(i), '2');
			}
			if(tell.charAt(i)=='d' || tell.charAt(i)=='e' || tell.charAt(i)=='f' ) {
				tell=tell.replace(tell.charAt(i), '3');
			}
			if(tell.charAt(i)=='g' || tell.charAt(i)=='h' || tell.charAt(i)=='i' ) {
				tell=tell.replace(tell.charAt(i), '4');
			}
			if(tell.charAt(i)=='j' || tell.charAt(i)=='k' || tell.charAt(i)=='l' ) {
				tell=tell.replace(tell.charAt(i), '5');
			}
			if(tell.charAt(i)=='m' || tell.charAt(i)=='n' || tell.charAt(i)=='o' ) {
				tell=tell.replace(tell.charAt(i), '6');
			}
			if(tell.charAt(i)=='p' || tell.charAt(i)=='q' || tell.charAt(i)=='r' || tell.charAt(i)=='s') {
				tell=tell.replace(tell.charAt(i), '7');
			}
			if(tell.charAt(i)=='t' || tell.charAt(i)=='u' || tell.charAt(i)=='v' ) {
				tell=tell.replace(tell.charAt(i), '8');
			}
			if(tell.charAt(i)=='w' || tell.charAt(i)=='x' || tell.charAt(i)=='y' || tell.charAt(i)=='z') {
				tell=tell.replace(tell.charAt(i), '9');
			}
			if(tell.charAt(i)=='+') {
				tell=tell.replace(tell.charAt(i), '0');
			}
		}
		return tell;
	}
}

