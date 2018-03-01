package com.es.everis.beca.vistarestaurante.scanners;

import com.es.everis.beca.restaurante.modelo.Cliente;
import com.es.everis.beca.restaurante.modelo.Persona;

import java.util.Scanner;

public class ScannerPersona {
  private Scanner scanner = new Scanner(System.in);

  public Persona scan() {
    System.out.println("Introduzca el nombre: ");
    String nombre = scanner.nextLine();

    Integer telefono;
    do {
      System.out.println("Introduzca un número válido de teléfono: ");
      telefono = scanner.nextInt();
    } while (Persona.Util.validarTelefono(telefono));

    Persona cliente = new Cliente();
    cliente.setNombre(nombre);
    cliente.setTelefono(telefono);

    return cliente;
  }
}
