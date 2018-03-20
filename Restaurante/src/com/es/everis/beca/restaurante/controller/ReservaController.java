package com.es.everis.beca.restaurante.controller;

import com.es.everis.beca.restaurante.modelo.Mesa;
import com.es.everis.beca.restaurante.modelo.Persona;

import java.io.PrintStream;
import java.util.List;

public interface ReservaController {
  boolean hayMesasLibres();

  Mesa reservar(Mesa mesaAReservar, Persona persona, int numComnesales);

  void listarReservas(PrintStream printer);

  List<Mesa> getReservas();

  List<Mesa> getMesasDisponibles();

  Mesa getMesaById(Integer id);

}
