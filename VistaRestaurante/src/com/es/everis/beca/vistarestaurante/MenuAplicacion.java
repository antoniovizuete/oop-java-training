package com.es.everis.beca.vistarestaurante;

import com.es.everis.beca.restaurante.Restaurante;
import com.es.everis.beca.restaurante.modelo.Mesa;
import com.es.everis.beca.restaurante.modelo.Persona;
import com.es.everis.beca.vistarestaurante.scanners.ScannerComensales;
import com.es.everis.beca.vistarestaurante.scanners.ScannerMesa;
import com.es.everis.beca.vistarestaurante.scanners.ScannerNumerico;
import com.es.everis.beca.vistarestaurante.scanners.ScannerPersona;

import java.util.Scanner;

/**
 * Clase inicializadora de la aplicacion.
 */
/*
 * dsjlkdsajkldsalkjdsaklj
 */
// jkdsakjdsahkjsdhj
public class MenuAplicacion {

  /**
   * Punto de entrad a la aplicacion.
   *
   * @param args argumentos de entrada
   */
  public static void main(String[] args) {
    Restaurante.inicializarRestaurante();
    while (true) {
		showMenu();
	}
  }

  /**
   * Muestra el menu
   */
  private static void showMenu() {
    System.out.println("Bienvenido al restaurante");
    System.out.println("Elija una opcion: ");
    System.out.println("1) Reservar mesa");
    System.out.println("2) Listar reservas");
    System.out.println("98) Pruebas");
    System.out.println("99) Salir");

    
    Integer opcion = ScannerNumerico.scan();

    switch (opcion) {
      case 1:
        System.out.println(">>>>>>>>>> RESERVAR");
        reservar();
        break;
      case 2:
        System.out.println(">>>>>>>>>> LISTAR");
        listarReservas();
        break;
      case 98:
          pruebas();
          break;
      case 99:
        System.exit(0);
        break;
      default:
        System.err.println("ERROR");
        break;
    }
    
  }

  /**
   * Acciona el mecanismo para reservar una mesa.
   */
  private static void reservar() {
    if (!Restaurante.controlReservas.hayMesasLibres()) {
      System.out.println("No hay mesas libres, no se puede reservar.");
    } else {
      ScannerPersona scannerPersona = new ScannerPersona();
      Persona persona = scannerPersona.scan();

      ScannerComensales scannerComensales = new ScannerComensales();
      int numComensales = scannerComensales.scan();

      ScannerMesa scannerMesa = new ScannerMesa();
      Mesa mesaAReservar = scannerMesa.scan();

      if (mesaAReservar == null) {
        System.out.println("No hay mesas libres, no se puede reservar.");
      } else {
        Mesa mesaReservada =
            Restaurante.controlReservas.reservar(mesaAReservar, persona, numComensales);
        if (mesaReservada == null) {
          System.err.println("No se ha realizar la reserva.");
        } else {
          System.out.println(mesaReservada.getReservaDesc());
        }
      }
    }

  }

  /**
   * Lista las reservas realizadas.
   */
  private static void listarReservas() {
    Restaurante.controlReservas.listarReservas(System.out);
  }
  
  private static void pruebas() {
	  ScannerComensales scannerComensales = new ScannerComensales();
      int numComensales = scannerComensales.scan();
  }

}
