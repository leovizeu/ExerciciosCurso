package Triangulo;

import java.util.Locale;
import java.util.Scanner;
public class Calculo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo ();
		
		System.out.println("Diga as medidas do Triângulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Diga as medidas do Triângulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Área do Triângulo X: %.4f%n", areaX);
		System.out.printf("Área do Triângulo Y: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("A área do Triângulo X é maior!");
		}
		else
			System.out.println("A área do Triângulo Y é maior!");
	}
}
