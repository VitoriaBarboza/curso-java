package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Ex1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		System.out.println("Enter rectangle width and height: ");
		retangulo.width = sc.nextDouble();
		retangulo.height = sc.nextDouble();
		retangulo.areaDoRetangulo();
		System.out.printf("Area do retangulo: %.2f\n", retangulo.areaDoRetangulo());

		retangulo.perimetroDoRetangulo();
		System.out.printf("Perimetro do retangulo: %.2f\n", retangulo.perimetroDoRetangulo());
		
		
		//System.out.println("Insira o valor dos catetos: \n");
		/*retangulo.cateto1 = sc.nextDouble();
		retangulo.cateto2 = sc.nextDouble();	
		*/
		retangulo.hipotenusaDoRetangulo();
		System.out.printf("Diagonal: %.2f\n", retangulo.hipotenusaDoRetangulo());
		
		sc.close();
	}
		
	

}
