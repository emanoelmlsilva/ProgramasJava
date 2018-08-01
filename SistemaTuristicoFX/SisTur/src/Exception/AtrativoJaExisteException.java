/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

/**
 *
 * @author emano
 */
public class AtrativoJaExisteException extends Exception {
    
    public AtrativoJaExisteException(String msgErro){
        super(msgErro);
    }
    
    public AtrativoJaExisteException(){
        this("Erro: Atrativo já existe");
    }
}
