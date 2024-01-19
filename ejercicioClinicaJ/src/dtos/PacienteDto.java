package dtos;

public class PacienteDto {
	
	//ATRIBUTOS
	long idPaciente;
	String nombrePaciente = "aaaaaaa";
	int edadPaciente = 1111;
	String fchNacimiento = "9999 12 31";
	char sexoBiologicoPaciente = 'a';
	String especieDePaciente ="aaaaaaa";
	long idEsclavo;
	
	
	//GETTERS & SETTERS
	public long getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(long idPaciente) {
		this.idPaciente = idPaciente;
	}
	public String getNombrePaciente() {
		return nombrePaciente;
	}
	public void setNombrePaciente(String nombrePaciente) {
		this.nombrePaciente = nombrePaciente;
	}
	public int getEdadPaciente() {
		return edadPaciente;
	}
	public void setEdadPaciente(int edadPaciente) {
		this.edadPaciente = edadPaciente;
	}
	public String getFchNacimiento() {
		return fchNacimiento;
	}
	public void setFchNacimiento(String fchNacimiento) {
		this.fchNacimiento = fchNacimiento;
	}
	public char getSexoBiologicoPaciente() {
		return sexoBiologicoPaciente;
	}
	public void setSexoBiologicoPaciente(char sexoBiologicoPaciente) {
		this.sexoBiologicoPaciente = sexoBiologicoPaciente;
	}
	public String getEspecieDePaciente() {
		return especieDePaciente;
	}
	public void setEspecieDePaciente(String especieDePaciente) {
		this.especieDePaciente = especieDePaciente;
	}
	public long getIdEsclavo() {
		return idEsclavo;
	}
	public void setIdEsclavo(long idEsclavo) {
		this.idEsclavo = idEsclavo;
	}
	
	//CONTROLADORES
	
	public PacienteDto() {
		super();
	}
	
	public PacienteDto(long idPaciente, String nombrePaciente, int edadPaciente, String fchNacimiento,
			char sexoBiologicoPaciente, String especieDePaciente, long idEsclavo) {
		super();
		this.idPaciente = idPaciente;
		this.nombrePaciente = nombrePaciente;
		this.edadPaciente = edadPaciente;
		this.fchNacimiento = fchNacimiento;
		this.sexoBiologicoPaciente = sexoBiologicoPaciente;
		this.especieDePaciente = especieDePaciente;
		this.idEsclavo = idEsclavo;
	}	
	
	//TOSTRING 
	
	@Override
	public String toString() {
		return "PacienteDto [idPaciente=" + idPaciente + ", nombrePaciente=" + nombrePaciente + ", edadPaciente="
				+ edadPaciente + ", fchNacimiento=" + fchNacimiento + ", sexoBiologicoPaciente=" + sexoBiologicoPaciente
				+ ", especieDePaciente=" + especieDePaciente + ", idEsclavo=" + idEsclavo + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}







