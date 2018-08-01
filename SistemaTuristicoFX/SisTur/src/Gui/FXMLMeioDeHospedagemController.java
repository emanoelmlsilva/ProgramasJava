/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import static Motor.MeioDeHospedagem.*;
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
public class FXMLMeioDeHospedagemController implements Initializable {

    @FXML
    private TextField lblNome;

    @FXML
    private TextField lblLatitude;

    @FXML
    private TextField lblLongitude;

    @FXML
    private TextField lblSite;

    @FXML
    private Label txtLongitude;

    @FXML
    private Label txtLatitude;

    @FXML
    private Label txtSite;

    @FXML
    private Label txtNome;

    @FXML
    private Label txtInfoContato;

    @FXML
    private TextField lblInfoContato;

    @FXML
    private RadioButton radioHotel;

    @FXML
    private ToggleGroup grupoHospedagem;

    @FXML
    private RadioButton radioPousada;

    @FXML
    private RadioButton radioAlbergue;

    @FXML
    private Label txtLogradouro;

    @FXML
    private Label txtNumero;

    @FXML
    private Label txtBairro;

    @FXML
    private TextField lblLogradouro;

    @FXML
    private TextField lblNumero;

    @FXML
    private TextField lblBairro;

    @FXML
    private Button btnCadastrar;

    @FXML
    private Button btnVoltar;

    @FXML
    void BotaoCadastrar(ActionEvent event) {
        String tipo = "";
        boolean validar = true;
        String nome = lblNome.getText();
        String site = lblSite.getText();
        String infoContato = lblInfoContato.getText();
        String logradouro = lblLogradouro.getText();
        String numero = lblNumero.getText();
        String bairro = lblBairro.getText();
        RadioButton tipoHospedagem = (RadioButton) grupoHospedagem.getSelectedToggle();
        
        if(nome.isEmpty()){
            mudarCor(txtNome,"NOME Preencha o campo",Color.RED);
            validar = false;
        }else{
            mudarCor(txtNome,"NOME",Color.WHITE);
        }
        
        if(site.isEmpty()){
            mudarCor(txtSite,"SITE Preencha o campo",Color.RED);
            validar = false;
        }else{
            mudarCor(txtSite,"SITE",Color.WHITE);
        }
        
        if(infoContato.isEmpty()){
            mudarCor(txtInfoContato,"INFO CONTATO Preencha o campo",Color.RED);
            validar = false;
        }else{
            mudarCor(txtInfoContato,"INFO CONTATO",Color.WHITE);
        }
        
        if(logradouro.isEmpty()){
            mudarCor(txtLogradouro,"LOGRADOURO Preencha o campo",Color.RED);
            validar = false;
        }else{
            mudarCor(txtLogradouro,"LOGRADOURO",Color.WHITE);
        }
        
        if(numero.isEmpty()){
            mudarCor(txtNumero,"NUMERO Preencha o campo",Color.RED);
            validar = false;
        }else{
            mudarCor(txtNumero,"NUMERO",Color.WHITE);
        }
        
        if(bairro.isEmpty()){
            mudarCor(txtBairro,"BAIRRO Preencha o campo",Color.RED);
            validar = false;
        }else{
            mudarCor(txtBairro,"BAIRRO",Color.WHITE);
        }
        
        if(tipoHospedagem.equals("HOTEL")){
            tipo = TIPO_HOTEL;
        }else if(tipoHospedagem.equals("POUSADA")){
            tipo = TIPO_POUSADA;
        }else{
            tipo = TIPO_ALBERGUE;
        }
        
        try{
            double latitude = Double.parseDouble(lblLatitude.getText());
        }catch(NumberFormatException erro){
            mudarCor(txtLatitude,"LATITUDE Apenas numeros",Color.RED);
            validar = false;
        }
        
        try{
            double longitude = Double.parseDouble(lblLongitude.getText());
        }catch(NumberFormatException erro){
            mudarCor(txtLongitude,"LONGITUDE Apenas numeros",Color.RED);
            validar = false;
        }
        
        if(validar){
            //cadastrar meio de hospedaem
        }
        
        
    }

    @FXML
    void BotaoVoltar(ActionEvent event) {
        
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
