package com.es.everis.beca.vistarestaurante.menu.acciones;

import com.es.everis.beca.restaurante.modelo.Mesa;
import com.es.everis.beca.restaurante.modelo.Persona;
import com.es.everis.beca.vistarestaurante.scanners.ScannerComensales;
import com.es.everis.beca.vistarestaurante.scanners.ScannerMesa;
import com.es.everis.beca.vistarestaurante.scanners.ScannerPersona;

public class ReservarAccion extends ReservasAccionAbstracta {

  public ReservarAccion() {
    super(1, "Reservar mesa");
  }

  @Override public void accionar() {
    if (!reservaController.hayMesasLibres()) {
      System.out.println("No hay mesas libres, no se puede reservar.");
    }
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
          reservaController.reservar(mesaAReservar, persona, numComensales);
      if (mesaReservada == null) {
        System.err.println("No se ha accionar la reserva.");
      } else {
        System.out.println(mesaReservada.getReservaDesc());
      }
    }
  }
}
