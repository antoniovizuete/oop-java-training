package com.es.everis.beca.restaurante;

import com.es.everis.beca.restaurante.controller.ReservaController;
import com.es.everis.beca.restaurante.modelo.Camarero;
import com.es.everis.beca.restaurante.modelo.Cocinero;
import com.es.everis.beca.restaurante.modelo.Empleado;
import com.es.everis.beca.restaurante.modelo.Mesa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * Clase contendora del Restaurante. Almacena las instancias de las clases del modelo de negocio.
 */
public class Restaurante {

  private static Restaurante restaurante;

  private List<Mesa> mesas;
  private List<Empleado> empleados;

  private Restaurante() {
    mesas = new ArrayList<>();
    empleados = new ArrayList<>();
    inicializarRestaurante();
  }

  public static Restaurante getInstance() {
    if(restaurante == null) {
      restaurante = new Restaurante();
    }
    return restaurante;
  }

  public List<Mesa> getMesas() {
    return mesas;
  }

  public void setMesas(List<Mesa> mesas) {
    this.mesas = mesas;
  }

  public List<Empleado> getEmpleados() {
    return empleados;
  }

  public void setEmpleados(List<Empleado> empleados) {
    this.empleados = empleados;
  }

  private void inicializarRestaurante() {
    for (int i = 1; i <= 20; i++) {
      mesas.add(new Mesa(i, true));
    }

    empleados.add(new Cocinero());
    empleados.add(new Camarero());
    empleados.add(new Camarero());
    empleados.add(new Camarero());

  }
}
