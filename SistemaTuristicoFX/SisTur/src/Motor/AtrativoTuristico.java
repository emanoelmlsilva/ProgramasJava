package Motor;

import java.io.Serializable;

public abstract class AtrativoTuristico implements Serializable{

    private String nome;
    private double latitude;
    private double longitude;
    private String comoChegar;
    private String site;
    private String infoContato;

    public AtrativoTuristico(){
        this.nome = "";
        this.latitude = 0;
        this.longitude = 0;
        this.comoChegar = "";
        this.site = "";
        this.infoContato = "";
    }

    public AtrativoTuristico(String nome,double latitude,double longitude,String comoChegar,String site,String infoContato){
        this.nome = nome;
        this.latitude = latitude;
        this.longitude = longitude;
        this.comoChegar = comoChegar;
        this.site = site;
        this.infoContato = infoContato;
    }

    public abstract String getDescricao();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public String getComoChegar() {
		return comoChegar;
	}

	public void setComoChegar(String comoChegar) {
		this.comoChegar = comoChegar;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getInfoContato() {
		return infoContato;
	}

	public void setInfoContato(String infoContato) {
		this.infoContato = infoContato;
	}
}