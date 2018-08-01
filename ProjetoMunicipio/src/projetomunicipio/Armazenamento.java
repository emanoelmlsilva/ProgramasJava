/*package projetomunicipio;

import Gui.FXMLAreaDeInteresseTuristicoController;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Armazenamento {
    
    public boolean verificarAquivoExistente(){
        try{
            FileInputStream arquivo = new FileInputStream("arquivoSisTur/dados.arq");
            ObjectInputStream tranformaArqObj = new ObjectInputStream(arquivo);
            FXMLAreaDeInteresseTuristicoController.areaDeInteresseTuristico = (AreaDeInteresseTuristico) tranformaArqObj.readObject();
            System.out.println("Arquivo ja existe");
            return true;
        }catch(Exception e){
            System.out.println("Arquivo não existe");
            return false;
        }     
    }
    
    public boolean salvarCriarArquivo(AreaDeInteresseTuristico areaDeInteresseTuristico){
        try{
            FileOutputStream arquivo = new FileOutputStream ("arquivoSisTur/dados.arq");
            ObjectOutputStream tranformaArqObj = new ObjectOutputStream(arquivo);            
            tranformaArqObj.writeObject(areaDeInteresseTuristico);
            tranformaArqObj.flush();
            System.out.println("Arquivo salvo ou criado com sucesse");
            return true;
        }catch(Exception e){
            System.out.println("Arquivo");
            return false;
        }                
    }
}
*/