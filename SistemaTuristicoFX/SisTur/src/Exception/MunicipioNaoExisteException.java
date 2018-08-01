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
public class MunicipioNaoExisteException extends Exception{
    
    public MunicipioNaoExisteException(String msgErro){
        super(msgErro);
    }
    
    public MunicipioNaoExisteException(){
        this("Erro: Município não existe");
    }
}
