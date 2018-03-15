package com.es.everis.beca.vistarestaurante.scanners;

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
    return ScannerNumerico.scan("Introduzca el numero de comensales: ");
  }
}
