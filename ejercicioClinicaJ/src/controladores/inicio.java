package controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dtos.PacienteDto;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;
import servicios.OperacionImplementacion;
import servicios.OperacionInterfaz;

public class inicio {
	
	public static void main (String[] args) {
		boolean cerrarMenu = false;
		int opcionSeleccion;
		
		PacienteDto paciente1 = new PacienteDto();
		Scanner sc = new Scanner(System.in);
		MenuInterfaz menu = new MenuImplementacion();
		OperacionInterfaz op = new OperacionImplementacion();
		
		/**System.out.println(paciente1.toString());
		paciente1.setNombrePaciente("Miguel");
		System.out.println(paciente1.getNombrePaciente());
		**/
		List<PacienteDto> listaPaciente = new ArrayList<PacienteDto>();
		
		while(!cerrarMenu) {
			opcionSeleccion = menu.mostrarMenu();
			
			switch(opcionSeleccion) {
				case 0:
					cerrarMenu = true;
					break;
				case 1:
					op.darAlta(listaPaciente, sc);
					op.verificarEsclavo(listaPaciente);
					break;
			}
		}
		
		
		/**
		 * ArrayList<PacienteDto> arrayListPaciente = new ArrayList<PacienteDto>();
		   PacienteDto[] arrayPaciente = new PacienteDto[100];
		 */
		
		
		
	}
	

}
