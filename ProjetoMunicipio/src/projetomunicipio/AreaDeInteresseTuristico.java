package projetomunicipio;

import Exception.MunicipioJaExisteException;
import Exception.MunicipioNaoExisteException;
import java.io.Serializable;
import java.util.List;
import Exception.AtrativoJaExisteException;
import Exception.AtrativoNaoExisteException;

public class AreaDeInteresseTuristico implements Serializable {

	private List<Municipio> municipios;
	private String nome;

	public AreaDeInteresseTuristico(List<Municipio> municipios, String nome) {
		this.municipios = municipios;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Municipio> getMunicipios() {
		return this.municipios;
	}
	
	public void setMunicipios(List<Municipio> municipios) {
		this.municipios = municipios;
	}

	public void cadastrarMunicipio(Municipio mun) throws MunicipioJaExisteException {		
		for(Municipio municipio:this.municipios) {
			if(municipio.getNome().equals(mun.getNome()) && municipio.getEstado().equals(mun.getEstado())) {
				throw new MunicipioJaExisteException("município "+municipio.getNome()+"do estado "+municipio.getEstado()+" já existe");
			}
		}
		this.municipios.add(mun);		
	}	

	public Municipio pesquisarMunicipio(String nomeMunicipio,String nomeEstado) throws MunicipioNaoExisteException {
		for(Municipio m:this.municipios) {
			if(m.getNome().equals(nomeMunicipio) && m.getEstado().equals(nomeEstado)) {
				return m;				
			}
		}
		throw new MunicipioNaoExisteException("municipio "+nomeMunicipio+" não existe");			
	}
	
	public void cadastrarAtrativoTuristico(AtrativoTuristico atrativo,String nomeMunicipio,String estadoMunicipio) throws MunicipioNaoExisteException,AtrativoJaExisteException{		
		boolean encontradoM = false;			
		for(Municipio municipio:this.municipios) {					
			if(municipio.getNome().equals(nomeMunicipio) && municipio.getEstado().equals(estadoMunicipio)) {				
				municipio.cadastrarAtrativoTuristico(atrativo);					
				encontradoM = true;														 
			}
		}
		if(encontradoM == false)  {
			throw new MunicipioNaoExisteException("municipio "+nomeMunicipio+" do Estado "+estadoMunicipio+" não existe");
		}			
	}
	
	public List<AtrativoTuristico> getAtrativosTuristicosDoMunicipio(String nomeMunicipio,String estadoMunicipio) throws MunicipioNaoExisteException{
		for(Municipio municipio:this.municipios) {
			if(municipio.getNome().equals(nomeMunicipio) && municipio.getEstado().equals(estadoMunicipio)) {				
				return municipio.getAtrativoTuristico();				
			}
		}
		throw new MunicipioNaoExisteException("municipio "+nomeMunicipio+" com estado "+estadoMunicipio+" não exite");
	}

	}