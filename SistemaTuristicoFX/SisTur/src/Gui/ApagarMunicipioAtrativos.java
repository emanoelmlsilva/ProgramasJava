/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import static Gui.SisTur.areaDeInteresseTuristico;
import Motor.Municipio;
import Motor.AtrativoTuristico;

/**
 *
 * @author emano
 */
public class ApagarMunicipioAtrativos {
    
    public void apagarMunicipio(Municipio Municipio){                                 
        areaDeInteresseTuristico.getMunicipios().remove(Municipio);                
    }
    
    public void apagarAtrativo(Municipio municipio,AtrativoTuristico atrativoturistico){
       municipio.getAtrativoTuristico().remove(atrativoturistico);
    }
}
