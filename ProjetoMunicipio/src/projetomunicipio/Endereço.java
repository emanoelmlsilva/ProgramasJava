package projetomunicipio;

import java.io.Serializable;

public class Endereço implements Serializable{

    private String logradouro;
    private String numero;
    private String bairro;

    public Endereço(String logradouro,String numero,String bairro){
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
    }

    public String getLogradouro(){
        return this.logradouro;
    }

    public void setLogradouro(String logradouro){
        this.logradouro = logradouro;
    }

    public String getNumero(){
        return this.numero;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    public String getBairro(){
        return this.bairro;
    }

    public void setBairro(String bairro){
        this.bairro = bairro;
    }
    
    public String toString() {
    	return "Logradouro "+this.logradouro+" ,Numero "+this.numero+" ,Bairro "+this.bairro;
    }

}