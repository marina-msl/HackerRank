import java.util.Arrays;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-string-reverse/problem?isFullScreen=true

public class Palindrome {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		String A = sc.next();
		
		int stringASize = A.length();
		char arrStringA[] = new char[stringASize];
		char arrStringB[] = new char[stringASize];


		for (int i=0; i<stringASize; i++) { 
		  arrStringA[i] = A.charAt(i); 
		 }
		
		for (int i=0; i<stringASize; i++) {
			arrStringB[i] = A.charAt((stringASize-1) - i);
		}
	
		if(Arrays.equals(arrStringA, arrStringB)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		sc.close();
	}
}
