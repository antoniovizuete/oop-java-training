package com.es.everis.beca.restaurante.modelo;

public class Mesa {

	private boolean libre;

	private Persona camarero;

	private Pedido pedido;

	private Persona cliente;

	private Integer comensales;

	private Integer id;

	public Mesa() {

	}

	public Persona getCamarero() {
		return camarero;
	}

	public void setCamarero(Persona camarero) {
		this.camarero = camarero;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Persona getCliente() {
		return cliente;
	}

	public void setCliente(Persona cliente) {
		this.cliente = cliente;
	}

	public Integer getComensales() {
		return comensales;
	}

	public void setComensales(Integer comensales) {
		this.comensales = comensales;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

  public boolean isLibre() {
    return libre;
  }

  public void setLibre(boolean libre) {
    this.libre = libre;
  }

	public String getReservaDesc() {
		return "Mesa #" + this.id + " reservada a nombre de " + this.cliente.getNombre() + " para "
				+ this.getComensales() + " personas";
	}

  @Override public String toString() {
    return "Mesa{" + "id=" + id + ", libre=" + libre + '}';
  }
}
