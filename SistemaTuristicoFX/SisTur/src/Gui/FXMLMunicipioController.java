/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import Motor.Municipio;
import Exception.MunicipioJaExisteException;
import static Gui.SisTur.areaDeInteresseTuristico;
import static Gui.SisTur.armazenamento;
import static Gui.SisTur.janelas;
import Motor.AtrativoTuristico;
import Motor.MeioDeHospedagem;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

/**
 *
 * @author emano
 */
public class FXMLMunicipioController implements Initializable {
    
    private List<MeioDeHospedagem> listaMeioDeHospedagem;
    private List<AtrativoTuristico> listaAtrativoTuristico;    
    
    @FXML
    private TextField lblNome;

    @FXML
    private TextField lblPopulacao;

    @FXML
    private TextField lblLatitude;

    @FXML
    private TextField lblLongitude;

    @FXML
    private TextField lblEstado;

    @FXML
    private TextField lblSite;
    
    @FXML
    private Label txtCadastro;

    @FXML
    private Label txtPopulacao;

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
    private Button btnVoltar;

    @FXML
    private Button btnAvancar;    
    
    @FXML
    void BotaoAvancar(ActionEvent event) throws InterruptedException, IOException { 
        boolean booCerto = true;
        int populacao = 0;
        double latitude = 0;
        double longitude = 0;                          
        String nome = lblNome.getText();
        String estado = lblEstado.getText();
        String site = lblSite.getText();    
        if(nome.isEmpty()){
            mudarCor(txtNome,"Digite um MUNICIPIO:",Color.RED);
            booCerto = false;
        }else{
            mudarCor(txtNome,"MUNICIPIO:",Color.MIDNIGHTBLUE);
        }
        
        if(estado.isEmpty()){
            mudarCor(txtEstado,"Digite um ESTADO:",Color.RED);
            booCerto = false;
        }else{
            mudarCor(txtEstado,"ESTADO:",Color.MIDNIGHTBLUE);
        }
        
        if(site.isEmpty()){
            mudarCor(txtSite,"Digite um SITE:",Color.RED);
            booCerto = false;
        }else{
           mudarCor(txtSite,"SITE:",Color.MIDNIGHTBLUE); 
        }
        try{                                   
            populacao = Integer.parseInt(lblPopulacao.getText());                           
            mudarCor(txtPopulacao,"POPULAÇÃO:",Color.MIDNIGHTBLUE);
        }catch(NumberFormatException numErro){           
           mudarCor(txtPopulacao,"Informe apenas numeros POPULAÇÃO:",Color.RED);
           booCerto = false;
        }         
        
        try{            
            mudarCor(txtLatitude,"LATITUDE:",Color.MIDNIGHTBLUE);
            latitude = Double.parseDouble(lblLatitude.getText());            
        }catch(NumberFormatException numErro){           
            mudarCor(txtLatitude,"Informe apenas numeros LATITUDE:",Color.RED); 
            booCerto = false;

        }   
        
        try{            
            mudarCor(txtLongitude,"LONGITUDE:",Color.MIDNIGHTBLUE);
            longitude = Double.parseDouble(lblLongitude.getText()); 
        }catch(NumberFormatException numErro){            
            mudarCor(txtLongitude,"Informe apenas numeros LONGITUDE:",Color.RED); 
            booCerto = false;

        }                
        if(booCerto){         
            mudarCor(txtNome,"MUNICIPIO:",Color.MIDNIGHTBLUE);                        
            mudarCor(txtPopulacao,"POPULAÇÃO:",Color.MIDNIGHTBLUE);
            mudarCor(txtLatitude,"LATITUDE:",Color.MIDNIGHTBLUE);
            mudarCor(txtLongitude,"LONGITUDE:",Color.MIDNIGHTBLUE);   
            Municipio municipios = new Municipio(nome,populacao,listaAtrativoTuristico,latitude,longitude,listaMeioDeHospedagem,estado,site);            
            try{                                                         
               areaDeInteresseTuristico.cadastrarMunicipio(municipios);                                     
               //armazenamento.salvarCriarArquivo(areaDeInteresseTuristico);  
               armazenamento.gravarMunicipio(areaDeInteresseTuristico.getMunicipios());
               //txtCadastro.setText("Cadastro realizado com sucesso");                                  
               //Thread.currentThread().sleep(1000);
               janelas.fecharJanelas("FXMLMunicipio.fxml");
               janelas.abrirJanelas("FXMLMenu.fxml", "MENU DE OPÇÕES");            
             }catch(MunicipioJaExisteException e){               
               mudarCor(txtNome,"já existe MUNICIPIO:",Color.RED);                 
            }  
        }                         
    }

    @FXML
    void BotaoVoltar(ActionEvent event) throws IOException {
        janelas.fecharJanelas("FXMLMunicipio.fxml");
        janelas.abrirJanelas("FXMLMenu.fxml", "MENU DE OPÇÕES");        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {         
        listaMeioDeHospedagem = new ArrayList<MeioDeHospedagem>();
        listaAtrativoTuristico = new ArrayList<AtrativoTuristico>();
    }    
    
    public void mudarCor(Label label,String textoInfo,Color cor){                    
        label.setText(textoInfo);      
        label.setTextFill(cor);     
    }
}
