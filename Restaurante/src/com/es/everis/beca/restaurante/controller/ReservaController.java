package com.es.everis.beca.restaurante.controller;

import com.es.everis.beca.restaurante.*;
import com.es.everis.beca.restaurante.modelo.Mesa;
import com.es.everis.beca.restaurante.modelo.Persona;

import java.io.PrintStream;

/**
 * Clase que tiene la lógica de las reservas.
 */
public class ReservaController {

  /**
   * Devuelve true si hay alguna mesa libre.
   *
   * @return the boolean
   */
  public boolean hayMesasLibres() {
    boolean resultado = false;
    for (Mesa mesa : Restaurante.mesas) {
      if (mesa.isLibre()) {
        resultado = true;
      }
    }
    return resultado;
  }

  /**
   * Reservar mesa.
   *
   * @param mesaAReservar la mesa a reservar
   * @param persona       la persona
   * @param numComnesales el numero comnesales
   * @return la mesa
   */
  public Mesa reservar(Mesa mesaAReservar, Persona persona, int numComnesales) {
    for (Mesa mesa : Restaurante.mesas) {
      if (mesaAReservar.getId().intValue() == mesa.getId().intValue()) {
        mesa.setCliente(persona);
        mesa.setComensales(numComnesales);
        mesa.setLibre(false);
        return mesa;
      }
    }
    return null;
  }

  /**
   * Listar reservas.
   *
   * @param printer la salida
   */
  public void listarReservas(PrintStream printer) {
    int c = 0;
    for (Mesa mesa : Restaurante.mesas) {
      if (!mesa.isLibre()) {
        c++;
      }
    }

    printer.println("Hay " + c + " reservas.");

    if (c > 0) {
      for (Mesa mesa : Restaurante.mesas) {
        if (!mesa.isLibre()) {
          printer.println(mesa.getReservaDesc());
        }
      }
    }
  }



}
