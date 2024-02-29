package edu.controladores;

import java.util.ArrayList;
import java.util.List;

import edu.Dtos.clienteDto;
import edu.servicios.MenuImplementacion;
import edu.servicios.MenuInterfaz;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean cerrarMenu = false;
		List<clienteDto> clientes = new ArrayList<clienteDto>();
		MenuInterfaz menu = new MenuImplementacion();
		
		while(!cerrarMenu) {
			int num = menu.opcion();
			
			switch(num) {
				
			case 0: 
				System.out.println("Se cerrará el menú");
				cerrarMenu = true;
				break;
				
			case 1:
				System.out.println("Has elegido versión empleado");
				int numEmpleado = menu.opcionEmpleado();
				switch(numEmpleado) {
					case 0: 
						System.out.println("Se cerrará el menú");
						cerrarMenu = true;
						break;
						
					case 1:
						System.out.println("Se Validará un cliente");
						break;
						
					case 2:
						System.out.println("Se Borrará un cliente");
						break;
						
					case 3:
						System.out.println("Se Mostrarán los clientes");
						for (clienteDto cliente : clientes) {
							System.out.println(cliente);
						}
						break;
					}
					
				
				break;
				
			case 2:
				System.out.println("Has elegido versión cliente");
				int numCliente = menu.opcionCliente();
				switch(numCliente) {
					case 0: 
						System.out.println("Se cerrará el menú");
						cerrarMenu = true;
						break;
					case 1:
						System.out.println("Registrar Cliente");
						break;
					case 2:
						System.out.println("Login del Cliente");
						break;
				}
				break;
			}
		}
	}

}
