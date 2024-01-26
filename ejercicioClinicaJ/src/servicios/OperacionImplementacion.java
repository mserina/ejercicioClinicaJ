package servicios;

import java.util.List;
import java.util.Scanner;

import dtos.EsclavoDto;
import dtos.PacienteDto;

public class OperacionImplementacion implements OperacionInterfaz {

	public void darAlta(List<PacienteDto> listaClientes, Scanner sc, List<EsclavoDto> listaEsclavo) {
		PacienteDto pacienteNuevo = nuevoPaciente(sc, listaClientes, listaEsclavo);
		listaClientes.add(pacienteNuevo);
	}

	private PacienteDto nuevoPaciente(Scanner sc, List<PacienteDto> listaClientes, List<EsclavoDto> listaEsclavo) {
		long idEsclavo = 0;
		PacienteDto paciente = new PacienteDto();
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
		System.out.println("El esclavo existe (s/n)");
		if (sc.next().equals("s")) {

			verificarEsclavo(listaClientes, listaEsclavo, sc);
		} else {

			paciente.setIdEsclavo(esclavoNuevo(sc, listaEsclavo));
		}

		PacienteDto pacienteNuevo = new PacienteDto(idPaciente, nombrePaciente, edadPaciente, fchNacimiento,
				sexoBiologicoPaciente, especieDePaciente, idEsclavo);

		return pacienteNuevo;
	}

	private long esclavoNuevo(Scanner sc, List<EsclavoDto> listaEsclavo) {
		System.out.println("Inserte id nuevo");
		long idEsclavo = sc.nextLong();
		System.out.println("Inserte nombre de Esclavo");
		String nombreEsclavo = sc.next();
		System.out.println("Inserte apellidos de Esclavo");
		String apellidosEsclavo = sc.next();
		System.out.println("Inserte DNI de Esclavo");
		String dniEsclavo = sc.next();
		System.out.println("Inserte telefono de Esclavo");
		String tlfEsclavo = sc.next();

		EsclavoDto esclavoNuevo = new EsclavoDto(nombreEsclavo, apellidosEsclavo, dniEsclavo, tlfEsclavo, idEsclavo);
		listaEsclavo.add(esclavoNuevo);
		return idEsclavo;

	}

	/*
	 * private void altaEsclavo(List<EsclavoDto> listaEsclavo, Scanner sc) {
	 * EsclavoDto esclavoNuevo = esclavoNuevo(sc); listaEsclavo.add(esclavoNuevo);
	 * }^
	 */

	public void verificarEsclavo(List<PacienteDto> listaClientes, List<EsclavoDto> listaEsclavo,
			Scanner sc)

	{
		PacienteDto paciente = new PacienteDto();
		// Contador que controla el while
		boolean cerrarBucle = false;
		while (!cerrarBucle) {
		
			System.out.println("Indique id del esclavo");
			long idEsclavoIndicado = sc.nextLong();

			for (EsclavoDto esclavo : listaEsclavo) {
				// Si el esclavoIndicado es igual al que pusimos, contador llegara a 1 (se
				// cierra el bucle), y añade el idEsclavoSeleccionado a idEsclavo de cliente
				if (idEsclavoIndicado == esclavo.getIdEsclavo()) {
					cerrarBucle = true;
					paciente.setIdEsclavo(idEsclavoIndicado);
					System.out.println("Se ha validado el esclavo");
				} else {
					System.out.println("No existe ese id esclavo");
					cerrarBucle = true;
				}
			}
		}
	}
}
