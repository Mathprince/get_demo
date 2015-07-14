package com.test;

public class Magic {
	public static void main(String[] args) {
		final int SIZE = 3; // 这里就是你自定义的阶数
		int mat[][] = new int[SIZE][SIZE];
		int i = 0, j, k, n;
		n = SIZE;
		j = n / 2;
		for (k = 1; k <= n * n; k++) {
			mat[i][j] = k;
			if (k % n == 0) {
				i = (i + 1) % n;
			} else {
				i = (i - 1 + n) % n;
				j = (j + 1) % n;
			}
		}
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++)
				System.out.print(mat[i][j] + "\t");
			System.out.println();
		}
	}
}
