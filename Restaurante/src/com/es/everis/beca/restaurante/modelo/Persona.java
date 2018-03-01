package com.es.everis.beca.restaurante.modelo;

public class Persona {

  private String nombre;
  private String apellidos;
  private Integer telefono;

  public Persona(String nombre, String apellidos, Integer telefono) {
    super();
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.telefono = telefono;
  }

  public Persona(String nombre, Integer telefono) {
    this.nombre = nombre;
    this.telefono = telefono;
  }

  public Persona() {
    super();
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellidos() {
    return apellidos;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  public Integer getTelefono() {
    return telefono;
  }

  public void setTelefono(Integer telefono) {
    if (Util.validarTelefono(telefono)) {
      System.out.println("Número de teléfono no válido");
    } else {
      this.telefono = telefono;
    }
  }

  public String getNombreCompleto() {
    String resultado = this.nombre;
    if (this.apellidos != null) {
      resultado = resultado + " " + this.apellidos;
    }
    return resultado;
  }

  @Override
  public String toString() {
    return "Persona{" + "nombre='" + nombre + '\'' + ", apellidos='" + apellidos + '\''
        + ", telefono=" + telefono + '}';
  }

  public static class Util {
    private static final int MAX_TELEFONO = 799999999;
    private static final int MIN_TELEFONO = 600000000;

    public static boolean validarTelefono(Integer telefono) {
      return telefono > MAX_TELEFONO || telefono < MIN_TELEFONO;
    }
  }
}
