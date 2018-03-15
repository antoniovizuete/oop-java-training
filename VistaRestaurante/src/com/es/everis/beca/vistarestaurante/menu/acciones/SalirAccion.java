package com.es.everis.beca.vistarestaurante.menu.acciones;

import com.es.everis.beca.restaurante.modelo.Mesa;
import com.es.everis.beca.restaurante.modelo.Persona;
import com.es.everis.beca.vistarestaurante.scanners.ScannerComensales;
import com.es.everis.beca.vistarestaurante.scanners.ScannerMesa;
import com.es.everis.beca.vistarestaurante.scanners.ScannerPersona;

public class SalirAccion extends AccionAbstracta {

  public SalirAccion() {
    super(99, "Salir");
  }

  @Override
  public void accionar() {
    System.exit(0);
  }
}
