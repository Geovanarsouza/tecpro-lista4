package lista;

import java.util.Scanner;

/*Um aluguel de ferramentas tem a seguinte regra para aluguel.
● As segundas, terças e quintas: um desconto de 40% em cima do preço normal;
● Às quartas, sextas, sábados e domingos: preço normal;
● Aluguel de ferramentas comuns: preço normal e ferramentas novas: acréscimo de
15% em cima do preço normal.
Obs.: O dia da semana deve ser tratado como String.*/
public class Exercício2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String dia;
		int tipoFerramenta;
		float preçoNormal;
		float desconto40;
		float acréscimo15;
		do {
			System.out.println("Informe o dia de hoje: ");
			dia=input.nextLine();
			dia.toLowerCase();
		}while(dia.equals("segunda")==false && dia.equals("terça")==false &&
		dia.equals("quarta")==false && dia.equals("quinta")==false &&
		dia.equals("sexta")==false && dia.equals("sabado")==false &&
		dia.equals("sábado")==false && dia.equals("domingo")==false);
		System.out.println("TIPOS DE FERRAMENTA:");
		System.out.println("	1.COMUM");
		System.out.println("	2.NOVA");
		do {
			System.out.println("Informe o tipo de ferramenta,inserindo 1 para COMUM e 2 para NOVA");
			tipoFerramenta=input.nextInt();
		}while(tipoFerramenta!=1 && tipoFerramenta!=2);
		System.out.println("Informe o preço normal da ferramenta: ");
		preçoNormal=input.nextInt();
		desconto40=(preçoNormal*40)/100;
		acréscimo15=(preçoNormal*15)/100;
		if(dia.equals("segunda") || dia.equals("terça") || dia.equals("quinta")) {
			preçoNormal-=desconto40;
			if(tipoFerramenta==2) {
				preçoNormal+=acréscimo15;
			}
		}
		if(dia.equals("quarta") || dia.equals("sexta") || dia.equals("sabado") ||
		dia.equals("sádado") || dia.equals("domingo")) {
			if(tipoFerramenta==2) {
				preçoNormal+=acréscimo15;
			}
		}
		System.out.println("O preço da ferramenta é: "+preçoNormal);
	}
}

