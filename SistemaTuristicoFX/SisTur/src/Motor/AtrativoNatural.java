package Motor;

import java.io.Serializable;

public class AtrativoNatural extends AtrativoTuristico implements Serializable{

    public AtrativoNatural(String nome,double latitude,double longitude,String comoChegar,String site,String infoContato){
        super(nome,latitude,longitude,comoChegar,site,infoContato);
    }

    public String getDescricao(){
        return "Atrativo Natural "+super.getNome()+" ,como Chegar "+super.getComoChegar()+" ,Site "+super.getSite()+" ,informação de contato "+super.getInfoContato();
    }
    
    public String toString(){
        return "Atrativo Natural "+super.getNome()+" ,como Chegar "+super.getComoChegar()+" ,Site "+super.getSite()+" ,informação de contato "+super.getInfoContato();
    }

}