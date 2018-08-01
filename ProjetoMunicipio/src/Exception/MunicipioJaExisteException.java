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
public class MunicipioJaExisteException extends Exception{
    
    public MunicipioJaExisteException(String msgErro){
        super(msgErro);
    }       
    
    public MunicipioJaExisteException(){
        this("ERRO: Município já Existe");
    }
    
}
