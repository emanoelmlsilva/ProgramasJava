package Motor;

import Exception.AtrativoJaExisteException;
import Exception.AtrativoNaoExisteException;
import java.io.Serializable;
import java.util.List;

public class Municipio implements Serializable{

    private String nome;
    private int populaçao;
    private List<AtrativoTuristico> atrativosTuristicos;
    private double latitude;
    private double longitude;
    private List<MeioDeHospedagem> meiosDeHospedagem;
    private String estado;
    private String site;

    public Municipio(){
        this.nome = "";
        this.populaçao = 0;
        this.atrativosTuristicos = null;
        this.latitude = 0;
        this.longitude = 0;
        this.meiosDeHospedagem = null;
        this.estado = "";
        this.site = "";  
    }
    public Municipio(String nome,int populaçao,List<AtrativoTuristico> atrativosTuristicos,double latitude,double longitude,List<MeioDeHospedagem> meiosDeHospedagem,String estado,String site){                         
        this.nome = nome;
        this.populaçao = populaçao;
        this.atrativosTuristicos = atrativosTuristicos;
        this.latitude = latitude;
        this.longitude = longitude;
        this.meiosDeHospedagem = meiosDeHospedagem;
        this.estado = estado;
        this.site = site;      
    }
 
    public void cadastrarAtrativoTuristico(AtrativoTuristico atrativo) throws AtrativoJaExisteException{        
    	for(AtrativoTuristico atrativoT:this.atrativosTuristicos) {
    		if(atrativoT.getNome().equals(atrativo.getNome())) {                        
    			throw new AtrativoJaExisteException(atrativoT.getNome()+" já existe");
    		}
    	}                
        this.atrativosTuristicos.add(atrativo);                    
    }

    public AtrativoTuristico pesquisarAtrativoTuristico(String nomeAtrativo) throws AtrativoNaoExisteException{
       for(AtrativoTuristico atrativo:this.getAtrativoTuristico()){
           if(nomeAtrativo.equals(atrativo.getNome())){
               System.out.println("entro");
                return atrativo;
            }
        }                
        throw new AtrativoNaoExisteException(nomeAtrativo+" não existe");
    }
    
    public List<AtrativoTuristico> getAtrativosTuristicos(){
        return this.atrativosTuristicos;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getPopulaçao(){
        return this.populaçao;
    }

    public void setPopulaçao(int populaçao){
        this.populaçao = populaçao;
    }   
    
    public List<AtrativoTuristico> getAtrativoTuristico(){
        return this.atrativosTuristicos;
    }
    															
    public void getAtrativoTuristico(List<AtrativoTuristico> atrativosTuristicos){
        this.atrativosTuristicos = atrativosTuristicos;
    }

    public double getLatitude(){
        return this.latitude;
    }

    public void setLatitude(double latitude){
        this.latitude = latitude;
    }

    public double getLongitude(){
        return this.longitude;
    }

    public void setLongitude(double longitude){
        this.longitude = longitude;
    }

    public List<MeioDeHospedagem> getMeiosDeHospedagem(){
        return this.meiosDeHospedagem;
    }

    public void setMeiosDeHospedagem(List<MeioDeHospedagem>meiosDeHospedagem){
        this.meiosDeHospedagem = meiosDeHospedagem;
    }

    public String getEstado(){
        return this.estado;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }

    public String getSite(){
        return site;
    }

    public void setSite(String site){
        this.site = site;
    }
    
    @Override
    public String toString(){
        return this.nome;
    }
      
}