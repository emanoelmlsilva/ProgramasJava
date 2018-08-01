package projetomunicipio;

import java.io.Serializable;

public class EventoProgramado extends AtrativoTuristico implements Serializable{  

    private String dataInicio;
    private String dataFim;
    private String tipoO;
    private Endereço endereço;
    public static final String TIPO_FESTA = "Festa";
    public static final String TIPO_FEIRA_GASTRONOMICA = "Feira Gastronomica";

    public EventoProgramado(String nome,double latitude,double longitude,String comoChegar,
    String site,String infoContato ,String dataInicio,String dataFim,String tipo,Endereço endereço){
        super(nome,latitude,longitude,comoChegar,site,infoContato);
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.endereço = endereço;
        this.tipoO = tipo;
    }

    public String getDescricao(){
        return  "Evento "+super.getNome()+" DATA DE INICIO "+this.dataInicio+" DATA DE FIM "+this.dataFim+" Tipo "+this.tipoO+" Endereço "+this.endereço+ " como Chegar "+super.getComoChegar()+" Site "+super.getSite()+" informação de contato "+super.getInfoContato();
    }
    
    public String toString(){
        return  "Evento "+super.getNome()+" DATA DE INICIO "+this.dataInicio+" DATA DE FIM "+this.dataFim+" Tipo "+this.tipoO+" Endereço "+this.endereço+ " como Chegar "+super.getComoChegar()+" Site "+super.getSite()+" informação de contato "+super.getInfoContato();
    }

	public String getDataInicio() {
		return this.dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDataFim() {
		return dataFim;
	}

	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}

	public String getTipoO() {
		return this.tipoO;
	}

	public void setTipoO(String tipo) {
		this.tipoO = tipo;
	}

	public Endereço getEndereço() {
		return endereço;
	}

	public void setEndereço(Endereço endereço) {
		this.endereço = endereço;
	}
	
	public String getTipo() {
		return "Evento Programado";
	}
}