package servicios;

import java.util.List;
import java.util.Scanner;

import dtos.PacienteDto;

public class OperacionImplementacion implements OperacionInterfaz {

	public void darAlta(List <PacienteDto> listaClientes, Scanner sc) {
		PacienteDto pacienteNuevo = nuevoPaciente(sc);
		listaClientes.add(pacienteNuevo);
	}
	
	
	private PacienteDto nuevoPaciente(Scanner sc) {
		System.out.println("Inserte id");
		long idPaciente = sc.nextLong();
		System.out.println("Inserte nombre");
		String nombrePaciente = sc.next();
		System.out.println("Inserte edad");
		int edadPaciente = sc.nextInt();
		System.out.println("Inserte fecha de nacimiento");
		String fchNacimiento = sc.next();
		System.out.println("Inserte Sexo biologico");
		char sexoBiologicoPaciente = sc.next().charAt(0);
		System.out.println("Inserte especie del paciente");
		String especieDePaciente = sc.next();
		System.out.println("Inserte id de esclavo");
		long idEsclavo = sc.nextLong();
		
		PacienteDto pacienteNuevo = new PacienteDto(idPaciente,nombrePaciente,edadPaciente, fchNacimiento, sexoBiologicoPaciente, especieDePaciente, idEsclavo); 
		return pacienteNuevo;
	}
	
	public void verificarEsclavo(List <PacienteDto> listaClientes){
		
		
	}
}
