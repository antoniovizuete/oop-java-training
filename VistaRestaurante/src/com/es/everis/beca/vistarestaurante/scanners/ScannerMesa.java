package com.es.everis.beca.vistarestaurante.scanners;

import com.es.everis.beca.restaurante.Restaurante;
import com.es.everis.beca.restaurante.controller.ReservaControllerImpl;
import com.es.everis.beca.restaurante.controller.ReservaController;
import com.es.everis.beca.restaurante.modelo.Mesa;

/**
 * La clase ScannerMesa crea una instancia de la clase {@link Mesa} a través de System.in.
 */
public class ScannerMesa {

  private ReservaController controlReservas = new ReservaControllerImpl();

  /**
   * Crea la instancia de {@link Mesa} empleando lo introducido por el usuario.
   *
   * @return mesa
   */
  public Mesa scan() {
    if(!controlReservas.hayMesasLibres()) {
      return null;
    }
    
    printMesasLibres();
    String mensaje = "Introduzca el numero de la mesa a reservar:";

    int mesaId = ScannerNumerico.scan(mensaje);
    Mesa resultado = null;
    
    while(mesaId < 0 || mesaId > Restaurante.getInstance().getMesas().size()) {
    	mesaId = ScannerNumerico.scan("Error: mesa fuera de rango" + mensaje);
    }

    for(Mesa mesa: Restaurante.getInstance().getMesas()) {
      if(mesaId == 0) {
        if(!mesa.isReservada()) {
          resultado = mesa;
          break;
        }
      } else if (mesaId > 0 && mesaId == mesa.getId() && !mesa.isReservada()) {
        resultado = mesa;
        break;
      }
    }

    return resultado;
  }

	private void printMesasLibres() {
		System.out.println("Introduzca 0 para seleccionar cualquier mesa");
	    System.out.print("Las mesas ");
	    for(Mesa mesa: Restaurante.getInstance().getMesas()) {
	      if(!mesa.isReservada()) {
	        System.out.print(mesa.getId() + ",");
	      }
	    }
	    System.out.println(" estan libres.");
	}
}
