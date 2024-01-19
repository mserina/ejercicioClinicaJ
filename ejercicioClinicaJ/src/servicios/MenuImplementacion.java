package servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz{

	public int mostrarMenu() {
		int opcionRespuesta;
		Scanner sc = new Scanner(System.in);
		System.out.println("######################");
		System.out.println("0. CerrarMenu");
		System.out.println("1. Dar Alta Paciente");
		System.out.println("######################");
		
		opcionRespuesta = sc.nextInt();
		return opcionRespuesta;
	}

}
