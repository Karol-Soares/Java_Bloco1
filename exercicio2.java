package Familia41;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
int anos,meses,totalDias,dias;
		
		System.out.println("\nDigite sua idade em dias: ");
		totalDias=leia.nextInt();
		
		anos = totalDias/365;
		meses = (totalDias%365)/30;
		dias = meses*30;
		
		System.out.println("\nVocê viveu "+anos+" anos, "+meses+" meses e "+dias+" dias.");

	}

}
