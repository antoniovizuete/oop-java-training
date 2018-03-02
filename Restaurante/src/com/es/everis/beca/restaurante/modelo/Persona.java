package com.es.everis.beca.restaurante.modelo;

/**
 * Clase Persona.
 */
public class Persona {

  private String nombre;
  private String apellidos;
  private Integer telefono;

  /**
   * Instancia una nueva Persona.
   *
   * @param nombre    el nombre
   * @param apellidos los apellidos
   * @param telefono  el telefono
   */
  public Persona(String nombre, String apellidos, Integer telefono) {
    super();
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.telefono = telefono;
  }

  /**
   * Instancia una nueva Persona.
   *
   * @param nombre    el nombre
   * @param telefono  el telefono
   */
  public Persona(String nombre, Integer telefono) {
    this.nombre = nombre;
    this.telefono = telefono;
  }

  /**
   * Instancia una nueva Persona.
   */
  public Persona() {
    super();
  }

  /**
   * Gets nombre.
   *
   * @return the nombre
   */
  public String getNombre() {
    return nombre;
  }

  /**
   * Sets nombre.
   *
   * @param nombre the nombre
   */
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  /**
   * Gets apellidos.
   *
   * @return the apellidos
   */
  public String getApellidos() {
    return apellidos;
  }

  /**
   * Sets apellidos.
   *
   * @param apellidos the apellidos
   */
  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  /**
   * Gets telefono.
   *
   * @return the telefono
   */
  public Integer getTelefono() {
    return telefono;
  }

  /**
   * Sets telefono.
   *
   * @param telefono the telefono
   */
  public void setTelefono(Integer telefono) {
    if (Util.validarTelefono(telefono)) {
      System.out.println("Número de teléfono no válido");
    } else {
      this.telefono = telefono;
    }
  }

  /**
   * Devuelve el nombre completo.
   *
   * @return  el nombre completo
   */
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

  /**
   * Clase Utilitaria para Personas.
   */
  public static class Util {
    private static final int MAX_TELEFONO = 799999999;
    private static final int MIN_TELEFONO = 600000000;

    /**
     * Validar telefono boolean.
     *
     * @param telefono the telefono
     * @return the boolean
     */
    public static boolean validarTelefono(Integer telefono) {
      return telefono > MAX_TELEFONO || telefono < MIN_TELEFONO;
    }
  }
}
