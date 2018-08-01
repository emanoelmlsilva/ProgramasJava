/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 *
 * @author emano
 */
public class MudarJanelas {                                                                                                                                              
    private String listaFXML[] = {"FXMLPraiaGenerico.fxml","FXMLPraia.fxml","FXMLMunicipio.fxml","FXMLMenu.fxml","FXMLMeioDeHospedagem.fxml","FXMLListaMunicipio.fxml","FXMLListaDeAtrativos.fxml","FXMLEventoProgramado.fxml","FXMLAtrativoTuristico.fxml","FXMLAtrativoArtificial.fxml","FXMLAreaDeInteresseTuristico.fxml"};
    private List<Stage> listaStage;
    
    public MudarJanelas(){
        Stage stage = new Stage();
        listaStage = new ArrayList();
        for(int i = 0;i<listaFXML.length;i++){
           listaStage.add(stage);            
        }
    }
    
    public void abrirJanelas(String FXML,String Titler) throws IOException{                   
        Parent root = FXMLLoader.load(getClass().getResource(FXML));  ////Gui.nomeFXml
        Scene scene = new Scene(root);
        scene.setRoot(root);
        Stage stageJ = new Stage();
        stageJ.setScene(scene);
        stageJ.setResizable(true);
        stageJ.setTitle(Titler);
        adicionarStage(FXML,stageJ);
        stageJ.show();           
    }
    
    public void fecharJanelas(String fxml) throws IOException{        
       Stage stageFechar = pegarStage(fxml);         
       stageFechar.close();
    }
    
    public void adicionarStage(String FXML,Stage stage){
        for(int i = 0;i < listaFXML.length;i++){            
            if(listaFXML[i].equals(FXML)){                
                listaStage.set(i, stage);       
                break;
            }
        }        
               
    }
    
    public Stage pegarStage(String FXML){   
        for(int i = 0;i < this.listaFXML.length;i++){            
            if(this.listaFXML[i].equals(FXML)){               
                return listaStage.get(i);
            }
        }
        return null;
    }
}
