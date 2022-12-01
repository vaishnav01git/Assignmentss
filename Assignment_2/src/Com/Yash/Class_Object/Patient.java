package Com.Yash.Class_Object;

import java.util.Scanner;

public class Patient {

	double Bmi;

	public double computeBMI() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of patient");
		String pName = sc.next();
		// System.out.println(pName);

		System.out.println("enter Height of patient");
		double pHeight = sc.nextDouble();
		// System.out.println(pHeight);

		System.out.println("enter Weight of patient");
		double pWeight = sc.nextDouble();
		// System.out.println(pWeight);

		System.out.println("Patient Name is " + pName);
		System.out.println("Patient  Height is" + pHeight);
		System.out.println("Patient Weight is " + pWeight);

		Bmi = (pWeight) / (pHeight * pHeight);

		return Bmi;

	}

	public static void main(String[] args) {

		Patient p = new Patient();
		double bmi = p.computeBMI();
		System.out.println("Patient BMI Report is = " + bmi);

	}
}
