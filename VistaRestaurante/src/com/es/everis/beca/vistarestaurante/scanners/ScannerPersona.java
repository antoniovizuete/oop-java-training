package com.es.everis.beca.vistarestaurante.scanners;

import com.es.everis.beca.restaurante.modelo.Cliente;
import com.es.everis.beca.restaurante.modelo.Persona;

import java.util.Scanner;

/**
 * La clase ScannerPersona crea una 
 * instancia de la clase {@link Persona} 
 * a traves de System.in.
 */
public class ScannerPersona extends ScannerPadre {
  private Scanner scanner = new Scanner(System.in);

  /**
   * Crea la instancia de {@link Persona} empleando lo introducido por el usuario.
   *
   * @return persona
   */
  public Persona scan() {
	//Escaneamos el nombre de la persona
    System.out.println("Introduzca el nombre: ");
    String nombre = scanner.nextLine();

    //Escaneamos el telefono de la persona
    Integer telefono;
    do {
      System.out.println("Introduzca un numero valido de telefono: ");
      telefono = scanner.nextInt();
    } while (Persona.Util.validarTelefono(telefono));
    
    // Creamos la instancia de Persona
    Persona cliente = new Cliente();
    cliente.setNombre(nombre);
    cliente.setTelefono(telefono);

    return cliente;
  }
}
