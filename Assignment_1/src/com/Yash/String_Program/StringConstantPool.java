/*6.	WAP to demonstrate how memory is allocated to string objects in 
memory heap and string constant pool.
*/
package com.Yash.String_Program;

public class StringConstantPool {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";

		String s3 = new String("pqr");
		String s4 = new String("pqr");
		// Note that this == compares whether
		// s1 and s2 refer to same object or not

		// scp
		if (s1 == s2)
			System.out.println("Yes");
		else
			System.out.println("No");

		// Heap
		if (s3 == s4)
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}
