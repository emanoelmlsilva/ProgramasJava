/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import Exception.*;
import static Gui.FXMLAtrativoTuristicoController.*;
import static Gui.SisTur.areaDeInteresseTuristico;
import static Gui.SisTur.armazenamento;
import static Gui.SisTur.janelas;
import Motor.AtrativoArtificial;
import Motor.AtrativoTuristico;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

/**
 * FXML Controller class
 *
 * @author emano
 */
public class FXMLAtrativoArtificialController implements Initializable {


    @FXML
    private TextField lblFundacao;

    @FXML
    private TextField lblFundador;

    @FXML
    private Label txtFundacao;

    @FXML
    private Label txtFundador;

    @FXML
    private Button btnAvancar;

    @FXML
    private Button btnVoltar;

    @FXML
    void BotaoAvancar(ActionEvent event) throws IOException {
        boolean verificar = true;
        String fundacao = lblFundacao.getText();
        String fundado = lblFundador.getText();
        if(fundacao.isEmpty()){
            mudarCor(txtFundacao,"FUNDAÇÃO: INFORME UMA DATA",Color.RED);
            verificar = false;
        }else{
            mudarCor(txtFundacao,"FUNDAÇÃO:",Color.WHITE);
        }
        
        if(fundado.isEmpty()){
            mudarCor(txtFundador,"FUNDADOR: INFORME UM NOME",Color.RED);
            verificar = false;
        }else{
            mudarCor(txtFundador,"FUNDADOR:",Color.WHITE);
        }
        
        if(verificar){
            AtrativoTuristico atrativoTuristico = new AtrativoArtificial(nome,latitude,longitude,site,comoChegar,infoContato,fundacao,fundado);
            try{
                areaDeInteresseTuristico.cadastrarAtrativoTuristico(atrativoTuristico,municipioEscolhido.getNome(),municipioEscolhido.getEstado());
                //armazenamento.salvarCriarArquivo(areaDeInteresseTuristico);
                armazenamento.gravarAtrativo(municipioEscolhido.getAtrativoTuristico(), municipioEscolhido.getNome());
                janelas.fecharJanelas("FXMLAtrativoArtificial.fxml");
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
        janelas.fecharJanelas("FXMLAtrativoArtificial.fxml");       
    }
    
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void mudarCor(Label label,String textoInfo,Color cor){                    
        label.setText(textoInfo);      
        label.setTextFill(cor);     
    }
    
}
