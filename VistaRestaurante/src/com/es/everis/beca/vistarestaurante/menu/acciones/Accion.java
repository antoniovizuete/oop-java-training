package com.es.everis.beca.vistarestaurante.menu.acciones;

public interface Accion {
  int getSelector();
  String getTexto();
  void accionar();
}
