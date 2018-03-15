package com.es.everis.beca.vistarestaurante.menu;

import com.es.everis.beca.vistarestaurante.menu.acciones.Accion;
import com.es.everis.beca.vistarestaurante.menu.acciones.ListarReservasAccion;
import com.es.everis.beca.vistarestaurante.menu.acciones.ReservarAccion;
import com.es.everis.beca.vistarestaurante.menu.acciones.SalirAccion;
import com.es.everis.beca.vistarestaurante.scanners.ScannerNumerico;

import java.util.ArrayList;
import java.util.List;

public class ListaMenuControllerImpl implements MenuController {

  private List<Accion> acciones;

  public ListaMenuControllerImpl() {
    inicializarAcciones();
  }

  private void inicializarAcciones() {
    acciones = new ArrayList<>();
    acciones.add(new ReservarAccion());
    acciones.add(new ListarReservasAccion());
    acciones.add(new SalirAccion());
    acciones.add(new SalirAccion());
  }

  @Override public void mostrarMenu() {
    System.out.println("Lista de Acciones...");

    for(Accion accion: acciones) {
      System.out.println(accion);
    }

    int opcion = ScannerNumerico.scan("Seleccione una opcion:");

    for(Accion accion: acciones) {
      if(accion.getSelector() == opcion) {
        accion.accionar();
      }
    }

    mostrarMenu();
  }
}
