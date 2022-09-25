package lista;

import java.util.Random;
/*Fazer um algoritmo que percorre um vetor de 100 números, calcular e escrever se
cada número é positivo ou negativo, e múltiplo ou não de 3, ao mesmo tempo. Como
Reposta: preencher os seguintes vetores
a) Números positivos múltiplos de 3
b) Números positivos não múltiplos de 3
c) Números negativos múltiplos de 3
d) Números negativos não múltiplos de 3*/
public class Exercício3 {

	public static void main(String[] args) {
		Random aleatorio=new Random();
		int [] vetor;
		vetor=new int[100];
		int posMultiplo3=0;
		int positivo=0;
		int negMultiplo3=0;
		int negativo=0;
		for(int i=0;i<vetor.length;i++) {
			vetor[i]=aleatorio.nextInt();
			if(vetor[i]>=0) {
				if(vetor[i]%3==0) {
					posMultiplo3++;
				}
				else {
					positivo++;
				}
			}
			if(vetor[i]<0) {
				if(vetor[i]%3==0) {
					negMultiplo3++;
				}
				else {
					negativo++;
				}
			}
		}
		int vetorPosMultiplo3[]=new int[posMultiplo3];
		int vetorPositivo[]=new int[positivo];
		int vetorNegMultiplo3[]=new int[negMultiplo3];
		int vetorNegativo[]=new int[negativo];
		for(int i=0,j=0;i<vetor.length;i++) {
			if(vetor[i]>=0) {
				if(vetor[i]%3==0) {
					vetorPosMultiplo3[j]=vetor[i];
					j++;
				}
			}
		}
		for(int i=0,j=0;i<vetor.length;i++) {
			if(vetor[i]>=0) {
				if(vetor[i]%3!=0){ 
					vetorPositivo[j]=vetor[i];
					j++;
				}
			}
		}
		for(int i=0,j=0;i<vetor.length;i++) {
			if(vetor[i]<0) {
				if(vetor[i]%3==0) {
					vetorNegMultiplo3[j]=vetor[i];
					j++;
				}
			}
		}
		for(int i=0,j=0;i<vetor.length;i++) {
			if(vetor[i]<0) {
				if(vetor[i]%3!=0) {
					vetorNegativo[j]=vetor[i];
					j++;
				}
			}
		}
		System.out.println("NÚMEROS POSITIVOS E MÚLTIPLOS DE 3");
		for(int i=0;i<vetorPosMultiplo3.length;i++) {
			System.out.println(vetorPosMultiplo3[i]);
		}
		System.out.println("NÚMEROS POSITIVOS E NÃO MÚLTIPLOS DE 3");
		for(int i=0;i<vetorPositivo.length;i++) {
			System.out.println(vetorPositivo[i]);
		}
		System.out.println("NÚMEROS NEGATIVOS E MÚLTIPLOS DE 3");
		for(int i=0;i<vetorNegMultiplo3.length;i++) {
			System.out.println(vetorNegMultiplo3[i]);
		}
		System.out.println("NÚMEROS NEGATIVOS E NÃO MÚLTIPLOS DE 3");
		for(int i=0;i<vetorNegativo.length;i++) {
			System.out.println(vetorNegativo[i]);
		}
	}
}
