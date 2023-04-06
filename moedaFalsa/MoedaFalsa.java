package moedaFalsa;

import java.util.Scanner;

public class MoedaFalsa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double pesoMoeda1, pesoMoeda2, pesoMoeda3, pesoMoeda4, pesoMoeda5;
	
		System.out.print("Peso moeda 1: ");
		pesoMoeda1 = sc.nextDouble();
		System.out.print("Peso moeda 2: ");
		pesoMoeda2 = sc.nextDouble();
		System.out.print("Peso moeda 3: ");
		pesoMoeda3 = sc.nextDouble();
		System.out.print("Peso moeda 4: ");
		pesoMoeda4 = sc.nextDouble();
		System.out.print("Peso moeda 5: ");
		pesoMoeda5 = sc.nextDouble();
		
		if ((pesoMoeda1 + pesoMoeda2) == (pesoMoeda3 + pesoMoeda4)) {
			System.out.println("Moeda 5 é falsa");
	    }
		else if ((pesoMoeda1 + pesoMoeda2) < (pesoMoeda3 + pesoMoeda4)) {
			if (pesoMoeda1 > pesoMoeda2) 
				System.out.println("Moeda 2 é falsa");
			else 
				System.out.println("Moeda 1 é falsa");
		} 
		else {
			if  (pesoMoeda3 > pesoMoeda4) 
				System.out.println("Moeda 4 é falsa");
			else 
				System.out.println("Moeda 3 é falsa");
		}
		
		sc.close();
	}
	
}
