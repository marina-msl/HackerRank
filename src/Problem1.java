import java.util.Scanner;

class Problem1 {
	public static void main(String[] argh) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		int intPositive = (int) Math.pow(2, 32);
		int intNegative = -(intPositive) - 1;
		System.out.println("inteiros: " + intPositive + ", " + intNegative);
		long longPositive = (long) Math.pow(2, 64);
		long longNegative = -(longPositive) - 1;
		System.out.println("Longs: " + longPositive + ", " + longNegative);

		for (int i = 0; i < t; i++) {

			try {
				long x = sc.nextLong();
				System.out.println(x + " can be fitted in:");
				if (x >= -128 && x <= 127) {
					System.out.println("* byte");
				}
				if (x >= -32768 && x <= 32767) {
					System.out.println("* short");
				}
				if (x >= intNegative && x <= intPositive) {

					System.out.println("* int");
				}
				if (x >= longNegative && x <= longPositive) {
					System.out.println("* long");
				}

			} catch (Exception e) {
				System.out.println(sc.next() + " can't be fitted anywhere.");
			}

			sc.close();
		}
	}
}
