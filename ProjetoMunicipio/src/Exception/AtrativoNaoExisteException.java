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
public class AtrativoNaoExisteException extends Exception{
    
    public AtrativoNaoExisteException(String msgErro){
        super(msgErro);
    }
    
    public AtrativoNaoExisteException(){
        this("ERRO: Atrativo não Existe");
    }
}
