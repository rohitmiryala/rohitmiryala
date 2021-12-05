package stringhandling;

import java.util.*;

public class Occurance {

	static void logic() {
		Scanner as = new Scanner(System.in);
		System.out.println("Enter :");
		String str = as.next().toUpperCase();
		int arr[] = new int[100];
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				arr[str.charAt(i) - 65]++;
			}
		}
		for (int i = 0; i < 26; i++) {
			if (arr[i] > 0) {
				System.out.println((char) (i + 65) + "-" + arr[i]);
			}
		}
	}

	public static void main(String[] args) {
		Occurance.logic();
	}
}
