package projetomunicipio;

import java.io.Serializable;

public class MeioDeHospedagem implements Serializable{
    
    private String nome;
    private double latitude;
    private double longitude;
    private String infoContato;
    private String site;
    private String tipoHospedagem;
    private Endereço endereço;
    public static final String TIPO_HOTEL = "Hotel";
    public static final String TIPO_POUSADA = "Pousada";
    public static final String TIPO_ALBERGUE = "Albergue";


    public MeioDeHospedagem(String nome,double latitude,double longitude,String infoContato,String site,String tipoHospedagem,Endereço endereço){
        this.nome = nome;
        this.latitude = latitude;
        this.infoContato = infoContato;
        this.site = site;
        this.tipoHospedagem = tipoHospedagem;
        this.endereço = endereço;
    }

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


    public String getInfoContato() {
            return infoContato;
    }


    public void setInfoContato(String infoContato) {
            this.infoContato = infoContato;
    }


    public String getSite() {
            return site;
    }


    public void setSite(String site) {
            this.site = site;
    }


    public String getTipoHospedagem() {
            return tipoHospedagem;
    }


    public void setTipoHospedagem(String tipoHospedagem) {
            this.tipoHospedagem = tipoHospedagem;
    }


    public Endereço getEndereço() {
            return endereço;
    }


    public void setEndereço(Endereço endereço) {
            this.endereço = endereço;
    }


}