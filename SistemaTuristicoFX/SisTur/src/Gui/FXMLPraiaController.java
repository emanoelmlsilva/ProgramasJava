/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import Exception.AtrativoJaExisteException;
import Exception.MunicipioNaoExisteException;
import static Gui.FXMLAtrativoTuristicoController.*;
import static Gui.SisTur.areaDeInteresseTuristico;
import static Gui.SisTur.armazenamento;
import static Gui.SisTur.janelas;
import Motor.AtrativoTuristico;
import Motor.Praia;
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
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.paint.Color;

/**
 * FXML Controller class
 *
 * @author emano
 */
public class FXMLPraiaController implements Initializable {

    private List<String> listaTipoOrla;
    private ObservableList<String> obsListaTipoOrla;
    
    @FXML
    private RadioButton radioPerigoTubarao;

    @FXML
    private ToggleGroup grupoPerigoTubarao;

    @FXML
    private RadioButton radioNaoPerigoTubarao;

    @FXML
    private RadioButton radioPropriaBanho;

    @FXML
    private ToggleGroup grupoPropriaBanho;

    @FXML
    private RadioButton radioImpropriaBanho;

    @FXML
    private ComboBox<String> cbTipoOrla;
    
    @FXML
    private Button btnVoltar;

    @FXML
    private Button btnCadastrar;

    @FXML
    private Label txtInfo;
    
    @FXML
    void BotaoCadastrar(ActionEvent event) throws IOException {
        boolean perigoT = false,propriaB = false;          
        String tipoOrla = cbTipoOrla.getSelectionModel().getSelectedItem();
        if(tipoOrla != null){
            txtInfo.setText("");      
            txtInfo.setTextFill(Color.WHITE);   
            RadioButton opcaoGrupoPerigoTubarao = (RadioButton) grupoPerigoTubarao.getSelectedToggle();
            RadioButton opcaoGrupoPropriaBanho = (RadioButton) grupoPropriaBanho.getSelectedToggle();
            if(opcaoGrupoPerigoTubarao.equals("Perigo Tubarão")) {
                perigoT = true;
            }
            if(opcaoGrupoPropriaBanho.equals("Propria Para Banho")) {
                propriaB = true;
            }
            AtrativoTuristico atrativoTuristico = new Praia(perigoT,propriaB,tipoOrla,nome,latitude,longitude,comoChegar,site,infoContato);
            try{
                areaDeInteresseTuristico.cadastrarAtrativoTuristico(atrativoTuristico,municipioEscolhido.getNome(),municipioEscolhido.getEstado());                                   
                armazenamento.gravarAtrativo(municipioEscolhido.getAtrativoTuristico(), municipioEscolhido.getNome());
                janelas.abrirJanelas("FXMLMenu.fxml", "MENU DE OPÇÕES");
                janelas.fecharJanelas("FXMLPraia.fxml");                
            }catch(AtrativoJaExisteException | MunicipioNaoExisteException erro){
                 System.out.println("atrativo ou municipio não existe(m) em praia");
            }  
        }else{                                
            txtInfo.setText("Selecione um opção");      
            txtInfo.setTextFill(Color.RED);     
        }
        
    }

    @FXML
    void BotaoVoltar(ActionEvent event) throws IOException {
        janelas.fecharJanelas("FXMLPraia.fxml");
        janelas.abrirJanelas("FXMLPraiaGenerico.fxml", "Opção:");    
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            janelas.fecharJanelas("FXMLPraiaGenerico.fxml");
            listaTipoOrla = new ArrayList<String>();
            carregarTipoOrla();
        } catch (IOException ex) {
            System.out.println("praia janela nao pode abrir");
        }       
    }    
    
    public void carregarTipoOrla(){              
        listaTipoOrla.add("MAR ABERTO");
        listaTipoOrla.add("PEQUENAS ONDAS");
        listaTipoOrla.add("MAR ABRIGADO");
        listaTipoOrla.add("ONDAS MEDIAS");
        listaTipoOrla.add("PISCINAS NATURAIS");
        listaTipoOrla.add("ONDAS FORTES");
        obsListaTipoOrla = FXCollections.observableArrayList(listaTipoOrla);
        cbTipoOrla.setItems(obsListaTipoOrla);
    }
}
