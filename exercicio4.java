package Familia41;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
int A,B,C,R,S,D;
		
		System.out.println("\nDigite o valor de A: ");
		A=leia.nextInt();
		System.out.println("\nDigite o valor de B: ");
		B=leia.nextInt();
		System.out.println("\nDigite o valor de C: ");
		C=leia.nextInt();
		
		R=(int) Math.pow((A+B), 2);
		S=(int) Math.pow((B+C), 2);
		D=(R+S)/2;
		
		System.out.println("\nValor de R = "+R);
		System.out.println("\nValor de S = "+S);
		System.out.println("\nValor de D = "+D);

	}

}
