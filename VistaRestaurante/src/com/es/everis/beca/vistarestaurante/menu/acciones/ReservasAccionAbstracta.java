package com.es.everis.beca.vistarestaurante.menu.acciones;

import com.es.everis.beca.restaurante.controller.ReservaControllerImpl;
import com.es.everis.beca.restaurante.controller.ReservaController;

public abstract class ReservasAccionAbstracta extends AccionAbstracta {

  protected ReservaController reservaController;

  public ReservasAccionAbstracta(int selector, String texto) {
    super(selector, texto);
    this.reservaController = new ReservaControllerImpl();
  }

}
