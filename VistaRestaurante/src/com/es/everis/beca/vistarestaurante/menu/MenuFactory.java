package com.es.everis.beca.vistarestaurante.menu;

import com.es.everis.beca.vistarestaurante.menu.acciones.Accion;
import com.es.everis.beca.vistarestaurante.menu.acciones.ListarReservasAccion;
import com.es.everis.beca.vistarestaurante.menu.acciones.ReservarAccion;
import com.es.everis.beca.vistarestaurante.menu.acciones.SalirAccion;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public final class MenuFactory {
  private MenuFactory() {}

  public static MenuController getMenu(){
    Set<Accion> acciones = new HashSet<>();
    acciones.add(new ReservarAccion());
    acciones.add(new ListarReservasAccion());
    acciones.add(new SalirAccion());
    return getMenu(MenuTipos.CONJUNTO, acciones);
  }

  public static MenuController getMenu(Collection<Accion> acciones){
    return getMenu(MenuTipos.CONJUNTO, acciones);
  }

  public static MenuController getMenu(MenuTipos tipo, Collection<Accion> acciones){
    MenuController menu;

    switch (tipo) {
      case LISTA:
        menu = new ListaMenuControllerImpl(acciones);
        break;
      case MAPA:
        menu = new MapaMenuControllerImpl(acciones);
        break;
      case CONJUNTO:
      default:
        menu = new ConjuntoMenuControllerImpl(acciones);
        break;
    }

    return menu;
  }
}
