package com.es.everis.beca.vistarestaurante.scanners;

import java.util.Scanner;

public abstract class ScannerPadre {

	protected Scanner scanner;

	public ScannerPadre() {
		scanner = initScanner();
	}

	public abstract Object scan();

	protected Scanner initScanner() {
		return new Scanner(System.in);
	}
}
