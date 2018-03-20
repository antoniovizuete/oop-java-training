package com.es.everis.beca.vistarestaurante.menu;

import com.es.everis.beca.vistarestaurante.menu.acciones.Accion;
import com.es.everis.beca.vistarestaurante.scanners.ScannerNumerico;

import java.util.Collection;

public abstract class ColeccionMenuController implements MenuController {
  private Collection<Accion> acciones;

  public ColeccionMenuController(Collection<Accion> acciones) {
    this.acciones = acciones;
  }

  @Override public void mostrarMenu() {
    mostrarMenuJava8();
    mostrarMenu();
  }

  private void mostrarMenuJava7() {
    for(Accion accion: acciones) {
      System.out.println(accion);
    }

    int opcion = ScannerNumerico.scan("Seleccione una opcion:");

    for(Accion accion: acciones) {
      if(accion.getSelector() == opcion) {
        accion.accionar();
      }
    }
  }

  private void mostrarMenuJava8() {
    acciones.forEach(System.out::println);

    int opcion = ScannerNumerico.scan("Seleccione una opcion:");

    acciones.stream()
        .filter(accion -> accion.getSelector() == opcion)
        .findFirst().ifPresent(accion -> accion.accionar())
        ;
  }
}
