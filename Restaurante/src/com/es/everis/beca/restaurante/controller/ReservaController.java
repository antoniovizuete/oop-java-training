package com.es.everis.beca.restaurante.controller;

import com.es.everis.beca.restaurante.*;
import com.es.everis.beca.restaurante.modelo.Mesa;
import com.es.everis.beca.restaurante.modelo.Persona;

import java.io.PrintStream;

public class ReservaController {

  public boolean hayMesasLibres() {
    boolean resultado = false;
    for(Mesa mesa: Restaurante.mesas) {
      if (mesa.isLibre()) {
        resultado = true;
      }
    }
    return resultado;
  }

	public Mesa reservar(Mesa mesaAReservar, Persona persona, int numComnesales) {
	  for(Mesa mesa: Restaurante.mesas) {
	    if(mesaAReservar.getId().intValue() == mesa.getId().intValue()) {
        mesa.setCliente(persona);
        mesa.setComensales(numComnesales);
        mesa.setLibre(false);
        return mesa;
      }
    }
    return null;
	}

	public void listarReservas(PrintStream printer) {
    int c = 0;
    for(Mesa mesa: Restaurante.mesas) {
      if(!mesa.isLibre()){
        c++;
      }
    }

    printer.println("Hay " + c + " reservas.");

    if(c > 0) {
      for(Mesa mesa: Restaurante.mesas) {
        if(!mesa.isLibre()){
          printer.println(mesa.getReservaDesc());
        }
      }
    }
  }



}
