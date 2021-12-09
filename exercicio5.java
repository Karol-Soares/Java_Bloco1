package Familia41;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		float n1,n2,n3, media;
		
		System.out.println("\nDigite a primeira nota: ");
		n1 = leia.nextFloat();
		System.out.println("\nDigite a segunda nota: ");
		n2 = leia.nextFloat();
		System.out.println("\nDigite a terceira nota: ");
		n3 = leia.nextFloat();
		
		media = (n1+n2+n3) / 3;
		
		System.out.println("\nA media da sua nota é: "+media);

	}
 
}
