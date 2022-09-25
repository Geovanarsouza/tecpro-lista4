package lista;

import java.util.Scanner;

/*O conceito da Álgebra para um número de Armstrong diz que: é um número de n
dígitos que é igual a soma de cada um dos seus dígitos elevado a n-ésima potência .
Por exemplo, 153 (n = três dígitos) é igual a 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
Faça um programa em Java que verifique se um número, de n dígitos, é um número de
Armstrong.*/
public class Exercício10 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int soma=0;
		System.out.println("Informe a quantidade de dígitos do seu número: ");
		int potência=input.nextInt();
		System.out.println("Informe o número que deseja verificar:");
		int numero=input.nextInt();
		System.out.println("AGORA,VOCÊ DEVE INFORMAR CADA DÍGITO DO NÚMERO DA ESQUERDA PARA A DIREITA");
		int[] vetorDigitos;
		vetorDigitos=new int[potência];
		for(int i=0;i<potência;i++) {
			System.out.println("Infome o "+(i+1)+" dígito do número:");
			vetorDigitos[i]=input.nextInt();
		}
		for(int i=0;i<potência;i++) {
			vetorDigitos[i]=(int) Math.pow(vetorDigitos[i], potência);
		}
		for(int i=0;i<potência;i++) {
			soma+=vetorDigitos[i];
		}
		if(soma==numero) {
			System.out.println(numero+" É UM NÚMERO DE ARMSTRONG");
		}
		else {
			System.out.println(numero+" NÃO É UM NÚMERO DE ARMSTRONG");
		}
	}

}
