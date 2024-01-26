package servicios;

import java.util.List;
import java.util.Scanner;

import dtos.EsclavoDto;
import dtos.PacienteDto;

public interface OperacionInterfaz {

	public void darAlta(List <PacienteDto> listaClientes, Scanner sc, List<EsclavoDto> listaEsclavo);

}
