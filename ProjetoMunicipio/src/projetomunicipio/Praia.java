package projetomunicipio;

import java.io.Serializable;

public class Praia extends AtrativoNatural implements Serializable{
	
	private String perigoTubarao;
	private String propriaParaBanho;
	private	String tipoDeOrla;
	public String TIPO_MAR_ABERTO = "Mar";
	public String TIPO_PEQUENAS_ONDAS = "Pequenas Ondas";
	public String TIPO_MAR_ABRIGADO = "Mar Abrigado";
	public String TIPO_ONDAS_MEDIAS = "Ondas Medias";
	public String TIPO_PISCINAS_NATURAIS = "Piscinas Naturais";
	public String TIPO_ONDAS_FORTES = "Ondas Fortes";
	
	public Praia(String perigoTubarao,String propriaParaBanho,String tipoDeOrla,String nome,double latitude,double longitude,String comoChegar,String site,String infoContato) {
		super(nome,latitude,longitude,comoChegar,site,infoContato);
		this.perigoTubarao = perigoTubarao;
		this.propriaParaBanho = propriaParaBanho;
		this.tipoDeOrla = tipoDeOrla;
	}
	
	public String getDescricao() {
		return "Praia: "+this.getNome()+" Tipo de Orla "+this.tipoDeOrla+" como Chegar: "+this.getComoChegar()+" Site: "+this.getSite()+" Info Contato: "+this.getInfoContato();
	}
	
	public String getPerigoTubarao() {
		return perigoTubarao;
	}
	public void setPerigoTubarao(String perigoTubarao) {
		this.perigoTubarao = perigoTubarao;
	}
	public String getPropriaParaBanho() {
		return propriaParaBanho;
	}
	public void setPropriaParaBanho(String propriaParaBanho) {
		this.propriaParaBanho = propriaParaBanho;
	}
	public String getTipoDeOrla() {
		return tipoDeOrla;
	}
	public void setTipoDeOrla(String tipoDeOrla) {
		this.tipoDeOrla = tipoDeOrla;
	}
	
	public String getTipo() {
		return "Praia";
	}
	
}
