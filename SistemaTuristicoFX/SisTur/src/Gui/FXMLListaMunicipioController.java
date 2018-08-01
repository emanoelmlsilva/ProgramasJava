/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import static Gui.SisTur.areaDeInteresseTuristico;
import static Gui.SisTur.apagarMA;
import static Gui.SisTur.armazenamento;
import static Gui.SisTur.janelas;
import Motor.Municipio;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author emano
 */
public class FXMLListaMunicipioController implements Initializable {
    
    private List<Municipio> municipios;
    
    private ObservableList<Municipio> obsListaMunicipios;
     
    @FXML
    private ListView<Municipio> lbListaMunicipios =  new ListView<Municipio>();
    
    @FXML
    private Button btnVoltar;
    
    @FXML
    private Button btnApagar;
    
    @FXML
    void BotaoVoltar(ActionEvent event) throws IOException{     
        Municipio m = lbListaMunicipios.getSelectionModel().getSelectedItem();            
        janelas.fecharJanelas("FXMLListaMunicipio.fxml");        
        janelas.abrirJanelas("FXMLMenu.fxml", "MENU DE OPÇÕES");        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {            
            janelas.fecharJanelas("FXMLMenu.fxml");            
            carregarListaAtrativoMunicipio();            
            armazenamento.gravarMunicipio(municipios);            
        } catch (IOException ex) {
            Logger.getLogger(FXMLListaMunicipioController.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }    
    
    public void carregarListaAtrativoMunicipio() {           
        municipios = areaDeInteresseTuristico.getMunicipios();        
        obsListaMunicipios = FXCollections.observableArrayList(municipios);       
        lbListaMunicipios.setItems(obsListaMunicipios);              
    }
    
    @FXML
    public void BotaoApagar(ActionEvent event) throws IOException{        
        Municipio municipio = lbListaMunicipios.getSelectionModel().getSelectedItem();        
        if(municipio != null){
            apagarMA.apagarMunicipio(municipio);
            JOptionPane.showMessageDialog(null,"O municipio "+municipio+" foi apagado");
            janelas.fecharJanelas("FXMLListaMunicipio.fxml");        
            janelas.abrirJanelas("FXMLListaMunicipio.fxml", "Mostrar Municipios");
            armazenamento.gravarMunicipio(municipios);
            //armazenamento.salvarCriarArquivo(areaDeInteresseTuristico);
        }else{
            JOptionPane.showMessageDialog(null,"Informe um município");
        }
        
    }
        
}