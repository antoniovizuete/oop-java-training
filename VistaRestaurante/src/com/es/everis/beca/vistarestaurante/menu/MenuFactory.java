package com.es.everis.beca.vistarestaurante.menu;

public final class MenuFactory {
  private MenuFactory() {}

  public static MenuController getMenu(){
    return getMenu(MenuTipos.CONJUNTO);
  }

  public static MenuController getMenu(MenuTipos tipo){
    MenuController menu;

    switch (tipo) {
      case LISTA:
        menu = new ListaMenuControllerImpl();
        break;
      case MAPA:
        menu = new MapaMenuControllerImpl();
        break;
      case CONJUNTO:
      default:
        menu = new ConjuntoMenuControllerImpl();
        break;
    }

    return menu;
  }
}
