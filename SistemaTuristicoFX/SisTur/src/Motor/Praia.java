package Motor;

import java.io.Serializable;

public class Praia extends AtrativoNatural implements Serializable{
	
	private boolean perigoTubarao;
	private boolean propriaParaBanho;
	private	String tipoDeOrla;
	public String TIPO_MAR_ABERTO = "Mar";
	public String TIPO_PEQUENAS_ONDAS = "Pequenas Ondas";
	public String TIPO_MAR_ABRIGADO = "Mar Abrigado";
	public String TIPO_ONDAS_MEDIAS = "Ondas Medias";
	public String TIPO_PISCINAS_NATURAIS = "Piscinas Naturais";
	public String TIPO_ONDAS_FORTES = "Ondas Fortes";
	
	public Praia(boolean perigoTubarao,boolean propriaParaBanho,String tipoDeOrla,String nome,double latitude,double longitude,String comoChegar,String site,String infoContato) {
		super(nome,latitude,longitude,comoChegar,site,infoContato);
		this.perigoTubarao = perigoTubarao;
		this.propriaParaBanho = propriaParaBanho;
		this.tipoDeOrla = tipoDeOrla;
	}
	
	public String getDescricao() {
		return "Nome: "+this.getNome()+" Tipo de Orla "+this.tipoDeOrla+" como Chegar: "+this.getComoChegar()+" Site: "+this.getSite()+" Info Contato: "+this.getInfoContato();
	}
	
	public boolean getPerigoTubarao() {
		return perigoTubarao;
	}
	public void setPerigoTubarao(boolean perigoTubarao) {
		this.perigoTubarao = perigoTubarao;
	}
	public boolean getPropriaParaBanho() {
		return propriaParaBanho;
	}
	public void setPropriaParaBanho(boolean propriaParaBanho) {
		this.propriaParaBanho = propriaParaBanho;
	}
	public String getTipoDeOrla() {
		return tipoDeOrla;
	}
	public void setTipoDeOrla(String tipoDeOrla) {
		this.tipoDeOrla = tipoDeOrla;
	}

	public String getDescriçao(){
            return "Praia "+this.getNome()+" como chegar: "+this.getComoChegar()+" Site: "+this.getSite()+"  Contato: "+" Petigo Tubarão: "+this.perigoTubarao+" Propria para Banho: "+this.propriaParaBanho;
        }
        
        public String toString(){
            return "Praia "+this.getNome()+" como chegar: "+this.getComoChegar()+" Site: "+this.getSite()+"  Contato: "+" Petigo Tubarão: "+this.perigoTubarao+" Propria para Banho: "+this.propriaParaBanho;        }
}
