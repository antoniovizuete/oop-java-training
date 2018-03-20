package com.es.everis.beca.restaurante.modelo;

/**
 * Clase Mesa.
 *
 * Consideraciones:
 *   - una Mesa esta reservada cuando la propiedad reservada es true.
 *   - una Mesa esta ocupada cuando la propiedad libre es false.
 *   - una Mesa esta disponible cuando la propiedad reservada es false y libre es true
 *
 */
public class Mesa {

  private Integer id;

  private boolean reservada = false;

  private boolean libre = true;

  private Persona camarero;

  private Pedido pedido;

  private Persona cliente;

  private Integer comensales;

  /**
   * Instantiates a new Mesa.
   */
  public Mesa() { }

  /**
   * Instantiates a new Mesa.
   */
  public Mesa(Integer id) {
    this.id = id;
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
   * Is reservada boolean.
   *
   * @return the boolean
   */
  public boolean isReservada() {
    return reservada;
  }

  /**
   * Sets reservada.
   *
   * @param reservada the reservada
   */
  public void setReservada(boolean reservada) {
    this.reservada = reservada;
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
    return "Mesa{" + "id=" + id + ", reservada=" + reservada + '}';
  }
}
