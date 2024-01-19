package servicios;

import java.util.List;
import java.util.Scanner;

import dtos.PacienteDto;

public interface OperacionInterfaz {

	public void darAlta(List <PacienteDto> listaClientes, Scanner sc);
	
	public void verificarEsclavo(List <PacienteDto> listaClientes);

}
