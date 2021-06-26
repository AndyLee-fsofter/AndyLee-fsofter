package edu.luvina.utils;

import java.util.Scanner;

public class ScannerUtil {
	private static Scanner sc = null;
	
	public static Scanner getScanner() {
		if (sc == null) {
			sc = new Scanner(System.in);
					
		}
		return sc;
	}
	
	public static void closeScanner() {
		if (sc != null) {
			sc.close();
		}
	}

}
