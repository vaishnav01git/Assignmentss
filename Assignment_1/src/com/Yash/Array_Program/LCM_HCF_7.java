//	WAP to find the LCM and HCF of array numbers.
package com.Yash.Array_Program;

public class LCM_HCF_7 {
	static int quotient = 0;

	public static void main(String[] args) {

		int a[] = { 60, 72, 90, 50, 80 };
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {
				int temp;
				int temp1 = a[i];
				int temp2 = a[j];

				while (temp2 != 0) {
					temp = temp2;
					temp2 = temp1 % temp2;
					temp1 = temp;
				}
				int hcf = temp1;
				int lcm = (a[i] * a[j]) / hcf;
				System.out.println("The HCF of the given number " + a[i] + " and " + a[j] + "=" + hcf);
				System.out.println("The LCM of the given number " + a[i] + " and " + a[j] + "=" + lcm);
			}
		}
	}
}