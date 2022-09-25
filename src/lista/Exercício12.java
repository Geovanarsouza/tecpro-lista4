package lista;
import java.util.Scanner;
/*12) Faça uma releitura da impressão de algumas bandeiras dos países da Copa do
Mundo 2022 de futebol. O número de linhas e colunas sempre devem ser sempre
iguais. Mas o usuário pode escolher o valor de linha e coluna para cada bandeira e o
desenho deverá ser mantido.
Para desenhar cada bandeira você deverá utilizar uma função para desenhar o
caractere *, outra função para desenhar o caractere & e outra função para desenhar
 o caractere % */
public class Exercício12 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Informe o valor para as linhas e colunas: ");
		int linhas_e_colunas=input.nextInt();
		System.out.println("Alemanha");
		int divisao=linhas_e_colunas/3;
		int centro=linhas_e_colunas/2+1;
		for(int i=1;i<=linhas_e_colunas;i++) {
			for(int j=1;j<=linhas_e_colunas;j++) {
				if(i<=divisao) {
					asterisco();
				}
				if(i<=(2*divisao) && i>divisao) {
					porcento();
				}
				if(i>(2*divisao) && i<=linhas_e_colunas) {
					e();
				}
			}
			System.out.print("\n");
		}
		System.out.println("Argentina");
		for(int i=1;i<=linhas_e_colunas;i++) {
			for(int j=1;j<=linhas_e_colunas;j++) {
				if(i<=divisao) {
					asterisco();
				}
				if(i>divisao && i<=(2*divisao) && j>divisao && j<=(2*divisao)){
					if(i==j && i==centro && j==centro){
						asterisco();
					}
					else {
						e();
					}
				}
				if(i>(2*divisao) && i<=linhas_e_colunas) {
					asterisco();
				}
				if(i<=(2*divisao) && i>divisao && j<=divisao){
					porcento();
				}
				if(i<=(2*divisao) && i>divisao && j>(2*divisao) && j<=linhas_e_colunas) {
					porcento();
				}
				
			}
			System.out.print("\n");
		}
		System.out.println("Bélgica");
		for(int i=1;i<=linhas_e_colunas;i++) {
			for(int j=1;j<=linhas_e_colunas;j++) {
				if(j<=divisao) {
					asterisco();
				}
				if(j>divisao && j<=(2*divisao)) {
					e();
				}
				if(j>(2*divisao) && j<=linhas_e_colunas) {
					porcento();
				}
			}
			System.out.print("\n");
		}
		System.out.println("Inglaterra");
		for(int i=1;i<=linhas_e_colunas;i++) {
			for(int j=1;j<=linhas_e_colunas;j++) {
				if(i<=divisao && j<=divisao) {
					asterisco();
				}
				if(i<=divisao && j>divisao && j<=(2*divisao)) {
					e();
				}
				if(i<=divisao && j>(2*divisao) && j<=linhas_e_colunas) {
					asterisco();
				}
				if(i>divisao && i<=(2*divisao)) {
					e();
				}
				if(i>(2*divisao) && i<=linhas_e_colunas && j<=divisao) {
					asterisco();
				}
				if(i>(2*divisao) && i<=linhas_e_colunas && j>divisao && j<=(2*divisao)) {
					e();
				}
				if(i>(2*divisao) && i<=linhas_e_colunas && j>(2*divisao) && j<=linhas_e_colunas) {
					asterisco();
				}		
			}
			System.out.print("\n");
		}
		System.out.println("USA");
		for(int i=1;i<=linhas_e_colunas;i++) {
			for(int j=1;j<=linhas_e_colunas;j++) {
				if(i<=divisao+1 && j<=divisao) {
					asterisco();
				}
				if(j>divisao && (i+1)%2==0 && i<=(divisao+1)) {
					cifrão();
				}
				if(j>divisao && (i%2)==0 && i<=(divisao+1)) {
					e();
				}
				if(i>(divisao+1) && i<=linhas_e_colunas && (i+1)%2==0 && j<=linhas_e_colunas) {
					cifrão();
				}
				if(i>(divisao+1) && i<= linhas_e_colunas && (i%2)==0 && j<=linhas_e_colunas) {
					e();
				}
			}
			System.out.print("\n");
		}
		System.out.println("Japão");
		for(int i=1;i<=linhas_e_colunas;i++) {
			for(int j=1;j<=linhas_e_colunas;j++) {
				if(i<divisao && j<=linhas_e_colunas) {
					asterisco();
				}
				if(i>=divisao && i<=(2*divisao)+1 && j<divisao) {
					asterisco();
				}
				if(i>=divisao && i<=(2*divisao)+1 && j>=divisao && j<=(2*divisao)+1) {
					e();
				}
				if(i>=divisao && i<=(2*divisao)+1 && j>(2*divisao)+1 && j<=linhas_e_colunas) {
					asterisco();
				}
				if(i>(2*divisao)+1 && i<=linhas_e_colunas) {
					asterisco();
				}
			}
			System.out.print("\n");
		}
	}
	public static void asterisco() {
		System.out.print("*");
	}
	public static void porcento() {
		System.out.print("%");
	}
	public static void e() {
		System.out.print("&");
	}
	public static void cifrão() {
		System.out.print("$");
	}
}
