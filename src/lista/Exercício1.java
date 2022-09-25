package lista;

import java.util.Scanner;

/*Desenvolver um algoritmo que determine o imposto de renda cobrado de um
funcionário pelo governo. Seu programa deverá ler o valor do salário mínimo, o
número de dependentes, o salário do funcionário e a taxa de imposto normal que já
foi paga pelo funcionário. O imposto bruto é:
● 20% do salário do funcionário se o funcionário ganha mais de 12 salários
mínimos;
● 8% do salário do funcionário se o funcionário ganha mais de 5 salários
mínimos e
● Quem ganha menos ou igual de 5 salários mínimos não é cobrado o imposto
de renda.
Obs.: A cada número de dependentes, ganha 2% de restituição.
Obs.: Sabe-se que o governo cobra 4% de taxa adicional sobre o IMPOSTO BRUTO.*/
public class Exercício1 {

	public static void main(String[] args) {
		float salario_minimo;
		int numero_de_dependentes;
		float salario_funcionario;
		float taxa_de_imposto_normal;
		float imposto_bruto = 0;
		int retistuicao;
		float taxa_adicional;
		Scanner input= new Scanner(System.in);
		System.out.println("Informe o atual valor do salário mínimo:");
		salario_minimo=input.nextFloat();
		System.out.println("Informe o número de dependentes: ");
		numero_de_dependentes=input.nextInt();
		System.out.println("Informe o sálario do funcionário: ");
		salario_funcionario=input.nextFloat();
		System.out.println("Informe a taxa de imposto normal ja paga pelo funcionário: ");
		taxa_de_imposto_normal=input.nextFloat();
		if(salario_funcionario/salario_minimo>12) {
			imposto_bruto=((salario_funcionario*20)/100);
			}
		if(salario_funcionario/salario_minimo>5 && salario_funcionario/salario_minimo<=12) {
			imposto_bruto=((salario_funcionario*8)/100);
		}
		if(salario_funcionario/salario_minimo<=5) {
			imposto_bruto=0;
		}
		retistuicao=2*numero_de_dependentes;
		taxa_adicional=((imposto_bruto*4)/100);
		imposto_bruto+=((imposto_bruto*retistuicao)/100);
		imposto_bruto+=taxa_adicional;
		System.out.println("O imposto de renda é: "+imposto_bruto);
	}

}
