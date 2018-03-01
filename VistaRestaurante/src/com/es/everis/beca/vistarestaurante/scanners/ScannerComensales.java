package com.es.everis.beca.vistarestaurante.scanners;

import java.util.Scanner;

public class ScannerComensales {
  private Scanner scanner = new Scanner(System.in);

  public int scan() {
    System.out.println("Introduzca el numero de comensales: ");
    return scanner.nextInt();
  }
}
