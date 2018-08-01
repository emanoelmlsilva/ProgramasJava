package Motor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Armazenamento {
    
  /*  public boolean verificarAquivoExistente(){
        try{
            FileInputStream arquivo = new FileInputStream("arquivoSisTur/dados.arq");
            ObjectInputStream tranformaArqObj = new ObjectInputStream(arquivo);
            FXMLAreaDeInteresseTuristicoController.areaDeInteresseTuristico = (AreaDeInteresseTuristico) tranformaArqObj.readObject();
            System.out.println("Arquivo ja existe");
            return true;
        }catch(Exception e){
            System.out.println("Arquivo não existe");
            return false;
        }     
    }
    
   /* public boolean salvarCriarArquivo(AreaDeInteresseTuristico areaDeInteresseTuristico){
        try{
            FileOutputStream arquivo = new FileOutputStream ("arquivoSisTur/dados.arq");
            ObjectOutputStream tranformaArqObj = new ObjectOutputStream(arquivo);            
            tranformaArqObj.writeObject(areaDeInteresseTuristico);
            tranformaArqObj.flush();
            System.out.println("Arquivo salvo ou criado com sucesse");
            return true;
        }catch(Exception e){
            System.out.println("Arquivo");
            return false;
        }                
    }*/
    
    public void gravarMunicipio(List<Municipio> listaMunicipio) throws IOException{         
        BufferedWriter gravador = null;        
        try{            
            gravador = new BufferedWriter(new FileWriter("municipios"));           
            for(Municipio municipios : listaMunicipio){
                gravador.write(municipios.getNome()+"\n"+municipios.getPopulaçao()+" "+municipios.getLatitude()+" "+municipios.getLongitude()+" "+municipios.getEstado()+" "+municipios.getSite()+"\n");                
            }
        }finally{
            if(gravador != null){
                gravador.close();
            }
        }
    }
    
    public List<Municipio> recuperarMunicipio() throws IOException{
        BufferedReader muniRecuperado = null;
        String nome = null;       
        List<Municipio> listaMunicipio = new ArrayList<Municipio>();
        try{
            muniRecuperado = new BufferedReader(new FileReader("municipios"));
            do{
                nome = muniRecuperado.readLine();               
                if(nome != null){
                    String texto = muniRecuperado.readLine();               
                    String[] todos = texto.split(" ");                                        
                    int populacao = Integer.parseInt(todos[0]);
                    double latitude = Double.parseDouble(todos[1]);
                    double longitude = Double.parseDouble(todos[2]);
                    String estado = todos[3];
                    String site = todos[4];
                    Municipio muni = new Municipio(nome,populacao,new ArrayList(),latitude,longitude,new ArrayList(),estado,site);
                    listaMunicipio.add(muni);
                }
            }while(nome != null);
        }finally{
            if(muniRecuperado != null){                
                muniRecuperado.close();
            }
        }
        return listaMunicipio;
    }
    
    public void gravarAtrativo(List<AtrativoTuristico> listaAtrativos,String nomeArquivo) throws IOException{
        BufferedWriter gravador = null;
        try{
            gravador = new BufferedWriter(new FileWriter("atrativos"+nomeArquivo));
            for(AtrativoTuristico atrativos:listaAtrativos){               
                if(atrativos instanceof AtrativoNatural){
                    if (atrativos  instanceof Praia){
                        gravador.write("Praia "+atrativos.getNome()+" "+atrativos.getLatitude()+" "+atrativos.getLongitude()+" "+atrativos.getComoChegar()+" "+atrativos.getSite()+" "+atrativos.getSite()+" ");
                        Praia atrativoP = (Praia) atrativos;
                        gravador.write(atrativoP.getPerigoTubarao()+" "+atrativoP.getPropriaParaBanho()+" "+atrativoP.getTipoDeOrla()+"\n");
                    }else{
                        gravador.write("AtrativoNatural "+atrativos.getNome()+" "+atrativos.getLatitude()+" "+atrativos.getLongitude()+" "+atrativos.getComoChegar()+" "+atrativos.getSite()+" "+atrativos.getSite()+"\n");
                    }                                       
                }else if(atrativos  instanceof EventoProgramado){
                    gravador.write("EventoProgramado "+atrativos.getNome()+" "+atrativos.getLatitude()+" "+atrativos.getLongitude()+" "+atrativos.getComoChegar()+" "+atrativos.getSite()+" "+atrativos.getSite()+" ");
                    EventoProgramado atrativoE = (EventoProgramado) atrativos;
                    gravador.write(atrativoE.getDataInicio()+" "+atrativoE.getDataFim()+" "+atrativoE.getTipo()+" "+atrativoE.getEndereço().getBairro()+" "+atrativoE.getEndereço().getLogradouro()+" "+atrativoE.getEndereço().getNumero()+"\n");
                }
            }
        }finally{
            if(gravador != null){
                gravador.close();
            }
        }
    }
    
    public List<AtrativoTuristico> recuperarAtrativo(String nomeArquivo) throws FileNotFoundException, IOException{
        BufferedReader atrativoRecuperado = null;
        String texto = null;
        AtrativoTuristico atrativo = null;
        List<AtrativoTuristico> listaRetorno = new ArrayList();
        try{         
            atrativoRecuperado = new BufferedReader(new FileReader("atrativos"+nomeArquivo));
            do{
                texto = atrativoRecuperado.readLine();
                if(texto != null){                    
                    String[] listaRetornada = texto.split(" ");                     
                    String type = listaRetornada[0];
                    String nomeAtratTuristico = listaRetornada[1];
                    double latitudeAtratTuristico = Double.parseDouble(listaRetornada[2]);
                    double longitudeAtratTuristico = Double.parseDouble(listaRetornada[3]);
                    String comoChegar = listaRetornada[4];
                    String siteAtratTuristico = listaRetornada[5];
                    String infoContato = listaRetornada[6];                                                             
                    if(type.equals("AtrativoNatural")){
                        atrativo = new AtrativoNatural(nomeAtratTuristico, latitudeAtratTuristico,longitudeAtratTuristico, comoChegar, siteAtratTuristico, infoContato);
                    } else if(type.equals("Praia")){
                        boolean perigoT = Boolean.getBoolean(listaRetornada[7]);
                        boolean propriaB = Boolean.getBoolean(listaRetornada[8]);
                        String tipoO = listaRetornada[9];
                        atrativo = new Praia(perigoT, propriaB,tipoO,nomeAtratTuristico, latitudeAtratTuristico, longitudeAtratTuristico, comoChegar, siteAtratTuristico,infoContato) ;
                    }else if(type.equals("EventoProgramado")){
                        String dataI = listaRetornada[7];
                        String dataF = listaRetornada[8];
                        String tipo = listaRetornada[9];
                        String bairro = listaRetornada[10];
                        String logradouro = listaRetornada[11];
                        String numero = listaRetornada[12];
                        Endereço endereço = new Endereço(bairro,logradouro,numero);
                        atrativo = new EventoProgramado(nomeAtratTuristico,latitudeAtratTuristico, longitudeAtratTuristico,comoChegar,siteAtratTuristico,infoContato ,dataI,dataF,tipo,endereço);
                    }                   
                    listaRetorno.add(atrativo);                   
                }
            }while(texto != null);
        }finally{
            if(atrativoRecuperado != null){          
                atrativoRecuperado.close();
            }
        }        
        return listaRetorno; 
    }
    
    public void gravarAreaInteresse(String areaInterrese) throws IOException{
        BufferedWriter gravador = null;
        try{
            gravador = new BufferedWriter(new FileWriter("AreaInteresse"));            
            gravador.write(areaInterrese);            
        }finally{
            if(gravador != null){
                gravador.close();
            }
        }        
    }
    
    public AreaDeInteresseTuristico recuperarAreaInteresse() throws FileNotFoundException, IOException {
        BufferedReader recuperado = null;
        String nome = null;        
        AreaDeInteresseTuristico areaInterrese = null;
        try{
            recuperado = new BufferedReader(new FileReader("AreaInteresse"));
            nome = recuperado.readLine();           
            if(nome != null){                
                areaInterrese = new AreaDeInteresseTuristico(new ArrayList<Municipio>(),nome);             
            }            
        }finally{
            if(recuperado != null){
                recuperado.close();
            }
        }
        return areaInterrese;
    }
        
}