package br.com.easymedicows;

public class LocalizacaoMedicos {
	private String user;
	private String latitude;
	private String longitude;
	private String ativo;

	
	public LocalizacaoMedicos() {
		// TODO Auto-generated constructor stub
		this.ativo = "S"; //Sempre que crio um novo objeto, ele vai estar ativo
	}
	public String getUser() {
		return user;
	}
	
	public void setUser(String user){
		this.user = user;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getAtivo() {
		return ativo;
	}

	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}
	

}
