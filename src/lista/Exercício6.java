package lista;

import java.util.Scanner;

/*Um determinado material radioativo perde metade de sua massa a cada 50
segundos. Dada a massa inicial, em gramas, fazer um programa em Java que
calcule o tempo necessário para que essa massa se torne menor que 0,5 grama. O
programa em Java deve escrever a massa inicial, a massa final e o tempo calculado
em horas, minutos e segundos.*/
public class Exercício6 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Informe a massa do material radioativo em grama : ");
		float massa=input.nextFloat();
		int tempo=50*calculo(massa);
		float segundo=0;
		int minuto=0;
		int hora=0;
		if(tempo<60) {
			System.out.println(tempo+" segundos");
		}
		if(tempo<3600 && tempo>=60) {
			minuto=tempo/60;
			segundo=tempo-(minuto*60);
			System.out.println(hora+" horas "+minuto+" minutos e "+segundo+" segundos");
		}
		if(tempo>=3600) {
			hora=tempo/60;
			minuto=tempo-(hora*60);
			System.out.println(hora+" horas, "+minuto+ " minutos e "+segundo+" segundos");
		}
	}
	public static int calculo(float massa) {
		int quantidade=0;
		while(massa>=0.5) {
			massa=massa/2;
			quantidade++;
		}
		return quantidade;
	}
	public static float massa(float massa) {
		int quantidade=0;
		while(massa>=0.5) {
			massa=massa/2;
		}
		return massa;
	}
}
