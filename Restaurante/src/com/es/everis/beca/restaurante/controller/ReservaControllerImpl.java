package com.es.everis.beca.restaurante.controller;

import com.es.everis.beca.restaurante.*;
import com.es.everis.beca.restaurante.modelo.Mesa;
import com.es.everis.beca.restaurante.modelo.Persona;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Clase que tiene la lógica de las reservas.
 */
public class ReservaControllerImpl implements ReservaController {

  private Restaurante restaurante = Restaurante.getInstance();

  /**
   * Devuelve true si hay alguna mesa libre.
   *
   * @return the boolean
   */
  @Override public boolean hayMesasLibres() {
    boolean resultado = false;
    for (Mesa mesa : restaurante.getMesas()) {
      if (!mesa.isReservada()) {
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
  @Override public Mesa reservar(Mesa mesaAReservar, Persona persona, int numComnesales) {
    for (Mesa mesa : restaurante.getMesas()) {
      if (mesaAReservar.getId().intValue() == mesa.getId().intValue()) {
        mesa.setCliente(persona);
        mesa.setComensales(numComnesales);
        mesa.setReservada(true);
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
  @Override public void listarReservas(PrintStream printer) {
    int c = 0;
    for (Mesa mesa : restaurante.getMesas()) {
      if (!mesa.isReservada()) {
        c++;
      }
    }

    printer.println("Hay " + c + " reservas.");

    if (c > 0) {
      for (Mesa mesa : restaurante.getMesas()) {
        if (!mesa.isReservada()) {
          printer.println(mesa.getReservaDesc());
        }
      }
    }
  }

  /**
   * Deveulve las mesas reservadas al estilo Java8
   *
   * @return lista de mesas reservadas
   */
  @Override public List<Mesa> getReservas() {
    return getReservasJava8();
  }

  private List<Mesa> getReservasJava8() {
    return restaurante.getMesas().stream()
        .filter(mesa -> mesa.isReservada())
        .collect(Collectors.toList());
  }

  private List<Mesa> getReservasJava7() {
    List<Mesa> mesasReservadas = new ArrayList<>();
    for (Mesa mesa : restaurante.getMesas()) {
      if (!mesa.isReservada()) {
        mesasReservadas.add(mesa);
      }
    }
    return mesasReservadas;
  }

  /**
   * Devuelve las mesas disponibles.
   *
   * @return lista de mesas disponibles
   */
  @Override public List<Mesa> getMesasDisponibles() {
    return restaurante.getMesas().stream()
        .filter(mesa -> mesa.isLibre() && !mesa.isReservada())
        .collect(Collectors.toList());
  }

  @Override public Mesa getMesaById(Integer id) {
    return null;
  }
}
