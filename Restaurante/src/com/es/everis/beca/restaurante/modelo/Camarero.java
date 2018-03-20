package com.es.everis.beca.restaurante.modelo;

/**
 * Clase Camarero.
 */
public class Camarero extends Empleado {

  /**
   * Cobrar.
   */
  @Override public void cobrar() {

  }

  @Override public void trabajar() {
    System.out.println("Estoy atendiendo mesas");
  }

}
