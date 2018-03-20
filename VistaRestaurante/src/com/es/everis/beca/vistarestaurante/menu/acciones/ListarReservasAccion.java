package com.es.everis.beca.vistarestaurante.menu.acciones;

import com.es.everis.beca.restaurante.Restaurante;
import com.es.everis.beca.restaurante.controller.ReservaController;
import com.es.everis.beca.restaurante.modelo.Mesa;

import java.util.List;

public class ListarReservasAccion extends ReservasAccionAbstracta {

  public ListarReservasAccion() {
    super(2, "Listar Reservas");
  }

  @Override public void accionar() {
    List<Mesa> mesas = reservaController.getReservas();
    System.out.println("Hay " + mesas.size() + " reservas.");
    mesas.forEach(mesa -> System.out.println(mesa.getReservaDesc()));
  }
}
