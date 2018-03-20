package com.es.everis.beca.vistarestaurante.menu.acciones;

public abstract class AccionAbstracta implements Accion {
  protected static final String SEPARADOR = ") ";

  private int selector;
  private String texto;

  public AccionAbstracta(int selector, String texto) {
    this.selector = selector;
    this.texto = texto;
  }

  @Override public int getSelector() {
    return selector;
  }

  public void setSelector(int selector) {
    this.selector = selector;
  }

  @Override public String getTexto() {
    return texto;
  }

  public void setTexto(String texto) {
    this.texto = texto;
  }

  @Override public String toString() {
    return selector + SEPARADOR + texto;
  }

  @Override public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;

    AccionAbstracta that = (AccionAbstracta) o;

    return selector == that.selector;
  }

  @Override public int hashCode() {
    return selector;
  }
}
