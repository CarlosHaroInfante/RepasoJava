package edu.servicios;

import java.util.List;
import java.util.Scanner;

import edu.Dtos.clienteDto;

public class FuncionClienteImplementacion implements FuncionClienteInterfaz{
	
	Scanner sc = new Scanner (System.in);
	
	public void registroCliente(List<clienteDto> listaAntigua) {
		
		
	}
	
	private clienteDto cliente() {
		clienteDto clienteN = new clienteDto();
		
		System.out.println("Datos del Cliente");
		
		System.out.println("DNI del cliente");
		clienteN.setDniCliente(sc.next());
		
		System.out.println("Nombre Completo");
		clienteN.setNombreCompletoCliente(sc.next());
		
		System.out.println("email");
		clienteN.setEmailCliente(sc.next());
		
		System.out.println("contraseña");
		clienteN.setContraseniaCliente(sc.next());
		
		return clienteN;
	}

}
