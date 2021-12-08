package Familia41;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
int totalSegundos, horas, minutos, segundos;
		
		System.out.println("\nDigite a quantidade de segundos de duração: ");
		totalSegundos= leia.nextInt();
		
		horas = totalSegundos/3600;
		minutos = (totalSegundos-(horas*3600))/60;
		segundos = (totalSegundos%60);
		
		System.out.println("\nO evento durou "+horas+" horas, "+minutos+" minutos e"+segundos+" segundos.");
		
		
	}

}
