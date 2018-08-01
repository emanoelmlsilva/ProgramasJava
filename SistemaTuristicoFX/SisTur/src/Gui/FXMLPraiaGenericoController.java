/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import Exception.AtrativoJaExisteException;
import Exception.MunicipioNaoExisteException;
import static Gui.FXMLAtrativoTuristicoController.comoChegar;
import static Gui.FXMLAtrativoTuristicoController.infoContato;
import static Gui.FXMLAtrativoTuristicoController.latitude;
import static Gui.FXMLAtrativoTuristicoController.longitude;
import static Gui.FXMLAtrativoTuristicoController.municipioEscolhido;
import static Gui.FXMLAtrativoTuristicoController.nome;
import static Gui.FXMLAtrativoTuristicoController.site;
import static Gui.SisTur.areaDeInteresseTuristico;
import static Gui.SisTur.armazenamento;
import static Gui.SisTur.janelas;
import Motor.AtrativoNatural;
import Motor.AtrativoTuristico;
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
//import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author emano
 */
public class FXMLPraiaGenericoController implements Initializable {
    //protected static Stage stagePraia;
    private ObservableList<String> obsListaOpcaoPG ;
    private List<String> listaPraiaGenerico = new ArrayList<String>();
    
    @FXML
    private ComboBox<String> cbPraiaGenerico;    
    
    @FXML
    private Button btnSelecionado;    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) { 
        try {
            janelas.fecharJanelas("FXMLAtrativoTuristico.fxml");
            carregarComboBox();        
        } catch (IOException ex) {
            System.out.println("erro ao fechar janela");
        }        
    }    
    
    @FXML
    void BotaoSelecionado(ActionEvent event) throws IOException {               
        String opçao = cbPraiaGenerico.getSelectionModel().getSelectedItem();        
        if(opçao.equals("Praia")){     
            janelas.abrirJanelas("FXMLPraia.fxml", "Cadastrar Praia");               
        }else if(opçao.equals("Generico")){            
            AtrativoTuristico atrativoTuristico = new AtrativoNatural(nome,latitude,longitude,site,comoChegar,infoContato);                                                    
            
            try {                                   
                areaDeInteresseTuristico.cadastrarAtrativoTuristico(atrativoTuristico,municipioEscolhido.getNome(),municipioEscolhido.getEstado());
                armazenamento.gravarAtrativo(municipioEscolhido.getAtrativoTuristico(), municipioEscolhido.getNome());
           }catch(AtrativoJaExisteException | MunicipioNaoExisteException erro){
                 System.out.println("atrativo ou municipio não existe(m) em praia generico");
            }  
            
            
            janelas.fecharJanelas("FXMLPraiaGenerico.fxml");
            janelas.abrirJanelas("FXMLMenu.fxml", "MENU DE OPÇÕES");              
        }
    }
    
    @FXML
    void BotaoVoltar(ActionEvent event) throws IOException {
        janelas.abrirJanelas("FXMLAtrativoTuristico.fxml", "CADASTRA ATRATIVO TURISTICO");
        janelas.fecharJanelas("FXMLPraiaGenerico.fxml");      
    }
    
    public void carregarComboBox(){
        listaPraiaGenerico.add("Praia");
        listaPraiaGenerico.add("Generico");
        obsListaOpcaoPG = FXCollections.observableArrayList(listaPraiaGenerico);              
        cbPraiaGenerico.setItems(obsListaOpcaoPG);
    }
}
