package com.es.everis.beca.vistarestaurante.scanners;

import com.es.everis.beca.restaurante.Restaurante;
import com.es.everis.beca.restaurante.modelo.Mesa;

import java.util.Scanner;

public class ScannerMesa {
  private Scanner scanner = new Scanner(System.in);

  public Mesa scan() {
    if(!Restaurante.controlReservas.hayMesasLibres()) {
      return null;
    }
    System.out.println("Introduzca 0 para seleccionar cualquier mesa");
    System.out.print("Las mesas ");
    for(Mesa mesa: Restaurante.mesas) {
      if(mesa.isLibre()) {
        System.out.print(mesa.getId() + ",");
      }
    }

    System.out.println(" están libres.");
    System.out.println("Introduzca el número de la mesa a reservar:");

    int mesaId = scanner.nextInt();
    Mesa resultado = null;

    for(Mesa mesa: Restaurante.mesas) {
      if(mesaId == 0) {
        if(mesa.isLibre()) {
          resultado = mesa;
          break;
        }
      } else if (mesaId > 0 && mesaId == mesa.getId() && mesa.isLibre()) {
        resultado = mesa;
        break;
      }
    }

    return resultado;
  }
}
