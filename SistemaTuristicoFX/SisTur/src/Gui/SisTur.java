/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

//import Motor.AreaDeInteresseTuristico;
import Exception.AtrativoJaExisteException;
import Exception.MunicipioJaExisteException;
import Exception.MunicipioNaoExisteException;
import Motor.AreaDeInteresseTuristico;
import Motor.Armazenamento;
import Motor.AtrativoTuristico;
import Motor.Municipio;
import java.io.IOException;
import java.util.List;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author emano
 */
public class SisTur extends Application {
    
    protected static List<Municipio> listaMunicipio;   
    protected static Armazenamento armazenamento = new Armazenamento();
    protected static MudarJanelas janelas = new MudarJanelas();
    protected static ApagarMunicipioAtrativos apagarMA = new ApagarMunicipioAtrativos();
    protected static  AreaDeInteresseTuristico areaDeInteresseTuristico;                      
    @Override
    public void start(Stage stage) throws IOException  {          
        areaDeInteresseTuristico = armazenamento.recuperarAreaInteresse();
        if(areaDeInteresseTuristico != null){    
            // recupera os municipios e os atrativos antes de iniciar o programa
            List<Municipio> listaMunicipio = null;            
            try {
                listaMunicipio = armazenamento.recuperarMunicipio();
                for(Municipio municipioRecuperados:listaMunicipio){
                    try{
                        areaDeInteresseTuristico.cadastrarMunicipio(municipioRecuperados);
                    }catch(MunicipioJaExisteException erro){
                        System.out.println("Municipio não sera cadastrado porque ja existe");
                    }
                }
                for(Municipio municipio:areaDeInteresseTuristico.getMunicipios()){
                    try {                        
                        for(AtrativoTuristico at:armazenamento.recuperarAtrativo(municipio.getNome())){
                            try {                                
                                areaDeInteresseTuristico.cadastrarAtrativoTuristico(at, municipio.getNome(), municipio.getEstado());
                            } catch (MunicipioNaoExisteException ex) {
                                System.out.println("Municipio não sera cadastrado porque ja existe");
                            } catch (AtrativoJaExisteException ex) {
                                System.out.println("Atrativo não sera cadastrado porque ja existe");
                            }

                        }
                    } catch (IOException ex) {
                        System.out.println("lista de atrativo vazia");
                    }
                }
            } catch (IOException ex) {
                System.out.println("lista de municipio vazia");
            }                            
            //Abrir janela do menu
            janelas.abrirJanelas("FXMLMenu.fxml","MENU DE OPÇÕES");    
        }else{
            System.out.println("Arquivo não encontrado");                       
            try {
                janelas.abrirJanelas("FXMLAreaDeInteresseTuristico.fxml", "CADASTRA AREA DE INTERESSE");            
            } catch (IOException erro) {
                System.out.println("cadastrar area nao encontrado");            
            }
        }                                          
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
