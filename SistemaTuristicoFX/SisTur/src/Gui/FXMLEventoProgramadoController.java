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
import Motor.Endereço;
import Motor.EventoProgramado;
import static Motor.EventoProgramado.TIPO_FESTA;
import static Motor.EventoProgramado.TIPO_FEIRA_GASTRONOMICA;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.paint.Color;

/**
 * FXML Controller class
 *
 * @author emano
 */
public class FXMLEventoProgramadoController implements Initializable {

    
    @FXML
    private Label txtDataInicio;

    @FXML
    private Label txtDataFinal;

    @FXML
    private Label txtTipo;

    @FXML
    private Label txtLogradouro;

    @FXML
    private Label txtNumero;

    @FXML
    private Label txtBairro;

    @FXML
    private RadioButton radioFesta;

    @FXML
    private ToggleGroup grupoFesta;

    @FXML
    private RadioButton radioFeiraAgricolo;

    @FXML
    private TextField lblDataInicio;

    @FXML
    private TextField lblDataFinal;

    @FXML
    private TextField lblLogradouro;

    @FXML
    private TextField lblNumero;

    @FXML
    private TextField lblBairro;

    @FXML
    private Button btnVoltar;

    @FXML
    private Button btnAvancar;

    @FXML
    void BotaoAvancar(ActionEvent event) throws IOException {   
        boolean verificar = true;
        String tipo = "";
        String dataInicio = lblDataInicio.getText();
        String dataFim = lblDataFinal.getText();
        String logradouro = lblLogradouro.getText();
        String numero = lblNumero.getText();
        String bairro = lblBairro.getText();
        if(dataInicio.isEmpty()){
            mudarCor(txtDataInicio,"DATA DE INICIO Preencha o campo",Color.RED);
            verificar = false;
        }else{
            mudarCor(txtDataInicio,"DATA DE INICIO",Color.WHITE);            
        }
        
        if(dataFim.isEmpty()){
            mudarCor(txtDataFinal,"DATA FINAL Preencha o campo",Color.RED);
            verificar = false;
        }else{
            mudarCor(txtDataFinal,"DATA FINAL",Color.WHITE);
        }
        
        if(logradouro.isEmpty()){
            mudarCor(txtLogradouro,"LOGRADOURO Preencha o campo",Color.RED);
            verificar = false;
        }else{
            mudarCor(txtLogradouro,"LOGRADOURO",Color.WHITE);
        }
            
        if(numero.isEmpty()){
            mudarCor(txtNumero,"NUMERO Preencha o campo",Color.RED);
            verificar = false;
        }else{
            mudarCor(txtNumero,"NUMERO",Color.WHITE);
        }
        
        if(bairro.isEmpty()){
            mudarCor(txtBairro,"BAIRRO Preencha o campo",Color.RED);
            verificar = false;
        }else{
            mudarCor(txtBairro,"BAIRRO",Color.WHITE);
        }
        if(verificar){
            RadioButton opcaoEvento = (RadioButton) grupoFesta.getSelectedToggle();   
            if(opcaoEvento.getText().equals("FESTA")){
                tipo = TIPO_FESTA; 
            }else{
                tipo = TIPO_FEIRA_GASTRONOMICA;
            }
            Endereço endereco = new Endereço(logradouro,numero,bairro);
            AtrativoTuristico atrativoTuristico = new EventoProgramado(nome,latitude,longitude,comoChegar,site,infoContato ,dataInicio,dataFim,tipo,endereco);                        
            try{
                areaDeInteresseTuristico.cadastrarAtrativoTuristico(atrativoTuristico,municipioEscolhido.getNome(),municipioEscolhido.getEstado());
                //armazenamento.salvarCriarArquivo(areaDeInteresseTuristico);
                armazenamento.gravarAtrativo(municipioEscolhido.getAtrativoTuristico(), municipioEscolhido.getNome());
                janelas.fecharJanelas("FXMLEventoProgramado.fxml");
                janelas.fecharJanelas("FXMLAtrativoTuristico.fxml");
                janelas.abrirJanelas("FXMLMenu.fxml", "MENU DE OPÇÕES");                      
            }catch(AtrativoJaExisteException erro){
                System.out.println(erro.getMessage());
            }catch(MunicipioNaoExisteException erro){
                System.out.println(erro.getMessage());
            }
        }                                                    
    }

    @FXML
    void BotaoVoltar(ActionEvent event) throws IOException {
        janelas.fecharJanelas("FXMLEventoProgramado.fxml");     
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void mudarCor(Label label,String texto,Color cor){
        label.setText(texto);
        label.setTextFill(cor);
    }
}
