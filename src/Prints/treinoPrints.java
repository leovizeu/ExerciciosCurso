package Prints;

import java.util.Locale;

public class treinoPrints {
	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office desk";
		String name = "Vizeu";

		int age = 32;
		int code = 5290;
		char gender = 'M';

		double price1 = 150.0;
		double price2 = 650.0;
		double measure = 53.234567;

		System.out.println("Products: ");
		System.out.printf("%s, which price is $%.3f%n", product1, price2);
		System.out.printf("%s, which price is $%.3f%n", product2, price1);
		System.out.printf("Record: %s, age %d%n", name, age);
		System.out.printf("%s with eight decimal places: %f%n", measure, measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US Decimal point: %.3f%n", measure);
	}
}