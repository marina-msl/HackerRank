
import java.util.*;
import java.text.*;

public class P {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();

		String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
		String india = NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment);
		String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
		String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

		//NumberFormat india = NumberFormat.getCurrencyInstance(new Locale);
		
//		String india = india.format(payment);
		
		/*
		 * Locale locale = new Locale("en","IN"); NumberFormat nf =
		 * NumberFormat.getCurrencyInstance(locale);
		 * nf.setCurrency(java.util.Currency.getInstance("INR")); double val = -500.0;
		 * System.out.println(nf.format(val));
		 */
		
		System.out.println("US: " + us);
		System.out.println("India: Rs." + india);
		System.out.println("China: " + china);
		System.out.println("France: " + france);

	}
}
