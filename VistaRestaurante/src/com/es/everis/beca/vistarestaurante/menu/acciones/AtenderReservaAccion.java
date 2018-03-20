package com.es.everis.beca.vistarestaurante.menu.acciones;

public class AtenderReservaAccion extends ReservasAccionAbstracta {

  public AtenderReservaAccion() {
    super(3, "Atender reserva");
  }

  /**
   * Atender mesa, ha llegado un cliente y nos disponemos a sentarlo:
   *
   *  - Obtener mesas reservadas desde el controlador.
   *  - Desde la entrada de datos, obtener el id de la mesa que nos dice el cliente.
   *  - Obtener la mesa y settear la propiedad is libre a false.
   */
  @Override public void accionar() {

  }
}
