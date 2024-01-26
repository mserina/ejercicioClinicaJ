package dtos;

public class EsclavoDto {
	long idEsclavo;
	String nombreEsclavo;
	String apellidosEsclavo;
	String dniEsclavo;
	String tlfEsclavo;


//GETTERS AND SETTERS

	
	public long getIdEsclavo() {
		return idEsclavo;
	}
	public void setIdEsclavo(long idEsclavo) {
		this.idEsclavo = idEsclavo;
	}
	public String getNombreEsclavo() {
		return nombreEsclavo;
	}
	public void setNombreEsclavo(String nombreEsclavo) {
		this.nombreEsclavo = nombreEsclavo;
	}
	public String getApellidosEsclavo() {
		return apellidosEsclavo;
	}
	public void setApellidosEsclavo(String apellidosEsclavo) {
		this.apellidosEsclavo = apellidosEsclavo;
	}
	public String getDniEsclavo() {
		return dniEsclavo;
	}
	public void setDniEsclavo(String dniEsclavo) {
		this.dniEsclavo = dniEsclavo;
	}
	public String getTlfEsclavo() {
		return tlfEsclavo;
	}
	public void setTlfEsclavo(String tlfEsclavo) {
		this.tlfEsclavo = tlfEsclavo;
	}
	
	
//CONTROLADORES
	
	public EsclavoDto() {
		super();
	}
	
	public EsclavoDto(String nombreEsclavo, String apellidosEsclavo, String dniEsclavo, String tlfEsclavo,
			long idEsclavo) {
		super();
		this.nombreEsclavo = nombreEsclavo;
		this.apellidosEsclavo = apellidosEsclavo;
		this.dniEsclavo = dniEsclavo;
		this.tlfEsclavo = tlfEsclavo;
		this.idEsclavo = idEsclavo;
	}
	
	
//TOSTRING
	@Override
	public String toString() {
		return "EsclavoDto [nombreEsclavo=" + nombreEsclavo + ", apellidosEsclavo=" + apellidosEsclavo + ", dniEsclavo="
				+ dniEsclavo + ", tlfEsclavo=" + tlfEsclavo + ", idEsclavo=" + idEsclavo + "]";
	}

	
	
	
	
	
	
}