/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import Exception.AtrativoNaoExisteException;
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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
/**
 * FXML Controller class
 *
 * @author emano
 */
public class FXMLAtrativoTuristicoController implements Initializable {

    protected static Stage stageAtrativoArtificial;
    protected static Stage stageEventoProgramado;
    protected static Stage stagePraiaGenerico;
    protected static Municipio municipioEscolhido;
    protected static List<Municipio> municipios;
    protected static ObservableList<Municipio> obsListaMunicipio;            
    public static String nome;
    public static double latitude;
    public static double longitude;
    public static String estado;
    public static String site;
    public static String comoChegar;
    public static String infoContato;
    
    
    @FXML
    private RadioButton radioAtratArtificial;

    @FXML
    private ToggleGroup grupoAtrativo;

    @FXML
    private RadioButton radioEventProgramado;

    @FXML
    private RadioButton radioAtratNatural;

    @FXML
    private TextField lblNome;

    @FXML
    private TextField lblLatitude;

    @FXML
    private TextField lblLongitude;

    @FXML
    private TextField lblEstado;

    @FXML
    private TextField lblSite;

    @FXML
    private TextField lblComoChegar;
    
    @FXML
    private TextField lblInfoContato;

    @FXML
    private Label txtComoChegar;

    @FXML
    private Label txtLatitude;

    @FXML
    private Label txtLongitude;

    @FXML
    private Label txtEstado;

    @FXML
    private Label txtSite;

    @FXML
    private Label txtNome;
    
    @FXML
    private Label txtInfoContato;

    @FXML
    private Label txtInfor;
    
    @FXML
    private Button btnVoltar;

    @FXML
    private Button btnAvancar;
    
    @FXML
    private ComboBox<Municipio> cbMunicipio;

    @FXML   
    void BotaoAvancar(ActionEvent event) throws Exception {        //retirar
        boolean validar = true;                 
        nome = lblNome.getText();
        estado = lblEstado.getText();
        site = lblSite.getText();
        comoChegar = lblComoChegar.getText();
        infoContato = lblInfoContato.getText();  
        if(nome.isEmpty()){
            mudarCor(txtNome,"ATRATIVO : Digite um Atrativo",Color.RED);
            validar = false;
        }else{
            mudarCor(txtNome,"ATRATIVO :",Color.WHITE);
        }
        
        if(estado.isEmpty()){
            mudarCor(txtEstado,"LATITUDE : Digite uma Latitude",Color.RED);
            validar = false;
        }else{
            mudarCor(txtEstado,"LATITUDE :",Color.WHITE);
        }
        
        if(site.isEmpty()){
            mudarCor(txtSite,"SITE : Digite um Site",Color.RED);
            validar = false;
        }else{
             mudarCor(txtSite,"SITE :",Color.WHITE);
        }
        
        if(comoChegar.isEmpty()){
            mudarCor(txtComoChegar,"COMO CHEGAR : Digite uma Informeção",Color.RED);
            validar = false;
        }else{
            mudarCor(txtComoChegar,"COMO CHEGAR :",Color.WHITE);
        }
        
        if(infoContato.isEmpty()){
            mudarCor(txtInfoContato,"CONTATO : Digite um Contato",Color.RED);
            validar = false;
        }else{
            mudarCor(txtInfoContato,"CONTATO :",Color.WHITE);
        }
        
        try{
            mudarCor(txtLatitude,"LATITUDE :",Color.WHITE);
            latitude = Double.parseDouble(lblLatitude.getText());
        }catch(NumberFormatException erro){
            mudarCor(txtLatitude,"LATITUDE : apenas numeros",Color.RED);
            validar = false;
        }
        
        try{
            mudarCor(txtLongitude,"LONGITUDE :",Color.WHITE);
            longitude = Double.parseDouble(lblLongitude.getText());
        }catch(NumberFormatException erro){
            mudarCor(txtLongitude,"LONGITUDE : apenas numeros",Color.RED);
            validar = false;
        }
                
        if(validar){
            municipioEscolhido = cbMunicipio.getSelectionModel().getSelectedItem();   
            if(municipioEscolhido != null){
                mudarCor(txtInfor,"",Color.WHITE);
                try{                                
                    municipioEscolhido.pesquisarAtrativoTuristico(nome);
                    mudarCor(txtNome,"ATRATIVO Ja existe",Color.RED);            
                }catch(AtrativoNaoExisteException erro){            
                    RadioButton opçaoGrupoAtrativo = (RadioButton) grupoAtrativo.getSelectedToggle(); 
                    if(opçaoGrupoAtrativo.getText().equals("NATURAL")){                         
                        janelas.abrirJanelas("FXMLPraiaGenerico.fxml", "Opção:");                        
                    }else if(opçaoGrupoAtrativo.getText().equals("ARTIFICIAL")){           
                        janelas.abrirJanelas("FXMLAtrativoArtificial.fxml", "Cadastrar Atrativo Artificial");                        
                    }else if(opçaoGrupoAtrativo.getText().equals("EVENTO")){
                        janelas.abrirJanelas("FXMLEventoProgramado.fxml", "Cadastrar Evento");                       
                    }
                }
            }else{
                mudarCor(txtInfor,"SELECIONE UMA OPÇÃO",Color.RED); 
            }
        }
                       
    }

    @FXML
    void BotaoVoltar(ActionEvent event) throws IOException {
        janelas.fecharJanelas("FXMLAtrativoTuristico.fxml");
        janelas.abrirJanelas("FXMLMenu.fxml", "MENU DE OPÇÕES");       
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {         
        carregarMunicipioEscolhido();
    }    
    
    public void carregarMunicipioEscolhido(){
        municipios = areaDeInteresseTuristico.getMunicipios();      
        obsListaMunicipio = FXCollections.observableArrayList(municipios);
        cbMunicipio.setItems(obsListaMunicipio);
    }
    
    public void mudarCor(Label label,String textoInfo,Color cor){                    
        label.setText(textoInfo);      
        label.setTextFill(cor);     
    }
     
    
}
