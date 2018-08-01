/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import Exception.MunicipioNaoExisteException;
import static Gui.SisTur.apagarMA;
import static Gui.SisTur.areaDeInteresseTuristico;
import static Gui.SisTur.armazenamento;
import static Gui.SisTur.janelas;
import Motor.AtrativoTuristico;
import Motor.Municipio;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
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
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author emano
 */
public class FXMLListaDeAtrativosController implements Initializable {
    
    private List<Municipio> municipios;
    private Municipio municipioEscolhido;
    private ObservableList obsComboBox;
    private List<AtrativoTuristico> atrativoTuristico;
    private ObservableList obsListView;
    private List<Municipio> listaM = new ArrayList();
    @FXML
    private ListView<AtrativoTuristico> lvAtrativo;

    @FXML
    private ComboBox<Municipio> cbAtrativo;

    @FXML
    private Button btnAtrativo;
    
    @FXML
    private Button btnApagar;   

    @FXML
    void BotaoPesquisarAtrativo(ActionEvent event) {        
        carregarListView();                        
        
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       carregarComboBox();        
        try {
            janelas.fecharJanelas("FXMLMenu.fxml");
        } catch (IOException ex) {
            Logger.getLogger(FXMLListaDeAtrativosController.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }    
    
    public void carregarComboBox(){       
        municipios = areaDeInteresseTuristico.getMunicipios();     
        for(Municipio m:municipios){                         
            if(m.getAtrativoTuristico()!=null){ 
                if(m.getAtrativoTuristico().size() > 0){
                    listaM.add(m);
                }                
            }
        }        
        obsComboBox = FXCollections.observableArrayList(listaM);        
        cbAtrativo.setItems(obsComboBox);         
    }
    
    public void carregarListView(){
        municipioEscolhido = cbAtrativo.getSelectionModel().getSelectedItem(); 
        if(municipioEscolhido != null){
            try{
                atrativoTuristico = areaDeInteresseTuristico.getAtrativosTuristicosDoMunicipio(municipioEscolhido.getNome(),municipioEscolhido.getEstado());          
                obsListView = FXCollections.observableArrayList(atrativoTuristico);
                lvAtrativo.setItems(obsListView);       
            }catch(MunicipioNaoExisteException erro){
                System.out.println(erro.getMessage());
            }
        }else{
            JOptionPane.showMessageDialog(null,"Informe um município");
        }                       
    }
    
    @FXML
    public void BotaoVoltar(ActionEvent event) throws IOException{        
        janelas.fecharJanelas("FXMLListaDeAtrativos.fxml");
        janelas.abrirJanelas("FXMLMenu.fxml", "MENU DE OPÇÕES");      
    }
    
     @FXML
    void BotaoApagar(ActionEvent event) throws IOException {
        AtrativoTuristico atrativo = lvAtrativo.getSelectionModel().getSelectedItem();        
        if(atrativo != null){
            apagarMA.apagarAtrativo(municipioEscolhido, atrativo);
            JOptionPane.showMessageDialog(null,"O atrativo "+atrativo.getNome()+" do município "+municipioEscolhido+" foi apagado");
            janelas.fecharJanelas("FXMLListaDeAtrativos.fxml");
            janelas.abrirJanelas("FXMLListaDeAtrativos.fxml", "Escolher o Municipio");
            //armazenamento.salvarCriarArquivo(areaDeInteresseTuristico);
            armazenamento.gravarAtrativo(municipioEscolhido.getAtrativoTuristico(), municipioEscolhido.getNome());
        }else{
            JOptionPane.showMessageDialog(null,"Informe o atrativo");
        }
    }
       
}
