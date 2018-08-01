package Motor;

import java.io.Serializable;

public class AtrativoArtificial extends AtrativoTuristico implements Serializable{
	private String fundacao;
	private String fundado;
	public AtrativoArtificial(String nome,double latitude,double longitude,String comoChegar,String site,String infoContato,String fundacao,String fundado) {
		super(nome,latitude,longitude,comoChegar,site,infoContato);
		this.fundacao = fundacao;
		this.fundado = fundado;
	}

	public String getDescricao() {
		return "Atrativo Artificial "+super.getNome()+" ,Ano de Fundação "+this.fundacao+" ,Fundador "+this.fundado+" ,como Chegar "+super.getComoChegar()+" ,Site "+super.getSite()+" ,Informação de contato "+super.getInfoContato();
	}
        
        public String toString() {
		return "Atrativo Artificial "+super.getNome()+" ,Ano de Fundação "+this.fundacao+" ,Funfador "+this.fundado+" ,como Chegar "+super.getComoChegar()+" ,Site "+super.getSite()+" ,Informação de contato "+super.getInfoContato();
	}
}
