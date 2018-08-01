/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Motor;

import Exception.AtrativoJaExisteException;
import Motor.Municipio;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author emano
 */
public class TestandoClasse {   
    public static void main(String[] args) throws IOException, AtrativoJaExisteException{
        Armazenamento armazenamento = new Armazenamento();
        /*String nome = "teste1";
        int populacao = 0;
        double latitude = 0;
        double longitude = 0;
        String estado = "estado1";
        String site = "site1";
        Municipio m = new Municipio(nome,populacao,new ArrayList(),latitude,longitude,new ArrayList(),estado,site);
        List<Municipio> lista = new ArrayList<Municipio>();
        nome = "teste2";
        populacao = 1;
        latitude = 1;
        longitude = 1;
        estado = "estado2";
        site = "site2";
        Municipio m0 = new Municipio(nome,populacao,new ArrayList(),latitude,longitude,new ArrayList(),estado,site);
        lista.add(m0);
        lista.add(m);
        System.out.println(lista.size());
        armazenamento.gravarMunicipio(lista);
        System.out.println("listando");
        for(Municipio m4:lista){
           System.out.println(m4.toString());
        }
       */
       System.out.println("recuperando lista");
       List<Municipio>retornado = armazenamento.recuperarMunicipio();
       for(Municipio m2:retornado){
           System.out.println(m2.toString());
       }
       
       for(AtrativoTuristico at:armazenamento.recuperarAtrativo(retornado.get(0).getNome())){
           System.out.println(at.toString());
       }
        /*String nomeAtratTuristico = "testeAtrativo1";
        double latitudeAtratTuristico = 01;
        double longitudeAtratTuristico = 01;
        String comoChegar = "testeAtrativocomoChegar";
        String siteAtratTuristico = "testeAtrtivoSite";
        String infoContato = "testeAtrativoContato";
        AtrativoTuristico atrativo = new AtrativoNatural(nomeAtratTuristico, latitudeAtratTuristico,longitudeAtratTuristico, comoChegar, siteAtratTuristico, infoContato);
        List<AtrativoTuristico> listaAtrativo = new ArrayList();
        listaAtrativo.add(atrativo);*/
        //retornado.get(0).cadastrarAtrativoTuristico(atrativo)
        //armazenamento.gravarAtrativo(listaAtrativo, retornado.get(0).getNome());
        
    }
}
