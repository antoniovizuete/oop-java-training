package com.es.everis.beca.vistarestaurante;
import java.io.Console;
import java.io.IOException;
import java.util.Scanner;

import  com.es.everis.beca.restaurante.*;
import com.es.everis.beca.restaurante.controller.ReservaController;
import com.es.everis.beca.restaurante.modelo.Cliente;
import com.es.everis.beca.restaurante.modelo.Mesa;
import com.es.everis.beca.restaurante.modelo.Persona;
import com.es.everis.beca.vistarestaurante.scanners.ScannerComensales;
import com.es.everis.beca.vistarestaurante.scanners.ScannerMesa;
import com.es.everis.beca.vistarestaurante.scanners.ScannerPersona;



public class MenuAplicacion {

	public static void main(String[] args) {
		Restaurante.inicializarRestaurante();
		showMenu();
	}
	
	private static void showMenu() {
    System.out.println("Bienvenido al restaurante");
		System.out.println("Elija una opción: ");
		System.out.println("1) Reservar mesa");
		System.out.println("2) Listar reservas");
    System.out.println("99) Salir");

		Scanner scan = new Scanner(System.in);
		Integer opcion = scan.nextInt();

		switch (opcion) {
		case 1:
      System.out.println(">>>>>>>>>> RESERVAR");
			reservar();
			break;
		case 2:
      System.out.println(">>>>>>>>>> LISTAR");
			listarReservas();
			break;
		case 99:
			System.exit(0);
		default:
			System.err.println("ERROR");
			break;
		}

		showMenu();
	}
	
	public static void reservar(){
    if(!Restaurante.controlReservas.hayMesasLibres()) {
      System.out.println("No hay mesas libres, no se puede reservar.");
    } else {
      ScannerPersona scannerPersona = new ScannerPersona();
      Persona persona = scannerPersona.scan();

      ScannerComensales scannerComensales = new ScannerComensales();
      int numComensales = scannerComensales.scan();

      ScannerMesa scannerMesa = new ScannerMesa();
      Mesa mesaAReservar = scannerMesa.scan();

      if(mesaAReservar == null) {
        System.out.println("No hay mesas libres, no se puede reservar.");
      } else {
        Mesa mesaReservada = Restaurante.controlReservas.reservar(mesaAReservar, persona, numComensales);
        if(mesaReservada == null) {
          System.err.println("No se ha realizar la reserva.");
        } else {
          System.out.println(mesaReservada.getReservaDesc());
        }
      }
    }

	}

	private static void listarReservas() {
    Restaurante.controlReservas.listarReservas(System.out);
  }

}
