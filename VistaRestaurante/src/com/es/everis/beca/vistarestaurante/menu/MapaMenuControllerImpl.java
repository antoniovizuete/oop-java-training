package com.es.everis.beca.vistarestaurante.menu;

import com.es.everis.beca.vistarestaurante.menu.acciones.Accion;
import com.es.everis.beca.vistarestaurante.menu.acciones.ListarReservasAccion;
import com.es.everis.beca.vistarestaurante.menu.acciones.ReservarAccion;
import com.es.everis.beca.vistarestaurante.menu.acciones.SalirAccion;
import com.es.everis.beca.vistarestaurante.scanners.ScannerNumerico;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapaMenuControllerImpl implements MenuController {

  private Map<Integer, Accion> acciones;

  public MapaMenuControllerImpl() {
    inicializarAcciones();
  }

  private void inicializarAcciones() {
    acciones = new HashMap<>();

    Accion reservar = new ReservarAccion();
    Accion listar = new ListarReservasAccion();
    Accion salir = new SalirAccion();

    acciones.put(reservar.getSelector(), reservar);
    acciones.put(listar.getSelector(), listar);
    acciones.put(salir.getSelector(), salir);
  }

  @Override public void mostrarMenu() {
    System.out.println("Mapa de Acciones...");

    for(Map.Entry<Integer, Accion> entryAccion: acciones.entrySet()) {
      System.out.println(entryAccion.getValue());
    }

    int opcion = ScannerNumerico.scan("Seleccione una opcion:");

    for(Map.Entry<Integer, Accion> entryAccion: acciones.entrySet()) {
      if(entryAccion.getKey() == opcion) {
        entryAccion.getValue().accionar();
      }
    }

    mostrarMenu();
  }
}
