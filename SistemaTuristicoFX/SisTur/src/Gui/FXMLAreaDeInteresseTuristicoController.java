/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import static Gui.SisTur.armazenamento;
import static Gui.SisTur.janelas;
import static Gui.SisTur.listaMunicipio;
import Motor.AreaDeInteresseTuristico;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author emano
 */
public class FXMLAreaDeInteresseTuristicoController implements Initializable {    
    //public static AreaDeInteresseTuristico areaDeInteresseTuristico; 
    protected static Stage stageMenu;   
    @FXML
    private Label txtNome;

    @FXML
    private TextField lblNome;

    @FXML
    private Button btnCadasrar;

    @FXML
    public void BotaoCadastrar(ActionEvent event) throws Exception { 
        String nome = lblNome.getText();                     
        if(!nome.equals("")){
            armazenamento.gravarAreaInteresse(nome);
            janelas.abrirJanelas("FXMLMenu.fxml", "MENU DE OPÇÕES");                       
            janelas.fecharJanelas("FXMLAreaDeInteresseTuristico.fxml");                                               
        }else{
            JOptionPane.showMessageDialog(null,"Preencha o Campo","Informeação",JOptionPane.INFORMATION_MESSAGE);        
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {                 
    }    
    
}
