package com.es.everis.beca.vistarestaurante.scanners;

import java.util.Scanner;

/**
 * La clase ScannerComensales escanea el numero de comensakes a través de System.in.
 */
public class ScannerComensales {
  
  /**
   * Escanea el numero de comensales.
   *
   * @return numero de comensales
   */
  public int scan() {
    System.out.println("Introduzca el numero de comensales: ");
    return ScannerNumerico.scan();
  }
}
