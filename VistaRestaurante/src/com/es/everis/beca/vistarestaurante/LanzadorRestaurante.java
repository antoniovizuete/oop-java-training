package com.es.everis.beca.vistarestaurante;

import com.es.everis.beca.vistarestaurante.menu.MenuController;
import com.es.everis.beca.vistarestaurante.menu.MenuFactory;
import com.es.everis.beca.vistarestaurante.menu.MenuTipos;

/**
 * Clase inicializadora de la aplicacion.
 */
public class LanzadorRestaurante {

  /**
   * Punto de entrada a la aplicacion.
   *
   * @param args argumentos de entrada
   */
  public static void main(String[] args) {
    LanzadorRestaurante app = new LanzadorRestaurante();
    app.iniciar();
  }

  private void iniciar() {
    System.out.println("Bienvenido a Restaurante!");
    MenuController menuController = MenuFactory.getMenu(MenuTipos.LISTA);
    menuController.mostrarMenu();
  }




}
