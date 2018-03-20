package com.es.everis.beca.vistarestaurante.menu;

import com.es.everis.beca.vistarestaurante.menu.acciones.Accion;
import com.es.everis.beca.vistarestaurante.menu.acciones.ListarReservasAccion;
import com.es.everis.beca.vistarestaurante.menu.acciones.ReservarAccion;
import com.es.everis.beca.vistarestaurante.menu.acciones.SalirAccion;
import com.es.everis.beca.vistarestaurante.scanners.ScannerNumerico;

import java.util.*;

public class MapaMenuControllerImpl implements MenuController {

  private Map<Integer, Accion> accionesMap = new HashMap<>();

  public MapaMenuControllerImpl(Collection<Accion> acciones) {
    acciones.forEach(accion -> accionesMap.put(accion.getSelector(), accion));
  }

  @Override public void mostrarMenu() {
    System.out.println("Mapa de Acciones...");

    for(Map.Entry<Integer, Accion> entryAccion: accionesMap.entrySet()) {
      System.out.println(entryAccion.getValue());
    }

    int opcion = ScannerNumerico.scan("Seleccione una opcion:");

    for(Map.Entry<Integer, Accion> entryAccion: accionesMap.entrySet()) {
      if(entryAccion.getKey() == opcion) {
        entryAccion.getValue().accionar();
      }
    }

    mostrarMenu();
  }
}
