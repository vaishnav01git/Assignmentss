package com.Yash.Array_Program;

//User will enter the element in M*M order matrix that is
//square matrix now you have to print first row, last row,
//first column, and last column elements.
//Code should be applicable for matrix of any order.
public class SquareMatrix_9 {
	public static void main(String[] args) {
		int n = 3;
		int a[][] = { { 1, 2, 3 }, { 5, 6, 7 }, { 9, 10, 11 } };
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i != 0 && j != 0) && (i != n - 1 && j != n - 1)) {
					System.out.print(" ");
					continue;
				}
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
}
