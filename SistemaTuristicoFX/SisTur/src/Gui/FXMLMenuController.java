/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

//import static Gui.FXMLAreaDeInteresseTuristicoController.*;
import static Gui.SisTur.areaDeInteresseTuristico;
import static Gui.SisTur.janelas;
import Motor.Municipio;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author emano
 */
public class FXMLMenuController implements Initializable {

    private List<Municipio> municipios;
    private ObservableList<Municipio> obsListaMunicipio;
    protected static Stage stageMunicipio;
    protected static Stage stageAtrativoTuristico;
    protected static Stage stageListaMunicipio;
    protected static Stage stageListaDeAtrativos;
   // protected static AreaDeInteresseTuristico areaDeInteresseTuristico = null;
    
    @FXML
    private Button btnCadastraMunicipio;

    @FXML
    private Button btnCadastraAtrativoTuristico;

    @FXML
    private Button btnListaMunicipio;
    
    @FXML
    private Button btnListaAtrativo;

    @FXML
    private Button btnSair;

    @FXML
    private Label txtAreaInteresse;
    
    @FXML
    private ComboBox<Municipio> cbMunicipio;
    
    @FXML
    public void BotaoCadastraAtrativoTuristico(ActionEvent event) throws Exception {//OK
        if(areaDeInteresseTuristico.getMunicipios().size() > 0){//FXMLAreaDeInteresseTuristicoController.listaMunicipio            
            janelas.abrirJanelas("FXMLAtrativoTuristico.fxml","CADASTRA ATRATIVO TURISTICO");            
            janelas.fecharJanelas("FXMLMenu.fxml");                        
        }else{
            JOptionPane.showMessageDialog(null,"Não à Municípios Cadastrados","Informação",JOptionPane.INFORMATION_MESSAGE);
        }     
    }

    @FXML
    public void BotaoCadastraMunicipio(ActionEvent event) throws Exception{//OK
        janelas.abrirJanelas("FXMLMunicipio.fxml", "Cadastro Municipio");        
        janelas.fecharJanelas("FXMLMenu.fxml");
    }

    @FXML
    void BotaoListaMunicipio(ActionEvent event) throws Exception {//OK    
        if(areaDeInteresseTuristico.getMunicipios().size() > 0){            
            janelas.abrirJanelas("FXMLListaMunicipio.fxml", "Mostrar Municipios");
        }else {
            JOptionPane.showMessageDialog(null,"Não à Municípios Cadastrados","Informação",JOptionPane.INFORMATION_MESSAGE);
        }       
    }

    @FXML
    void BotaoListaAtrativo(ActionEvent event) throws Exception {//OK              
        if(areaDeInteresseTuristico.getMunicipios().size() > 0 && areaDeInteresseTuristico.getMunicipios().get(0).getAtrativoTuristico().size() > 0){                    
            janelas.abrirJanelas("FXMLListaDeAtrativos.fxml", "Escolher o Municipio");                        
        }else{
            JOptionPane.showMessageDialog(null,"Não à Atrativo Cadastrado","Informação",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    @FXML
    void BotaoSair(ActionEvent event) throws IOException{//OK
        janelas.fecharJanelas("FXMLMenu.fxml");        
    }   
    
    @Override    
    public void initialize(URL url, ResourceBundle rb){
        txtAreaInteresse.setText(areaDeInteresseTuristico.getNome());                 
        btnListaMunicipio.setText("LISTA\nMUNICÍPIO");
        btnCadastraAtrativoTuristico.setText("CADASTRA\n ATRATIVO TURÍSTICO");
        btnCadastraMunicipio.setText("CADASTRA\nMUNICÍPIO");
        btnListaAtrativo.setText("LISTA\nATRATIVO TURISTICO");        
    }    
    
    public void carregarListaMunicipio(){       
        municipios = areaDeInteresseTuristico.getMunicipios();     
        obsListaMunicipio = FXCollections.observableArrayList(municipios);           
        cbMunicipio.setItems(obsListaMunicipio);        
        
    }
    
    
    
}
