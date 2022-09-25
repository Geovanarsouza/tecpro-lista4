package lista;

import java.util.Scanner;

/*Faça o seguinte programa:
● Receba 3 vetores e mostre para cada vetor: a soma, o produto e a média dos
elementos de cada vetor,
● Depois gere um vetor que tenha a soma de todas as somas computadas, outro vetor
com o produto de todas as produtos computados e por fim um terceiro que tenha
todas as médias computadas.
● Calcule a soma do vetor que contém todas as somas, calcule a média do vetor que
contém todas as médias e calcule o produto do vetor que contém todos os produtos
calculados.
● Você deverá fazer essa questão com algumas funções e reaproveitar as funções
criadas para ser utilizadas em partes distintas do algoritmo descrito nesta questão*/
public class Exercício5 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		float[] vetor1;
		float[] vetor2;
		float[] vetor3;
		System.out.print("Informe o tamaho do primeiro vetor: ");
		int tamanho1=input.nextInt();
		vetor1=new float[tamanho1];
		System.out.print("Informe o tamaho do segundo vetor: ");
		int tamanho2=input.nextInt();
		vetor2=new float[tamanho2];
		System.out.print("Informe o tamaho do terceiro vetor: ");
		int tamanho3=input.nextInt();
		vetor3=new float[tamanho3];
		for(int i=0;i<vetor1.length;i++) {
			System.out.println("Informe o "+(i+1)+" elemento do primeiro vetor:");
			vetor1[i]=input.nextInt();
		}
		for(int i=0;i<vetor2.length;i++) {
			System.out.println("Informe o "+(i+1)+" elemento do segundo vetor:");
			vetor2[i]=input.nextInt();
		}
		for(int i=0;i<vetor3.length;i++) {
			System.out.println("Informe o "+(i+1)+" elemento do terceiro vetor:");
			vetor3[i]=input.nextInt();
		}
		System.out.print("PRIMEIRO VETOR");
		System.out.print("\t\tSEGUNDO VETOR");
		System.out.println("\t\tTERCEIRO VETOR");
		System.out.print("soma: "+soma(vetor1));
		System.out.print("\t\tsoma: "+soma(vetor2));
		System.out.println("\t\tsoma: "+soma(vetor3));
		System.out.print("produto: "+produto(vetor1));
		System.out.print("\t\tproduto: "+produto(vetor2));
		System.out.println("\t\tproduto: "+produto(vetor3));
		System.out.print("média: "+media(vetor1));
		System.out.print("\t\tmédia: "+media(vetor2));
		System.out.println("\t\tmédia: "+media(vetor3));
		float[] todasSomas= {soma(vetor1),soma(vetor2),soma(vetor3)};
		float[] todasMedias= {media(vetor1),media(vetor2),media(vetor3)};
		float[] todosProdutos= {produto(vetor1),produto(vetor2),produto(vetor3)};
		System.out.println("Soma de todas as soma: "+soma(todasSomas));
		System.out.println("Média de todas as médias: "+media(todasMedias));
		System.out.println("Produto de todos os produtos: "+produto(todosProdutos));
	}
	public static float soma(float[] num) {
		float soma=0;
		for(int i=0;i<num.length;i++) {
			soma+=num[i];
		}
		return soma;
	}
	public static float produto(float[] num) {
		float produto=1;
		for(int i=0;i<num.length;i++) {
			produto*=num[i];
		}
		return produto;
	}
	public static float media(float[] num) {
		float media=soma(num)/num.length;
		return media;
	}
	

}
