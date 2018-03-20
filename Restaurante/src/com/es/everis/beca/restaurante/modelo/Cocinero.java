package com.es.everis.beca.restaurante.modelo;

/**
 * Clase Cocinero.
 */
public class Cocinero extends Empleado {

  /**
   * Cobrar.
   */
  @Override public void cobrar() {

  }

  @Override public void trabajar() {
    System.out.println("Estoy Cocinando");
  }

}
