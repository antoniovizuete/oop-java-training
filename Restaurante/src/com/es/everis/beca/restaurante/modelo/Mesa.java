package com.es.everis.beca.restaurante.modelo;

/**
 * Clase Mesa.
 *
 * Se considera que una Mesa está reservada cuando la propiedad libre es false.
 *
 */
public class Mesa {

  private boolean libre;

  private Persona camarero;

  private Pedido pedido;

  private Persona cliente;

  private Integer comensales;

  private Integer id;

  /**
   * Instantiates a new Mesa.
   */
  public Mesa() {

  }

  /**
   * Gets camarero.
   *
   * @return the camarero
   */
  public Persona getCamarero() {
    return camarero;
  }

  /**
   * Sets camarero.
   *
   * @param camarero the camarero
   */
  public void setCamarero(Persona camarero) {
    this.camarero = camarero;
  }

  /**
   * Gets pedido.
   *
   * @return the pedido
   */
  public Pedido getPedido() {
    return pedido;
  }

  /**
   * Sets pedido.
   *
   * @param pedido the pedido
   */
  public void setPedido(Pedido pedido) {
    this.pedido = pedido;
  }

  /**
   * Gets cliente.
   *
   * @return the cliente
   */
  public Persona getCliente() {
    return cliente;
  }

  /**
   * Sets cliente.
   *
   * @param cliente the cliente
   */
  public void setCliente(Persona cliente) {
    this.cliente = cliente;
  }

  /**
   * Gets comensales.
   *
   * @return the comensales
   */
  public Integer getComensales() {
    return comensales;
  }

  /**
   * Sets comensales.
   *
   * @param comensales the comensales
   */
  public void setComensales(Integer comensales) {
    this.comensales = comensales;
  }

  /**
   * Gets id.
   *
   * @return the id
   */
  public Integer getId() {
    return id;
  }

  /**
   * Sets id.
   *
   * @param id the id
   */
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * Is libre boolean.
   *
   * @return the boolean
   */
  public boolean isLibre() {
    return libre;
  }

  /**
   * Sets libre.
   *
   * @param libre the libre
   */
  public void setLibre(boolean libre) {
    this.libre = libre;
  }

  /**
   * Gets reserva desc.
   *
   * @return the reserva desc
   */
  public String getReservaDesc() {
    return "Mesa #" + this.id + " reservada a nombre de " + this.cliente.getNombre() + " para "
        + this.getComensales() + " personas";
  }

  @Override public String toString() {
    return "Mesa{" + "id=" + id + ", libre=" + libre + '}';
  }
}
