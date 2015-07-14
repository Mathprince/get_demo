package com.test;

public class mathproblem {

	public static void main(String[] args) {
		double r = 0;
		String s = "";
		for (int a1 = 1; a1 <= 9; a1++) {
			for (int a2 = 1; a2 <= 9; a2++) {
				for (int a3 = 1; a3 <= 9; a3++) {
					for (int a4 = 1; a4 <= 9; a4++) {
						for (int a5 = 1; a5 <= 9; a5++) {
							for (int a6 = 1; a6 <= 9; a6++) {
								for (int a7 = 1; a7 <= 9; a7++) {
									for (int a8 = 1; a8 <= 9; a8++) {
										for (int a9 = 1; a9 <= 9; a9++) {
											r = a1
													+ (13 * ((double) a2) / a3)
													+ a4
													+ (12 * a5)
													- a6
													- 11
													+ (((double) a7)
															* ((double) a8) / a9)
													- 10;
											if (r == 66) {
												s = a1 + "+13*" + a2 + "/" + a3
														+ "+" + a4 + "+" + 12
														+ "*" + a5 + "-" + a6
														+ "-" + 11 + "+" + a7
														+ "*" + a8 + "/" + a9
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
