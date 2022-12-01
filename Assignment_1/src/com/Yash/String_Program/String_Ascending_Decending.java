// WAP to print all the alphabets of strings in ascending and descending  order.
package com.Yash.String_Program;

public class String_Ascending_Decending {
	
	
		public static void main(String[] args) {       

				
				 String Name = "Akzzzshay";
				 char a[] = Name.toCharArray();
				 System.out.println("The String characters in ascending orders are :");
				 for (int i = 0; i < a.length; i++) {
					 for (int j = i + 1; j < a.length; j++) {
						 if (a[i] > a[j]) {
							 char temp = a[i];
							 a[i] = a[j];
							 a[j] = temp;
						 }
					 }
					 System.out.print(a[i] + " ");
				 }
					 System.out.println(" ");
					 System.out.println("The String characters in descending orders are :");
					 for (int i = 0; i < a.length; i++) {
						 for (int j = i + 1; j < a.length; j++) {
							 if (a[i] < a[j]) {
								 char temp = a[i];
								 a[i] = a[j];
								 a[j] = temp;
							 }
						 }
						 System.out.print(a[i] + " ");
					 }
					 

		}
	}


