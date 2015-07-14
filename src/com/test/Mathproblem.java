package com.test;

import java.util.HashSet;

public class Mathproblem {

	public static void main(String[] args) {
		double r;
		String s;
		int[] a = new int[9];
		for (a[0] = 1; a[0] <= 9; a[0]++) {
			for (a[1] = 1; a[1] <= 9; a[1]++) {
				for (a[2] = 1; a[2] <= 9; a[2]++) {
					for (a[3] = 1; a[3] <= 9; a[3]++) {
						for (a[4] = 1; a[4] <= 9; a[4]++) {
							for (a[5] = 1; a[5] <= 9; a[5]++) {
								for (a[6] = 1; a[6] <= 9; a[6]++) {
									for (a[7] = 1; a[7] <= 9; a[7]++) {
										for (a[8] = 1; a[8] <= 9; a[8]++) {
											HashSet<Integer> set = new HashSet<Integer>();
											for (int i : a)
												set.add(i);
											if (set.size() == 9) {
												r = a[0] + (13 * (double) a[1])
														/ a[2] + a[3]
														+ (12 * a[4]) - a[5]
														- 11 + a[6]
														* ((double) a[7])
														/ a[8] - 10;
												if (r == 66) {
													s = a[0] + "+13*" + a[1]
															+ "/" + a[2] + "+"
															+ a[3] + "+" + 12
															+ "*" + a[4] + "-"
															+ a[5] + "-" + 11
															+ "+" + a[6] + "*"
															+ a[7] + "/" + a[8]
															+ "-10=" + r;
													System.out.println(s);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
