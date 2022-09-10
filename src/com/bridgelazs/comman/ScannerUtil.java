package com.bridgelazs.comman;

import java.util.Scanner;

public class ScannerUtil {

	private static Scanner scanner = new Scanner(System.in);
	
	public static String getString(String message) {
		System.out.println("Enter the "+message);
		final String str = scanner.next();
		return str;
	}
}
