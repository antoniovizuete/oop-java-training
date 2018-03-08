package com.es.everis.beca.vistarestaurante.scanners;

import java.util.Scanner;

public final class ScannerNumerico {
	private static Scanner scanner = newScannerInstance();

	private ScannerNumerico() { 
		
	}
	
	public static Integer scan() {
		Integer resultado = null;
		try {
			resultado = scanner.nextInt();
		} catch (Exception e) {
			scanner =  newScannerInstance();
			System.out.println("Error!! No es numerico!!");
			
			resultado = scan();
		}
		
		return resultado;
	}
	
	private static Scanner newScannerInstance() {
		return new Scanner(System.in);
	}
}
