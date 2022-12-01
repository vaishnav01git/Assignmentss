package OOPS_7;

import java.util.Scanner;

public class TestMain7 {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter first String");

		String str1 = scanner.nextLine();

		System.out.println("Enter Second String");

		String str2 = scanner.nextLine();

		Test t = new Test();
		t.stringCompare(str1, str2);

	}

}
