package com.es.everis.beca.restaurante;

import com.es.everis.beca.restaurante.controller.ReservaController;
import com.es.everis.beca.restaurante.modelo.Camarero;
import com.es.everis.beca.restaurante.modelo.Cocinero;
import com.es.everis.beca.restaurante.modelo.Empleado;
import com.es.everis.beca.restaurante.modelo.Mesa;

public class Restaurante {

	public static Mesa[]     mesas     = new Mesa[20];
	public static Empleado[] empleados = new Empleado [5];
	
	public static ReservaController controlReservas = new ReservaController();

	public static void inicializarRestaurante(){
		for (int i = 0; i < mesas.length; i++) {
			mesas[i] = new Mesa();	
			mesas[i].setId(i+1);
			mesas[i].setLibre(true);
		}
				
		empleados[0] = new Cocinero();
		empleados[1] = new Camarero();
		empleados[2] = new Camarero();
		empleados[3] = new Camarero();

	}
}
