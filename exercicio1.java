package Familia41;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int anos,meses,dias,totalDias;
		
		System.out.println("\nDigite quantos anos viveu: ");
		anos=leia.nextInt();
		System.out.println("\nDigite quantos meses viveu: ");
		meses=leia.nextInt();
		System.out.println("\nDigite quantos dias viveu: ");
		dias=leia.nextInt();
		
		totalDias = anos*365 + meses*30 + dias;
		
		System.out.println("\nVocê viveu: "+totalDias+" dias");
		
		

	}

}
